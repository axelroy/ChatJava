
package ch.hearc.cours.gui.java2d.bouton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;

public class JButtonDessin extends JButton
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JButtonDessin(JPanelBouton2D jPanel)
		{
		super("Bouton");
		this.jPanel = jPanel;

		cercle = new Ellipse2D.Double(5, 5, 20, 20);

		controle();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		AffineTransform tranform = g2d.getTransform();
		draw(g2d);
		g2d.setTransform(tranform);
		}

	private void draw(Graphics2D g2d)
		{
		g2d.setColor(Color.RED);
		g2d.fill(cercle);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void controle()
		{
		addMouseListener(new MyMouseAdapter()
		//addMouseListener(new MouseAdapter()
			{

			@Override
			public void mouseClicked(MouseEvent e)
				{
				Point p = e.getPoint();
				if (cercle.contains(p))
					{
					jPanel.remove(JButtonDessin.this);
					jPanel.validate(); // force les layouts à recalculer
					jPanel.repaint();
					}
				}
			});

		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Input
	private JPanelBouton2D jPanel;

	// Tools:
	private Ellipse2D cercle;
	}
