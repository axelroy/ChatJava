
package ch.hearc.cours.projet.chatrmi;

import java.awt.Image;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PanelVideo_I extends Remote
	{
	public void putImage(Image image) throws RemoteException;
	}

