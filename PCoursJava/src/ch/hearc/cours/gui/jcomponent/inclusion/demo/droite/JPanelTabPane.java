
package ch.hearc.cours.gui.jcomponent.inclusion.demo.droite;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import ch.hearc.cours.gui.java2d.images.create.hsb.panel.JPanelHSB;
import ch.hearc.cours.gui.java2d.repere.conference.JPanelConference;
import ch.hearc.cours.gui.java2d.repere.polygone.JPanelPolygone;
import ch.hearc.cours.gui.jcomponent.exploration.JTabPane.JPanelRemove;
import ch.hearc.cours.gui.layout.sans.animation.JPanelCercle;

public class JPanelTabPane extends JTabbedPane
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelTabPane()
		{
		super(SwingConstants.TOP);
		geometry();
		control();
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

	private void control()
		{
		jPanelRemove.getPanelCross().addMouseListener(new MouseAdapter()
			{

			@Override
			public void mouseClicked(MouseEvent e)
				{
				remove(1);
				}
			});

		}
	private void geometry()
		{
		jPanelCercle = new JPanelCercle(10);
		jPanelConference = new JPanelConference(15);
		jPanelHSB = new JPanelHSB();
		jPanelPolygone = new JPanelPolygone(6);
		jPanelRemove = new JPanelRemove();

		this.add("Remove", new JPanel());
		this.add("Bouton tournant", jPanelCercle);
		this.add("Conference", jPanelConference);
		this.add("HSB", jPanelHSB);
		this.add("Polygone", jPanelPolygone);
		this.setTabComponentAt(0, jPanelRemove);

		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JPanelCercle jPanelCercle;
	private JPanelConference jPanelConference;
	private JPanelHSB jPanelHSB;
	private JPanelPolygone jPanelPolygone;
	private JPanelRemove jPanelRemove;

	}