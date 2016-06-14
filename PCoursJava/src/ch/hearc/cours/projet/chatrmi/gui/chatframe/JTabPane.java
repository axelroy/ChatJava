
package ch.hearc.cours.projet.chatrmi.gui.chatframe;

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

		}

	private void geometry()
		{
		jPanelConfiguration = new JPanelConfiguration();
		jCustomSplitPane = new JCustomSplitPane();

		addTab("Chat", jCustomSplitPane);
		addTab("Configuration", jPanelConfiguration);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JCustomSplitPane jCustomSplitPane;
	private JPanelConfiguration jPanelConfiguration;

	}
