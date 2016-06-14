
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.gui.chatframe.JFrameChat;
import ch.hearc.cours.projet.chatrmi.tools.JFrameSplashScreen;


public class LoadingChatState implements Statement_I
	{

	@Override
	public void enter()
		{
		System.out.println("[LoadingChatState] enter");
		new JFrameChat();
		splashScreen = new JFrameSplashScreen("Loading chat");
		}

	@Override
	public void next(ChatManager chatManager)
		{
		chatManager.SetState(new RunningChatState());

		}

	@Override
	public void leave()
		{
		System.out.println("[LoadingChatState] Leave");
		splashScreen.dispose();

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
	private JFrameSplashScreen splashScreen;
	}

