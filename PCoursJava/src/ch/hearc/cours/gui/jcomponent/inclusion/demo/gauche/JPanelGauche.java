
package ch.hearc.cours.gui.jcomponent.inclusion.demo.gauche;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class JPanelGauche extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelGauche()
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
		jPanelLogo = new JPanelLogo();



		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);
			}

		// JComponent : add
		add(jPanelLogo, BorderLayout.CENTER);
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
	private JPanelLogo jPanelLogo;

	}
