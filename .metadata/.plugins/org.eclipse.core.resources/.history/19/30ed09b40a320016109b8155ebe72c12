
package ch.hearc.cours.gui.layout.combinaison.hello;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelCombinaisonHello extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelCombinaisonHello()
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
		textfield = new JTextField();
		jpanelcontrole = new JPanelControle();
		jpanelgauche = new JPanelGauche();
		jpaneldroite = new JPanelDroite();

		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);

			layout.setHgap(0);
			layout.setVgap(0);
			}

		// JComponent : add
		add(jpanelcontrole, BorderLayout.NORTH);
		add(textfield, BorderLayout.CENTER);
		add(jpanelgauche, BorderLayout.WEST);
		add(jpaneldroite, BorderLayout.EAST);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		//Debug
			{
			jpanelcontrole.setBackground(Color.BLACK);
			jpanelgauche.setBackground(Color.MAGENTA);
			jpaneldroite.setBackground(Color.PINK);
			textfield.setBackground(Color.BLUE);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JPanelControle jpanelcontrole;
	private JPanelGauche jpanelgauche;
	private JPanelDroite jpaneldroite;
	private JTextField textfield;

	}
