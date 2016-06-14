
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.gui.connexionframe.JFrameConnexion;


public class ConnectionState implements Statement_I
	{

	@Override
	public void enter()
		{
		System.out.println("[ConnectionState] enter");
		frameConnexion = new JFrameConnexion();
		}


	@Override
	public void leave()
		{
		System.out.println("[ConnectionState] Leave");
		frameConnexion.dispose();
		}

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

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


	private JFrameConnexion frameConnexion;


	}

