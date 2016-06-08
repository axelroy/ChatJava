
package ch.hearc.cours.gui.java2d.hello;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class JPanelJava2dHello extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelJava2dHello()
		{
		rectangle = new Rectangle2D.Double(125, 136, 100, 100); // x, y, w, h
		rectangle2 = new Rectangle2D.Double(200, 50, 123, 56); // x, y, w, h
		ligne = new Line2D.Double(0, 155, 500, 65); // x1, y1, x2, Y2
		ellipse = new Ellipse2D.Double(50, 50, 100, 200); // x0, y0, dx, dy
		arc = new Arc2D.Double(300, 300, 100, 100, 0, 270, Arc2D.PIE); // x, y, w, h, alphaStart°, alphaStop°, attribut de fermeture
		texte = new String("Coucou from Poulettes");
		couleur = new Color(0, 0, 255);
		couleur2 = new Color(0, 0, 0);
		couleur3 = new Color(0, 255, 0);
		font = new Font("Helvetica", Font.BOLD + Font.ITALIC, 30);
		texteGradient = new String("Texte gradient");

		// GradientPaint
			{
			Color color1 = Color.BLUE;
			Color color2 = Color.RED;
			Point2D p1 = new Point2D.Double(0, 0);
			Point2D p2 = new Point2D.Double(200, 200);
			gradient = new GradientPaint(p1, color1, p2, color2);
			}

		stroke1 = new BasicStroke(25, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

		// stroke2
			{
			float[] tabMotifCycle = new float[2];
			tabMotifCycle[0] = 10;
			tabMotifCycle[1] = 9;
			stroke2 = new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, tabMotifCycle, 0);
			}

		carre = new Rectangle2D.Double(0, 0, 100, 100);
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
		g2d.setColor(couleur);

		g2d.draw(rectangle);
		g2d.draw(ellipse);

		g2d.setColor(couleur2);
		g2d.setStroke(stroke2);

		g2d.draw(rectangle2);
		g2d.draw(ligne);

		g2d.setColor(couleur3);

		g2d.fill(arc);

		g2d.setColor(Color.PINK);

		g2d.setFont(font);
		g2d.drawString(texte, 100, 200);

		g2d.setPaint(gradient);

		g2d.drawString(texteGradient, 50, 50);

		g2d.translate(100, 100);

		g2d.fill(carre);

		g2d.translate(100, 100);

		g2d.fill(carre);

		g2d.setColor(couleur2);
		g2d.drawString(texteGradient, 0, 0);

		g2d.scale(-1, -1);

		g2d.drawString(texteGradient, 0, 0);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Rectangle2D rectangle;
	private Rectangle2D rectangle2;
	private Line2D ligne;
	private Ellipse2D ellipse;
	private Arc2D arc;
	private Color couleur;
	private Color couleur2;
	private Color couleur3;
	private String texte;
	private String texteGradient;
	private Font font;
	private GradientPaint gradient;
	private Stroke stroke1;
	private Stroke stroke2;
	private Rectangle2D carre;

	}
