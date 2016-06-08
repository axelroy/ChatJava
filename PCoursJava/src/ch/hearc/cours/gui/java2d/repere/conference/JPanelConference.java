
package ch.hearc.cours.gui.java2d.repere.conference;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class JPanelConference extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelConference(int n)
		{
		// Inputs
			{
			this.n = n;
			}

		// Tools
			{
			this.alpha = Math.PI * 2 / n;

			int w = 75; // disons
			int h = 30; // disons
			this.rectangle = new Rectangle2D.Double(-w / 2, h / 2, w, h); // x, y, w, h // 1 seul instance!!

			thetaAnimation = 0;
			dThetaAnimation = 2 * Math.PI / 1000;
			}

		control();
		animate();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		AffineTransform transformInitial = g2d.getTransform();
		draw(g2d);
		g2d.setTransform(transformInitial);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void animate()
		{
		final int delayMS = 10;//ms

		//v1 bad: car gele de l'interface utilisateur pandant la durer de la
		//m�thode actionperforme
		//			{
		//			Timer timer = new Timer(delayMS, new ActionListener()
		//				{
		//
		//				@Override
		//				public void actionPerformed(ActionEvent e)
		//					{
		//					work();
		//					}
		//				});
		//			timer.start();
		//			}

		//v2
		//			{
		//			java.util.Timer timer = new java.util.Timer();
		//			timer.scheduleAtFixedRate(new TimerTask()
		//				{
		//
		//				@Override
		//				public void run()
		//					{
		//					work();
		//					}
		//				}, 0, delayMS);
		//			}

		//v3
			{
			Thread thread = new Thread(new Runnable()
				{


				@Override
				public void run()
					{
					boolean isFini = false;
					while(!isFini)
						{
						work();
						dormir(delayMS);
						}
					}
				});
			thread.start();
			}
		}

	private void work()
		{
		//System.out.println(Thread.currentThread().getName());

		// calcul long
//			{
//			long delayMS = 5000;
//			simulationCalculLong(delayMS);
//			}

		// Animation
			{
			thetaAnimation += dThetaAnimation;
			}

		//v1
		repaint();

		//v2
		//JPanelConference.this.repaint();
		}

	/**
	 * simulation du bloquage du GUI : dans la v2 ne bloque pas. mais bloque dans la v1
	 * (fermeture de la fenetre, rendimentionnement, repaint)
	 */
	private void simulationCalculLong(long delayMS)
		{
		dormir(delayMS);
		}

	private void control()
		{
		addComponentListener(new ComponentAdapter()
			{


			@Override
			public void componentResized(ComponentEvent e)
				{
				//v1
				//int w = JPanelConference.this.getWidth();
				//int h = JPanelConference.this.getHeight();

				//v2
				int w = getWidth();
				int h = getHeight();

				r = Math.min(w, h) / 4; // disons
				}

			});

		}

	private void draw(Graphics2D g2d)
		{
		centrer(g2d);
		g2d.rotate(thetaAnimation);
		drawConference(g2d);
		}

	private void drawConference(Graphics2D g2d)
		{
		for(int i = 0; i < n; i++)
			{
			g2d.translate(0, r);
			g2d.draw(rectangle);
			g2d.translate(0, -r);
			g2d.rotate(alpha);
			}
		}

	private void centrer(Graphics2D g2d)
		{
		int w = this.getWidth();
		int h = this.getHeight();

		g2d.translate(w / 2, h / 2);
		g2d.scale(1, -1);
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static void dormir(long delayMS)
		{
		try
			{
			Thread.sleep(delayMS);
			}
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Input
	private int n;

	// Tools
	private Rectangle2D rectangle;
	private int r;
	private double alpha;
	private double thetaAnimation;
	private double dThetaAnimation;

	}
