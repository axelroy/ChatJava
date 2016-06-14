
package ch.hearc.cours.gui.jcomponent.inclusion.demo.gauche;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

import ch.hearc.cours.gui.java2d.images.tools.MagasinImage;

public class JPanelLogo extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelLogo()
		{
		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
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

	private void draw(Graphics2D g2d)
		{

		int xImage = MagasinImage.HeArc.getIconWidth();
		int yImage = MagasinImage.HeArc.getIconHeight();
		double xPanel = this.getWidth();
		double yPanel = this.getHeight();

		double scaleX = xPanel / xImage;
		double scaleY = yPanel / yImage;
		double scale = Math.min(scaleX, scaleY);

		g2d.translate(xPanel / 2, yPanel / 2);
		g2d.scale(scale, scale);

		g2d.drawImage(MagasinImage.HeArc.getImage(), (-xImage / 2), (-yImage / 2), null);
		}

	private void geometry()
		{
		// JComponent : Instanciation

		// Layout : Specification
			{
			FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
			setLayout(flowlayout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}

		// JComponent : add

		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools

	}
