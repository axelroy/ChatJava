
package ch.hearc.cours.gui.java2d.bouton;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class JPanelBouton2D extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelBouton2D()
		{
		jbouton = new JButtonDessin(this);
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		this.setLayout(layout);
		this.add(jbouton);
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

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	// Tool
	private JButtonDessin jbouton;

	}
