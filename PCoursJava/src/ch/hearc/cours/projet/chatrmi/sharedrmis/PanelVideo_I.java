
package ch.hearc.cours.projet.chatrmi.sharedrmis;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PanelVideo_I extends Remote
	{
	public void putImage(byte[] image) throws RemoteException;
	}

