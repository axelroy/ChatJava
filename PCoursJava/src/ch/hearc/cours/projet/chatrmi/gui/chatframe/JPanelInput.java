
package ch.hearc.cours.projet.chatrmi.gui.chatframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.rmi.RemoteException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.ChatPreferences;
import ch.hearc.cours.projet.chatrmi.PcChat;
import ch.hearc.cours.projet.chatrmi.states.ReconnectingState;
import ch.hearc.cours.projet.chatrmi.states.ReconnectionState;

public class JPanelInput extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelInput()
		{
		pcChat = PcChat.getInstance();
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

	private void send()
		{
		String text = jTextField.getText();
		ChatManager chatManager = ChatManager.getInstance();

		String stringWithoutSpace = text.replaceAll(" ", "");

		if (!stringWithoutSpace.isEmpty())
			{
			(pcChat.getjTextAreaCustom()).append("<"+ChatPreferences.getUserName()+ "> " + text + "\n");
			if (!(chatManager.getCurrentState() instanceof ReconnectionState) && !(chatManager.getCurrentState() instanceof ReconnectingState))
				{
				try
					{
					(pcChat.getRemoteTextArea()).addText(text, ChatPreferences.getUserName());
					}
				catch (RemoteException e)
					{
					chatManager.SetState(new ReconnectionState());
					}
				}
			}
		jTextField.setText("");
		}

	private void geometry()
		{
		// JComponent : Instanciation
		jButton = new JButton("Envoyer");
		jTextField = new JTextField();

		Box box = Box.createHorizontalBox();
		// Layout : Specification
		box.add(jTextField);
		Box.createGlue();
		box.add(jButton);

			{
			BorderLayout borderLayout = new BorderLayout();
			setLayout(borderLayout);
			}

		add(box, BorderLayout.CENTER);
		}

	private void control()
		{

		jButton.addActionListener(new ActionListener()
			{


			@Override
			public void actionPerformed(ActionEvent e)
				{
				send();
				}

			});

		jTextField.addKeyListener(new KeyAdapter()
			{


			@Override
			public void keyPressed(KeyEvent e)
				{
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					{
					send();
					}

				}
			});
		}

	private void appearance()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JButton jButton;
	private JTextField jTextField;
	private PcChat pcChat;

	}
