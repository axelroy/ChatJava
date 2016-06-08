
package ch.hearc.cours.gui.jcomponent.inclusion;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelInclusion extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelInclusion()
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
		boutonExterne = new JButton("Externe");
		boutonInterne = new JButton("Interne");
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);
		add(boutonExterne);
		boutonExterne.add(boutonInterne);
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
	private JButton boutonExterne;
	private JButton boutonInterne;

	}
