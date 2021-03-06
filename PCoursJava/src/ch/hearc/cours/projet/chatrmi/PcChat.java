
package ch.hearc.cours.projet.chatrmi;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

import ch.hearc.cours.projet.chatrmi.gui.chatframe.JFrameChat;
import ch.hearc.cours.projet.chatrmi.sharedrmis.JPanelVideo;
import ch.hearc.cours.projet.chatrmi.sharedrmis.JTextAreaCustom;
import ch.hearc.cours.projet.chatrmi.sharedrmis.PanelVideo_I;
import ch.hearc.cours.projet.chatrmi.sharedrmis.TextArea_I;
import ch.hearc.cours.projet.chatrmi.states.LoadingChatState;
import ch.hearc.cours.projet.chatrmi.states.ReconnectionState;
import ch.hearc.cours.projet.chatrmi.states.RunningChatState;

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
			rmiUrlChat = new RmiURL(IDsRmi.idRmi1, InetAddress.getByName(ChatPreferences.getIp()), ChatPreferences.getPort());
			rmiUrlVideo = new RmiURL(IDsRmi.idRmi2, InetAddress.getByName(ChatPreferences.getIp()), ChatPreferences.getPort());
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

		jPanelVideo.start();

		ChatManager chatManager = ChatManager.getInstance();
		System.out.println("[PcChat] change state");
		chatManager.SetState(new LoadingChatState());
		}

	public synchronized static PcChat getInstance()
		{
		if (INSTANCE == null)
			{
			INSTANCE = new PcChat();
			}
		return INSTANCE;
		}

	public void reconnect()
	{
	clientSide();
	ChatManager chatManager = ChatManager.getInstance();
	chatManager.SetState(new RunningChatState());
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

	public JPanelVideo getjPanelVideo()
		{
		return this.jPanelVideo;
		}


	public PanelVideo_I getRemotePanelVideo()
		{
		return this.remotePanelVideo;
		}


	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/


	private void clientSide()
		{
		try
			{
			connectChat();
			connectVideo();
			}
		catch (RemoteException e)
			{
			ChatManager chatManager = ChatManager.getInstance();
			chatManager.SetState(new ReconnectionState());

			System.err.println("[PcChat]: clientSide: erreur de connexion.");
			// e.printStackTrace();
			}
		}

	private void connectChat() throws RemoteException
		{
		int delayMs = 500;
		int nbTentatives = 100;

		this.remoteTextArea = (TextArea_I)RmiTools.connectionRemoteObjectBloquant(rmiUrlChat, delayMs, nbTentatives);
		}

	private void connectVideo() throws RemoteException
		{
		int delayMs = 500;
		int nbTentatives = 100;

		this.remotePanelVideo = (PanelVideo_I)RmiTools.connectionRemoteObjectBloquant(rmiUrlVideo, delayMs, nbTentatives);
		}


	private void serverSide()
		{
		try
			{
			jTextAreaCustom = new JTextAreaCustom();
			jPanelVideo = new JPanelVideo();

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
	private RmiURL rmiUrlChat;
	private RmiURL rmiUrlVideo;

	//output
	private TextArea_I remoteTextArea;
	private JTextAreaCustom jTextAreaCustom;

	private JPanelVideo jPanelVideo;
	private PanelVideo_I remotePanelVideo;


	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static PcChat INSTANCE;
	private JFrameChat jFrameChat;
	}
