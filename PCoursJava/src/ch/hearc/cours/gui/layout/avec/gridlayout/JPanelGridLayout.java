
package ch.hearc.cours.gui.layout.avec.gridlayout;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelGridLayout extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelGridLayout()
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
			GridLayout layout = new GridLayout(3,1);
			setLayout(layout);

			layout.setHgap(10);
			layout.setVgap(10);
			}

		// JComponent : add
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
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
