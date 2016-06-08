
package ch.hearc.cours.projet.gui.connexion;

import java.util.prefs.Preferences;

import ch.hearc.cours.io.file.persistance.preferrence.JFramePreferrence;

public class ChatPreferences
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void load()
		{
		ip = PREFERENCES.get("ip", DEFAULT_IP);
		port = PREFERENCES.getInt("port", DEFAULT_PORT);
		}

	public static void save()
		{
		PREFERENCES.put("ip", ip);
		PREFERENCES.putInt("port", port);
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public static void setIp(String ip)
		{
		ChatPreferences.ip = ip;
		}

	public static void setPort(int port)
		{
		ChatPreferences.port = port;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public static String getIp()
		{
		return ip;
		}

	public static int getPort()
		{
		return port;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/
	private static final Preferences PREFERENCES = Preferences.userNodeForPackage(JFramePreferrence.class);

	public static String ip;
	public static int port;

	// TODO: mettre l'adresse ip local via bilat rmitool
	private static final String DEFAULT_IP = "127.0.0.1";
	private static final int DEFAULT_PORT = 1099;

	}
