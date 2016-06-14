
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;


public class ReconnectionState implements Statement_I
	{

	@Override
	public void next(ChatManager chatManager)
		{
		// TODO Auto-generated method stub

		}

	@Override
	public void leave()
		{
		// TODO close message box

		}

	@Override
	public void enter()
		{
		System.out.println("[ReconnectionState] enter");

		//TODO luch message box yes no

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
	}

