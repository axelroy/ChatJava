
package ch.hearc.cours.gui.layout.avec.boxlayout.naif;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelBoxLayout extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelBoxLayout()
		{
		geometry();
		control();
		appearance();
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
		boxv = Box.createVerticalBox();

		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");

		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);

			//layout.setHgap(10);
			//layout.setVgap(10);
			}

		// JComponent : add
		boxv.add(Box.createVerticalStrut(5));
		boxv.add(button1);
		boxv.add(Box.createVerticalGlue());
		boxv.add(button2);
		boxv.add(Box.createVerticalGlue());
		boxv.add(Box.createVerticalGlue());
		boxv.add(button3);
		boxv.add(Box.createVerticalStrut(5));

		add(boxv, BorderLayout.CENTER);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		//Debug
			{
			boxv.setBackground(Color.BLACK);
			boxv.setOpaque(true);
			setBackground(Color.yellow);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Box boxv;

	private JButton button1;
	private JButton button2;
	private JButton button3;

	}
