
package ch.hearc.cours.projet.chatrmi;

import java.util.prefs.Preferences;

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
		user = PREFERENCES.get("user", DEFAULT_USER);
		}

	public static void save()
		{
		PREFERENCES.put("ip", ip);
		PREFERENCES.putInt("port", port);
		PREFERENCES.put("user", user);
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

	public static void setUserName(String user)
		{
		ChatPreferences.user = user;
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

	public static String getUserName()
		{
		return user;
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
	private static final Preferences PREFERENCES = Preferences.userNodeForPackage(ChatManager.class);

	private static String ip;
	private static int port;
	private static String user;

	// TODO: mettre l'adresse ip local via bilat rmitool
	private static final String DEFAULT_IP = "127.0.0.1";
	private static final int DEFAULT_PORT = 1099;
	private static final String DEFAULT_USER = "user";

	public static final String loggerName = "CHATRMI";


	}
