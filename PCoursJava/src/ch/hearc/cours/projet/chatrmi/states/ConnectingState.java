
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.PcChat;
import ch.hearc.cours.projet.chatrmi.tools.JFrameSplashScreen;


public class ConnectingState implements Statement_I
	{

	@Override
	public void enter()
		{
		splashScreen = new JFrameSplashScreen("Try to Connect");

		System.out.println("[ConnectingState] enter");
		PcChat pcChat = PcChat.getInstance();

 		Thread chatThread = new Thread(pcChat);
		chatThread.start();

		}

	@Override
	public void next(ChatManager chatManager)
		{
		chatManager.SetState(new LoadingChatState());

		}

	@Override
	public void leave()
		{
		System.out.println("[ConnectingState] leave");
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

