
package ch.hearc.cours.gui.layout.avec.borderlayout;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelBorderLayout extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelBorderLayout()
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
		label1 = new JLabel("Label 1");
		label2 = new JLabel("Label 2");
		label3 = new JLabel("Label 3");
		label4 = new JLabel("Label 4");
		label5 = new JLabel("Label 5");

		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);

			layout.setHgap(10);
			layout.setVgap(10);
			}

		// JComponent : add
		add(label1, BorderLayout.NORTH);
		add(label2, BorderLayout.EAST);
		add(label3, BorderLayout.SOUTH);
		add(label4, BorderLayout.WEST);
		add(label5, BorderLayout.CENTER);
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
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;

	}
