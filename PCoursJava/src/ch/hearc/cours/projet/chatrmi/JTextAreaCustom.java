
package ch.hearc.cours.projet.chatrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.JTextArea;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class JTextAreaCustom extends JTextArea implements TextArea_I ,Remote
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JTextAreaCustom(RmiURL rmiUrl) throws RemoteException
		{
		super();
		RmiTools.shareObject(this, rmiUrl);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void addText(String text)
		{
		append(text);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	}
