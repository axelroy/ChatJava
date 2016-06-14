
package ch.hearc.cours.projet;

import java.util.logging.Level;
import java.util.logging.Logger;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.ChatPreferences;

public class LauchChat
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}
	public static void main()
		{

		// TODO: replace all sysout and use the logger and creat a file with it. like this we have a debug in production
		Logger logger = Logger.getLogger(ChatPreferences.loggerName);
		logger.setLevel(Level.WARNING);

		ChatManager.getInstance();


		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}

