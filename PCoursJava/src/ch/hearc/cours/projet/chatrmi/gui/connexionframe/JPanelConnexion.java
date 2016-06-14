
package ch.hearc.cours.projet.chatrmi.gui.connexionframe;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import ch.hearc.cours.projet.chatrmi.ChatPreferences;
import ch.hearc.cours.projet.chatrmi.PcChat;

public class JPanelConnexion extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelConnexion()
		{
		// load preferences
		ChatPreferences.load();

		topFrame = (JFrameConnexion) SwingUtilities.getWindowAncestor(this);

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
		// JComponent : Instanciation
		userField = new JTextField(ChatPreferences.getUserName());
		ipField = new JTextField(ChatPreferences.getIp());
		portField = new JTextField(Integer.toString(ChatPreferences.getPort()));
		ipLabel = new JLabel("Adresse IP : ");
		portLabel = new JLabel("Port : ");
		userLabel = new JLabel("User : ");
		buttonValidate = new JButton("Valider");
		// Layout : Specification
			{
			FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
			setLayout(layout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}

		// JComponent : add
		add(userLabel);
		add(userField);
		add(ipLabel);
		add(ipField);
		add(portLabel);
		add(portField);
		add(buttonValidate);
		}

	private void control()
		{
		buttonValidate.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				ChatPreferences.setIp(ipField.getText());
				ChatPreferences.setPort(Integer.parseInt(portField.getText()));
				ChatPreferences.setUserName(userField.getText());
				ChatPreferences.save();

				PcChat pcChat = PcChat.getInstance();
				Thread chatThread = new Thread(pcChat);
				chatThread.start();

				//JPanelConnexion.this.topFrame.dispose();
				}
			});
		}

	private void appearance()
		{
		ipField.setPreferredSize(new Dimension(150, 20));
		portField.setPreferredSize(new Dimension(150, 20));
		userField.setPreferredSize(new Dimension(150, 20));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JTextField ipField;
	private JTextField portField;
	private JTextField userField;
	private JLabel ipLabel;
	private JLabel portLabel;
	private JLabel userLabel;
	private JButton buttonValidate;
	private JFrameConnexion topFrame;

	}
