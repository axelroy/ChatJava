
package ch.hearc.cours.projet.gui.chat.input;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelInput extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelInput()
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
		jButton = new JButton("Envoyer");
		jTextField = new JTextField();

		Box box = Box.createHorizontalBox();
		// Layout : Specification
		box.add(jTextField);
		Box.createGlue();
		box.add(jButton);

			{
			BorderLayout borderLayout = new BorderLayout();
			setLayout(borderLayout);
			}

		add(box, BorderLayout.CENTER);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JButton jButton;
	private JTextField jTextField;

	}
