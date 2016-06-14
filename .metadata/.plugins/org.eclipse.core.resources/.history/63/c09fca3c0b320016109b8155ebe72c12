
package ch.hearc.cours.gui.java2d.images.create.hsb.bouton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.Timer;

public class JButtonHSB extends JButton
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JButtonHSB(String titre)
		{
		super(titre);
		delayMs = 100;
		geometry();
		control();
		appearance();
		animate();
		}

	private void animate()
		{
		timer = new Timer(delayMs, new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent arg0)
				{
				animationStep();
				}

			});
		timer.start();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

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

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D)g;
		AffineTransform memTransform = g2d.getTransform();
		draw(g2d);
		g2d.setTransform(memTransform);
		}

	private void animationStep()
		{
		offset -= 1 / (float)getHeight();
		createImage();
		repaint();
		}

	private void draw(Graphics2D g2d)
		{
		if (bufferedImage != null)
			{
			g2d.drawImage(bufferedImage, 0, 0, null);
			}
		}

	private void control()
		{
		addComponentListener(new ComponentAdapter()
			{

			@Override
			public void componentResized(ComponentEvent e)
				{
				createImage();
				}
			});
		}

	private void appearance()
		{
		// rien
		}

	private void createImage()
		{
		bufferedImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);

		for(int i = 0; i < getHeight(); i++)
			{
			for(int j = 0; j < getWidth(); j++)
				{
				int colorIJ = colorIJ(i, j);
				bufferedImage.setRGB(j, i, colorIJ);
				}
			}

		}

	private int colorIJ(int i, int j)
		{
		float h01 = i / (float)getHeight();

		return Color.HSBtoRGB(h01 + offset, 1, 1);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private BufferedImage bufferedImage;
	private float offset;
	private Timer timer;
	private int delayMs;

	}
