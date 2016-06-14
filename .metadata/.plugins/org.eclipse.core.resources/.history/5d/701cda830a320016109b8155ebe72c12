
package ch.hearc.cours.gui.layout.avec.boxlayout.optimal;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class BoxVertical extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public BoxVertical()
		{
		super(BoxLayout.Y_AXIS);

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

	private void geometry()
		{
		// JComponent : Instanciation
		button1 = new JButton("Button 10");
		button2 = new JButton("Button 20");
		button3 = new JButton("Button 30");

		// JComponent : add
		add(Box.createVerticalStrut(5));
		add(button1);
		add(Box.createVerticalGlue());
		add(button2);
		add(Box.createVerticalGlue());
		add(Box.createVerticalGlue());
		add(button3);
		add(Box.createVerticalStrut(5));
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		//Debug
			{
			setBackground(Color.BLACK);
			setOpaque(true);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools

	private JButton button1;
	private JButton button2;
	private JButton button3;

	}
