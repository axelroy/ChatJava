
package ch.hearc.cours.projet.chatrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;

public interface PanelVideo_I extends Remote
	{
	public void putImage(ImageIcon imageIcon) throws RemoteException;
	}

