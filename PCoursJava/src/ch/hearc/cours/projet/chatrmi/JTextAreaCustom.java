
package ch.hearc.cours.projet.chatrmi;

import java.rmi.RemoteException;

import javax.swing.JTextArea;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class JTextAreaCustom extends JTextArea implements TextArea_I
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JTextAreaCustom() throws RemoteException
		{
		super();
		System.out.println("[JTextAreaCustom] idRMI " + Id.idRmi2+ "  ");
		rmiUrl = new RmiURL(Id.idRmi2, RmiTools.getLocalHost(), ChatPreferences.getPort());
		RmiTools.shareObject(this, rmiUrl);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void addText(String text, String user) throws RemoteException
		{
		append("<" + user + "> ");
		append(text);
		append("\n");
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	public final RmiURL rmiUrl;
	}
