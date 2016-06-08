
package ch.hearc.cours.projet.chatrmi;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

import ch.hearc.cours.projet.gui.connexion.ChatPreferences;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

// TODO:Heritage pour la gestion locale (rmiID pas identiques)

public class PcChat implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private PcChat()
		{
		try
			{
			rmiUrl = new RmiURL(Id.idRmiTextAreaAxel, InetAddress.getByName(ChatPreferences.getIp()), ChatPreferences.getPort());
			}
		catch (UnknownHostException e)
			{
			e.printStackTrace();
			}
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

	public synchronized static PcChat getInstance()
		{
		if (INSTANCE == null)
			{
			INSTANCE = new PcChat();
			}
		return INSTANCE;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public TextArea_I getRemoteTextArea()
		{
		return this.remoteTextArea;
		}


	public JTextAreaCustom getjTextAreaCustom()
		{
		return this.jTextAreaCustom;
		}


	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void clientSide()
		{
		try
			{
			connect();
			}
		catch (RemoteException e)
			{
			System.err.println("[PcHorloge]: clientSide: erreur de connexion.");
			// e.printStackTrace();
			}
		}

	private void connect() throws RemoteException
		{
		int delayMs = 500;
		int nbTentatives = 100;
		// adress ip distante
		this.remoteTextArea = (TextArea_I)RmiTools.connectionRemoteObjectBloquant(rmiUrl, delayMs, nbTentatives);
		}


	private void serverSide()
		{
		try
			{
			jTextAreaCustom = new JTextAreaCustom(rmiUrl);

			}
		catch (RemoteException e)
			{
			System.err.println("[PcChat]: serverSide: instanciation textarea");
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	//Tools
	private RmiURL rmiUrl;

	//output
	private TextArea_I remoteTextArea;
	private JTextAreaCustom jTextAreaCustom;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static PcChat INSTANCE;
	}
