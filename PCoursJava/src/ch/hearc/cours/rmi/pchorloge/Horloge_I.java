
package ch.hearc.cours.rmi.pchorloge;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface Horloge_I extends Remote
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public Date getTime() throws RemoteException;

	}