
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

	public synchronized void nextState()
		{
		currentState.next(this);
		}

	public synchronized void SetState(Statement_I state)
		{
		currentState.leave();
		currentState = state;
		}
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

	private Statement_I currentState;

	private static ChatManager INSTANCE;
	}

