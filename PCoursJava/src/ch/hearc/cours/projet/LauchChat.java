
package ch.hearc.cours.projet;

import java.util.logging.Level;
import java.util.logging.Logger;

import ch.hearc.cours.projet.chatrmi.ChatPreferences;
import ch.hearc.cours.projet.gui.connexion.JFrameConnexion;

public class LauchChat
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	// TODO:Peut �tre ne pas lancer la fen�tre de connexion si les propri�t�s syst�me sont set
	public static void main(String[] args)
		{
		main();
		}
	public static void main()
		{
		Logger logger = Logger.getLogger(ChatPreferences.loggerName);
		logger.setLevel(Level.WARNING);

		JFrameConnexion frameConnexion = new JFrameConnexion();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
