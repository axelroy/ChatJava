
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.tools.JFrameReconnection;


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
		jFrameReconnection.dispose();

		}

	@Override
	public void enter()
		{
		System.out.println("[ReconnectionState] enter");

		jFrameReconnection = new JFrameReconnection();

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

	private JFrameReconnection jFrameReconnection;
	}

