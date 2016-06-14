
package ch.hearc.cours.projet.chatrmi.states;

public class RunningChatState implements Statement_I
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void leave()
		{
		// no action

		}


	@Override
	public void enter()
		{
		System.out.println("[RunningChatState] enter");
		// no action that could be a connection check every 2 second for example
		}

	}

