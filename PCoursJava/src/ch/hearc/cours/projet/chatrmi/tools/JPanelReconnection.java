
package ch.hearc.cours.projet.chatrmi.tools;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelReconnection extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelReconnection()
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
		// JComponent : Instanciation
		label = new JLabel("Voulez-vous vous reconnecter?");
		buttonNo = new JButton("Non");
		buttonYes = new JButton("Oui");

		// Layout : Specification
			{
			FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
			setLayout(flowlayout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}

		// JComponent : add
		add(label);
		add(buttonYes);
		add(buttonNo);
		}

	private void control()
		{
		buttonYes.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				// TODO Auto-generated method stub

				}
			});

		buttonNo.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				// TODO Auto-generated method stub

				}
			});
		}

	private void appearance()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JButton buttonYes;
	private JButton buttonNo;
	private JLabel label;

	}
