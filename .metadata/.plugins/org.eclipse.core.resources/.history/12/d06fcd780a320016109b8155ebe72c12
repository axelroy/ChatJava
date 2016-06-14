
package ch.hearc.cours.rmi.pcsecret;

import java.rmi.RemoteException;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class Secret implements Secret_I
	{


	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * DLM: devrait être en Singleton.
	 * Laissé sous cette forme pour IIE.
	 * @throws RemoteException
	 */
	public Secret() throws RemoteException
		{
		RmiTools.shareObject(this, rmiUrl);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public MessageSecret getMessage() throws RemoteException
		{
		return new MessageSecret("DLM GRRIF");
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static final String RMI_ID = Secret.class.getName();
	public static final int RMI_PORT = RmiTools.PORT_RMI_DEFAUT;

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	public final RmiURL rmiUrl = new RmiURL(RMI_ID, RMI_PORT);
	}
