package ch.hearc.cours.projet.chatrmi.tools;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JFrameSplashScreen extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameSplashScreen(String text)
		{
		geometry(text);
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

	private void geometry(String text)
		{
		// JComponent : Instanciation
		JPanelSplashScreen jPanelSplashScreen = new JPanelSplashScreen(text);

		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}
		// JComponent : add
		add(jPanelSplashScreen, BorderLayout.CENTER);
		}

	private void control()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setUndecorated(true);
		setResizable(false);
		}

	private void appearance()
		{
		setSize(200, 100);
		setLocationRelativeTo(null); // frame centrer
		setVisible(true); // last!
		}

	}

