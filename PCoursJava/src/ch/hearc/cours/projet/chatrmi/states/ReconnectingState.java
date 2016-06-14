
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.PcChat;

public class ReconnectingState implements Statement_I
	{
	@Override
	public void next(ChatManager chatManager)
		{
		chatManager.SetState(new RunningChatState());
		}

	@Override
	public void leave()
		{
		// TODO Auto-generated method stub

		}

	@Override
	public void enter()
		{
		System.out.println("[ReconnectingState] enter");

		PcChat.getInstance().reconnect();
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
