
package ch.hearc.cours.projet.gui.chat;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import ch.hearc.cours.projet.chatrmi.JTextAreaCustom;
import ch.hearc.cours.projet.chatrmi.PcChat;
import ch.hearc.cours.projet.gui.chat.input.JPanelInput;

public class JPanelMessage extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelMessage()
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

	private void geometry()
		{
		PcChat pcChat = PcChat.getInstance();

		// JComponent : Instanciation
		jTextAreaCustom = pcChat.getjTextAreaCustom();
		jPanelInput = new JPanelInput();

		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);
			}

		// JComponent : add
		add(jTextAreaCustom, BorderLayout.CENTER);
		add(jPanelInput, BorderLayout.SOUTH);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		setBackground(Color.CYAN);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JTextAreaCustom jTextAreaCustom;
	private JPanelInput jPanelInput;

	}
