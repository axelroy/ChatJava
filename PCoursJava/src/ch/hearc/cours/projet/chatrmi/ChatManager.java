
package ch.hearc.cours.projet.chatrmi;

import ch.hearc.cours.projet.chatrmi.states.ConnectionState;
import ch.hearc.cours.projet.chatrmi.states.Statement_I;

public class ChatManager
	{


	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/
	private ChatManager()
		{
		currentState = new ConnectionState();
		currentState.enter();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public synchronized static ChatManager getInstance()
		{
		if (INSTANCE == null)
			{
			INSTANCE = new ChatManager();
			}
		return INSTANCE;
		}


	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public synchronized void SetState(Statement_I state)
		{
		currentState.leave();
		currentState = state;
		currentState.enter();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Statement_I getCurrentState()
		{
		return currentState;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private Statement_I currentState;

	private static ChatManager INSTANCE;
	}
