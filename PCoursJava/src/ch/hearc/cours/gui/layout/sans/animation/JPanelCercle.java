
package ch.hearc.cours.gui.layout.sans.animation;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import ch.hearc.cours.gui.java2d.images.create.hsb.bouton.JButtonHSB;
import ch.hearc.cours.moo.doublerepresentation.Complex;

public class JPanelCercle extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelCercle(int n /*, JFrame jframe*/)
		{
		this.n = n;
		//this.jframe = jframe;

		geometrie();
		controle();
		apparence();

		animer();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void animer()
		{
		int dtms = 1;
		final double dAlphaInit = 2 * Math.PI / 2500;
		Timer timer = new Timer(dtms, new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				//System.out.println(Thread.currentThread().getName());
				alphaInit += dAlphaInit;
				updatePosition();
				repaint(); // Méthode pas immédiate, asynchrone poste dans la file d'attente du Thread AWTQEVENT une action de refresh du Jpanel
				}

			});
		timer.start();

		}

	private void apparence()
		{
		//RIEN
		}

	private void controle()
		{
		addComponentListener(new ComponentAdapter()
			{

			@Override
			public void componentResized(ComponentEvent e)
				{
				updatePosition();
				}

			});

		// click bouton
			{
			ActionListener actionListener = new ActionListener()
				{

				@Override
				public void actionPerformed(ActionEvent e)
					{
					JButton bouton = (JButton)e.getSource();
					//jframe.setTitle("" + bouton.getLocation());
					}
				};

			for(int i = 0; i < n; i++)
				{
				tabBouton[i].addActionListener(actionListener);
				}
			}

		}

	private void geometrie()
		{
		setLayout(null);

		tabBouton = new JButtonHSB[n];
		for(int i = 0; i < n; i++)
			{
			tabBouton[i] = new JButtonHSB("" + i);

			tabBouton[i].setSize(50, 50); // disons
			add(tabBouton[i]);
			}

		//updatePosition(); // sert à rien, car jpanel n'a pas encore de size
		}

	private void updatePosition()
		{
		int w = this.getWidth();
		int h = this.getHeight();
		int r = Math.min(w, h) / 3; // par exemple

		double alphai = alphaInit;// alphaInit est le paramètre d'animation, en le bougeant, les boutons tournent
		double dalpha = Math.PI * 2 / n;
		Complex centre = new Complex(w / (double)2, h / (double)2);

		for(int i = 0; i < n; i++)
			{
			Complex ci = Complex.createPolar(r, alphai);
			Point pi = toPoint(centre.add(ci));
			tabBouton[i].setLocation(pi);

			alphai += dalpha;
			}

		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Point toPoint(Complex c)
		{
		return new Point((int)c.getRe(), (int)c.getIm());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Input
	private int n;
	//private JFrame jframe;

	// Tools
	private JButtonHSB[] tabBouton;
	private double alphaInit;

	}
