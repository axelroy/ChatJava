
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.gui.chatframe.JFrameChat;


public class LoadingChatState implements Statement_I
	{

	public LoadingChatState()
		{
		System.out.println("[LoadingChatState] enter");
		new JFrameChat();
		// TODO Splashscreen
		}

	@Override
	public void next(ChatManager chatManager)
		{
		chatManager.SetState(new RunningChatState());

		}

	@Override
	public void leave()
		{
		// TODO close Splashscreen

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

