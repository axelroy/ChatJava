
package ch.hearc.cours.gui.layout.sans.animation;

import javax.swing.JFrame;

public class JFrameCercle extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameCercle(int n)
		{
		controle();
		geometrie(n);
		apparence();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometrie(int n)
		{
		panelSansLayout = new JPanelCercle(n/*, this*/);
		this.add(panelSansLayout); // Le panel va prendre toute la place
		}

	private void controle()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	private void apparence()
		{
		setSize(800, 800);
		setLocationRelativeTo(null);//Centre automatiquement la fenêtre
		setVisible(true);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//TOOLS
	private JPanelCercle panelSansLayout;
	}
