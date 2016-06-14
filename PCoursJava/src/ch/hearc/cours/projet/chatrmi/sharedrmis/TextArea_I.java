
package ch.hearc.cours.projet.chatrmi.sharedrmis;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TextArea_I extends Remote
	{
	public void addText(String text, String user) throws RemoteException;
	}

