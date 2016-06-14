
package ch.hearc.cours.gui.layout.sans.hello;

import javax.swing.JFrame;

public class JFrameWithoutLayou extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameWithoutLayou()
		{
		controle();
		geometrie();
		apparence();
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

	private void geometrie()
		{
		panelSansLayout = new JPanelWithoutLayout();
		this.add(panelSansLayout);
		}

	private void controle()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	private void apparence()
		{
		setSize(360, 220);
		setLocationRelativeTo(null);//Centre automatiquement la fenêtre
		setVisible(true);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//TOOLS
	private JPanelWithoutLayout panelSansLayout;
	}
