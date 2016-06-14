package ch.hearc.cours.projet.chatrmi.tools;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelSplashScreen extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelSplashScreen(String text)
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
		JLabel jlabel = new JLabel(text);

		// Layout : Specification
			{
			BorderLayout borderlayout = new BorderLayout(40,40);
			setLayout(borderlayout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}

		// JComponent : add
		add(jlabel, BorderLayout.CENTER);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		// rien
		}
	}
