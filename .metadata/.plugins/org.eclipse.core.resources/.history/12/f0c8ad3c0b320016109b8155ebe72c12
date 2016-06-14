
package ch.hearc.cours.gui.jcomponent.exploration.JTabPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class JTabPane extends JTabbedPane
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JTabPane()
		{
		super(SwingConstants.TOP);
		geometry();
		control();
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

		}

	private void control()
		{
		jPanelRemove.getPanelCross().addMouseListener(new MouseAdapter()
			{

			@Override
			public void mouseClicked(MouseEvent e)
				{
				remove(0);
				}
			});
		}

	private void geometry()
		{
		button1 = new JButton("Push me");
		jPanelRemove = new JPanelRemove();
		label = new JLabel("I'm a label");

		addTab("Button", button1);
		addTab("Label", label);
		setTabComponentAt(0, jPanelRemove);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton button1;
	private JPanelRemove jPanelRemove;
	private JLabel label;

	}
