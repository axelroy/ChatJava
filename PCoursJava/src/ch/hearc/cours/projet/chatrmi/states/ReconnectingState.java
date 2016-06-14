
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.PcChat;
import ch.hearc.cours.projet.chatrmi.tools.JFrameSplashScreen;

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
		splashScreen.dispose();

		}

	@Override
	public void enter()
		{
		System.out.println("[ReconnectingState] enter");
		splashScreen = new JFrameSplashScreen("Reconection attempt");



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
	private JFrameSplashScreen splashScreen;

	}
