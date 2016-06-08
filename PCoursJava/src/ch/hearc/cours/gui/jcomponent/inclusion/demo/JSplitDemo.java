
package ch.hearc.cours.gui.jcomponent.inclusion.demo;

import javax.swing.JSplitPane;

import ch.hearc.cours.gui.jcomponent.inclusion.demo.droite.JPanelTabPane;
import ch.hearc.cours.gui.jcomponent.inclusion.demo.gauche.JPanelGauche;
import ch.hearc.cours.gui.layout.combinaison.tools.JPanelDecorator;

public class JSplitDemo extends JSplitPane
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JSplitDemo()
		{
		super(JSplitPane.VERTICAL_SPLIT);
		setDividerLocation(200);
		setOneTouchExpandable(true);

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
		jPanelTabPane = new JPanelTabPane();
		jPanelGauche = new JPanelGauche();

		jPanelDecoratorLogo = new JPanelDecorator(jPanelGauche, 20);
		jPanelDecoratorTabPane = new JPanelDecorator(jPanelTabPane, 20);

		// JComponent : add
		setLeftComponent(jPanelDecoratorLogo);
		setRightComponent(jPanelDecoratorTabPane);
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
	private JPanelDecorator jPanelDecoratorLogo;
	private JPanelDecorator jPanelDecoratorTabPane;
	private JPanelGauche jPanelGauche;
	private JPanelTabPane jPanelTabPane;

	}
