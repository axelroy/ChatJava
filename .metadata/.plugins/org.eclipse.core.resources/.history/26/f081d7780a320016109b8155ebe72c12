
package ch.hearc.cours.rmi.pchorloge;

import java.rmi.RemoteException;

import ch.hearc.cours.rmi.pcsecret.Secret;
import ch.hearc.cours.rmi.pcsecret.Secret_I;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class PcHorloge implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public PcHorloge()
		{
		// Rien de nécessaire
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		serverSide();
		clientSide();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void clientSide()
		{
		try
			{
			Secret_I secret = connect();
			work(secret);
			}
		catch (RemoteException e)
			{
			System.err.println("[PcHorloge]: clientSide: erreur de connexion.");
			//			e.printStackTrace();
			}
		}

	private Secret_I connect() throws RemoteException
		{
		RmiURL rmiUrl = new RmiURL(Secret.RMI_ID, RmiTools.getLocalHost(), Secret.RMI_PORT);
		int delayMs = 500;
		int nbTentatives = 100;
		Secret_I secret = (Secret_I)RmiTools.connectionRemoteObjectBloquant(rmiUrl, delayMs, nbTentatives);
		return secret;
		}

	private void work(Secret_I secret) throws RemoteException
		{
		System.out.println(secret.getMessage());
		}

	private void serverSide()
		{
		try
			{
			new Horloge(); // la nouvelle horloge ne sera pas garbagé car sharée
			}
		catch (RemoteException e)
			{
			System.err.println("[PcHorloge]: serverSide: instanciation horloge");
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	}
