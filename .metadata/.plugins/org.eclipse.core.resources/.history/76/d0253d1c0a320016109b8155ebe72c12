
package ch.hearc.cours.projet.gui.chat;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import ch.hearc.cours.gui.layout.combinaison.tools.JPanelDecorator;

public class JPanelContainer extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelContainer()
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
		jTabPane = new JTabPane();
		JPanelDecorator jPanelDecorator = new JPanelDecorator(jTabPane, 5);
		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}
		// JComponent : add
		add(jPanelDecorator, BorderLayout.CENTER);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JTabPane jTabPane;

	}
