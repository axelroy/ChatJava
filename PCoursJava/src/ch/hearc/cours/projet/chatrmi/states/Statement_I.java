
package ch.hearc.cours.projet.chatrmi.states;

import ch.hearc.cours.projet.chatrmi.ChatManager;

public interface Statement_I
	{
	public void next(ChatManager chatManager);
	public void leave();
	public void enter();
	}

