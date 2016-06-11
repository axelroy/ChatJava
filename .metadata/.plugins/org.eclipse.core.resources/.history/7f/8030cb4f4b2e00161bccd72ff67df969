
package ch.hearc.cours.projet.gui.chat;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JSplitPane;

import ch.hearc.cours.projet.chatrmi.JPanelVideo;

public class JCustomSplitPane extends JSplitPane
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JCustomSplitPane()
		{
		super(JSplitPane.HORIZONTAL_SPLIT);
		geometry();
		control();
		appareance();
		}

	private void appareance()
		{
		addComponentListener(new ComponentAdapter()
			{
				@Override
				public void componentResized(ComponentEvent e)
					{
					// TODO Auto-generated method stub
					super.componentResized(e);
					}
			});
		}

	private void geometry()
		{
		separationRatio = 0.7;
		setOneTouchExpandable(true);

		setResizeWeight(separationRatio);

		jPanelMessage = new JPanelMessage();
		jPanelVideo = new JPanelVideo();

		setLeftComponent(jPanelVideo);
		setRightComponent(jPanelMessage);

		}

	private void control()
		{
		// TODO Auto-generated method stub

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

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	//Tools
	private JPanelVideo jPanelVideo;
	private JPanelMessage jPanelMessage;

	private double separationRatio;
	}
