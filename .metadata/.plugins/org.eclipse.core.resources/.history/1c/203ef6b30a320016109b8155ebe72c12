
package ch.hearc.cours.io.file.persistance.preferrence;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.prefs.Preferences;

import javax.swing.JFrame;

public class JFramePreferrence extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFramePreferrence()
		{
		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void loadPreferences()
		{
		int px = PREFERENCES.getInt("px", 0);
		int py = PREFERENCES.getInt("py", 0);
		int w = PREFERENCES.getInt("w", 400);
		int h = PREFERENCES.getInt("h", 600);

		this.setLocation(px, py);
		this.setSize(w, h);
		}

	private void savePreferences()
		{
		PREFERENCES.putInt("px", (int)this.getLocation().getX());
		PREFERENCES.putInt("py", (int)this.getLocation().getY());
		PREFERENCES.putInt("w", this.getWidth());
		PREFERENCES.putInt("h", this.getHeight());
		}

	private void geometry()
		{

		}

	private void control()
		{
		addWindowListener(new WindowAdapter()
			{

			@Override
			public void windowClosing(WindowEvent e)
				{
				savePreferences();
				System.exit(0); // 0 normal, -1 anormal
				}

			});
		}

	private void appearance()
		{
		loadPreferences();
		setVisible(true); // last!
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final Preferences PREFERENCES = Preferences.userNodeForPackage(JFramePreferrence.class);
	}
