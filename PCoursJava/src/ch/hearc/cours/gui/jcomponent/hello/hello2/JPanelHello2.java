
package ch.hearc.cours.gui.jcomponent.hello.hello2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class JPanelHello2 extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelHello2()
		{
		compteur1 = 0;
		compteur2 = 0;
		geometrie();
		controle();
		apparence();
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

	private void apparence()
		{
		//rien
		}

	private void geometrie()
		{
		bouton1 = new JButtonCompteur("0");
		bouton2 = new JButtonCompteur("0");
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);
		add(bouton1);
		add(bouton2);
		}

	private void controle()
		{
		ActionListener actionListener = new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				JButtonCompteur source = (JButtonCompteur)e.getSource();

				source.increment();
				}
			};
		bouton1.addActionListener(actionListener);
		bouton2.addActionListener(actionListener);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//TOOLS
	private JButtonCompteur bouton1;
	private JButtonCompteur bouton2;
	private int compteur1;
	private int compteur2;
	}
