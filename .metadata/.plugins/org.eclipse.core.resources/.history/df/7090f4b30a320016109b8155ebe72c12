
package ch.hearc.cours.io.file.persistance.properties;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.swing.JFrame;

public class JFrameProperties extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameProperties()
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

	private void loadProperties()
		{
		if (FILE_PROPRETIES.exists())
			{
			try
				{
				FileInputStream fis = new FileInputStream(FILE_PROPRETIES);
				BufferedInputStream bis = new BufferedInputStream(fis);

				Properties properties = new Properties();
				properties.load(bis);

				bis.close();
				fis.close();

				int px = Integer.parseInt(properties.getProperty("px"));
				int py = Integer.parseInt(properties.getProperty("py"));
				int w = Integer.parseInt(properties.getProperty("w"));
				int h = Integer.parseInt(properties.getProperty("h"));

				this.setLocation(px, py);
				this.setSize(w, h);
				}
			catch (Exception e)
				{
				e.printStackTrace();
				}
			}
		else
			{
			this.setLocationRelativeTo(null);
			this.setSize(400, 600);
			}

		}

	private void saveProperties()
		{
		try
			{
			FILE_PROPRETIES.getParentFile().mkdirs();
			FileOutputStream fos = new FileOutputStream(FILE_PROPRETIES);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			Properties properties = new Properties();

			properties.setProperty("px", "" + (int)this.getLocation().getX());
			properties.setProperty("py", "" + (int)this.getLocation().getX());
			properties.setProperty("w", "" + this.getWidth());
			properties.setProperty("h", "" + this.getHeight());

			properties.store(bos, "Position/Taille JFrameProperties");

			bos.close();
			fos.close();
			}
		catch (Exception e)
			{
			e.printStackTrace();
			}

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
				saveProperties();
				System.exit(0); // 0 normal, -1 anormal
				}

			});
		}

	private void appearance()
		{
		setTitle("Test Properties");
		loadProperties();
		setVisible(true); // last!
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final File FILE_PROPRETIES = new File("io/input/config.txt");
	}
