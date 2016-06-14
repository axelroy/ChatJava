
package ch.hearc.cours.projet.chatrmi.states;

import java.awt.SplashScreen;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.PcChat;


public class ConnectingState implements Statement_I
	{
	public ConnectingState()
		{
		System.out.println("[ConnectingState] enter");
		PcChat pcChat = PcChat.getInstance();

 		Thread chatThread = new Thread(pcChat);
		chatThread.start();

		// TODO Splashscreen
		}


	@Override
	public void next(ChatManager chatManager)
		{
		chatManager.SetState(new LoadingChatState());

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

	private SplashScreen splashScreen;

	}

