
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
		splashScreen = new JFrameSplashScreen("Loading chat");
		JFrameChat jFrameChat = new JFrameChat();

		while(!jFrameChat.isEnabled())
			{
			try
				{
				Thread.sleep(30);
				}
			catch (InterruptedException e)
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}

		ChatManager chatManger = ChatManager.getInstance();
		chatManger.SetState(new RunningChatState());

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

