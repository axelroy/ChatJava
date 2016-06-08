
package ch.hearc.cours.gui.java2d.images.create.gray;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelCreate extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelCreate()
		{
		delayMs = 50;
		offset = 0;

		geometry();
		control();
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

	private synchronized void startAnimation()
		{
		isFini = new AtomicBoolean(false);
		thread = new Thread(new Runnable()
			{

			@Override
			public void run()
				{

				while(!isFini.get())
					{
					animationStep();
					fillImage(getWidth(), getHeight());
					repaint();
					dormir(delayMs);
					}

				}

			});
		thread.start();
		}

	private synchronized void stopAnimation()
		{
		// provoque la sortie de la boucle du thread d'animation
		// mort "naturelle"
		isFini.set(true);
		thread.stop();
		}

	private void animationStep()
		{
		offset += 1;
		//System.out.println("animation step " + offset);

		}

	private void draw(Graphics2D g2d)
		{
		// null parceque image en mémoire
		// si l'image était chargée, il faudrait passer un observer
		// en quatrième paramètre
		g2d.drawImage(image, 0, 0, null);
		}

	private void geometry()
		{
		// JComponent : Instanciation
		boutonStart = new JButton("Start");
		boutonStop = new JButton("Stop");

		boutonStart.setEnabled(true);
		boutonStop.setEnabled(false);

		// Layout : Specification
			{
			FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
			setLayout(flowlayout);
			}

		// JComponent : add
		add(boutonStart);
		add(boutonStop);
		}

	private void control()
		{
		addComponentListener(new ComponentAdapter()
			{

			@Override
			public void componentResized(ComponentEvent e)
				{
				//System.out.println("componentResized");

				int w = getWidth();
				int h = getHeight();
				if (thread != null && thread.isAlive())
					{
					stopAnimation();
					create(w, h);
					startAnimation();
					}
				else
					{
					create(w, h);
					}
				}

			});
		boutonStart.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				// TODO Auto-generated method stub
				//System.out.println("Start");
				startAnimation();
				inverserEtatBouton();
				}

			});
		boutonStop.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				// TODO Auto-generated method stub
				//System.out.println("Stop");
				stopAnimation();
				inverserEtatBouton();
				}

			});
		}

	private void create(int w, int h)
		{

		bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		fillImage(w, h);

		}

	private void fillImage(int w, int h)
		{
		if (bufferedImage != null)
			{
			// boucle des lignes
			for(int i = 0; i < h; i++)
				{
				// boucle des colonnes
				for(int j = 0; j < w; j++)
					{
					int colorIJ = colorIJ(i + offset, j);
					bufferedImage.setRGB(j, i, colorIJ);
					}
				}
			ImageIcon imageIcon = new ImageIcon(bufferedImage);
			image = imageIcon.getImage();
			}
		}

	private int colorIJ(int i, int j)
		{
		int grayLevel = i % 255;

		Color color = new Color(grayLevel, grayLevel, grayLevel);
		return color.getRGB();
		//return Color.BLUE.getRGB();
		}

	private void inverserEtatBouton()
		{
		boutonStart.setEnabled(!boutonStart.isEnabled());
		boutonStop.setEnabled(!boutonStop.isEnabled());
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	static private void dormir(int delayMs)
		{
		try
			{
			Thread.sleep(delayMs);
			}
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private int delayMs;
	private BufferedImage bufferedImage;
	private Image image;
	private int offset;
	private JButton boutonStart;
	private JButton boutonStop;
	private Thread thread;
	//	private boolean isFini;
	private AtomicBoolean isFini;
	}
