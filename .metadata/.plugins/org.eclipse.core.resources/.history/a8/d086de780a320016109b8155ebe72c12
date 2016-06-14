
package ch.hearc.cours.rmi.pchorloge;

import java.rmi.RemoteException;
import java.util.Date;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class Horloge implements Horloge_I
	{


	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * DLM: devrait être en Singleton.
	 * Laissé sous cette forme pour IIE.
	 * @throws RemoteException
	 */
	public Horloge() throws RemoteException
		{
		RmiTools.shareObject(this, rmiUrl);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Date getTime() throws RemoteException
		{
		return new Date(System.currentTimeMillis());
		}

	@Override
	public String toString()
		{
		try
			{
			return getTime().toString();
			}
		catch (RemoteException e)
			{
			return "Connexion impossible.";
			}
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

	public final RmiURL rmiUrl = new RmiURL(RMI_ID, RMI_PORT);

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static final String RMI_ID = Horloge.class.getName() + "Tissot";
	public static final int RMI_PORT = RmiTools.PORT_RMI_DEFAUT;

	}
