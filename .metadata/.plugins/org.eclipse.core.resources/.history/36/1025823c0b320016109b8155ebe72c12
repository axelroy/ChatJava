
package ch.hearc.cours.gui.layout.combinaison.hello;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelDroite extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelDroite()
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

	private void geometry()
		{
		// JComponent : Instanciation
		button1 = new JButton("button 1");
		button2 = new JButton("button 2");
		button3 = new JButton("button 3");
		button4 = new JButton("button 4");

		// Layout : Specification
			{
			GridLayout layout = new GridLayout(2, 2);
			setLayout(layout);

			layout.setHgap(15);
			layout.setVgap(15);
			}

		// JComponent : add
		add(button1);
		for(int i = 0; i < 2; i++){
			add(new JPanelEmpty());
		}
		add(button4);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		button1.setMaximumSize(new Dimension(10, 10));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	}
