
package ch.hearc.cours.gui.java2d.repere.polygone;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class JPanelPolygone extends JPanel
	{


	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelPolygone(int n)
		{
		// Inputs
			{
			this.n = n;
			}

		// Tools
			{
			this.alpha = Math.PI * 2 / n;
			this.coter=50; //disons
			line=new Line2D.Double(0,0,0,coter);
			}
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



	private void draw(Graphics2D g2d)
		{
		centrer(g2d);
		drawConference(g2d);
		}

	private void drawConference(Graphics2D g2d)
		{
		for(int i = 0; i < n; i++)
			{
			g2d.draw(line);
			g2d.translate(0, coter);
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

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Input
	private int n;

	// Tools
	private double alpha;
	private int coter;
	private Line2D line;

	}
