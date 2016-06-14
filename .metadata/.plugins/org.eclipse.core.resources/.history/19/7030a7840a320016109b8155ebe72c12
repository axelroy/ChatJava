
package ch.hearc.cours.gui.event;

import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelEvent extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelEvent()
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
		bouton = new JButton("Click me !");
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);
		add(bouton);
		}

	private void control()
		{
		addComponentListener(new ComponentAdapter()
			{

			@Override
			public void componentResized(ComponentEvent e)
				{
				//V1
					{
					System.out.println(JPanelEvent.this.getSize());
					}
				//v2
					{
					System.out.println(getSize());
					}
				//v3
					{
					System.out.println(((JPanel)e.getSource()).getSize());
					}
				}
			});

		addMouseListener(new MouseAdapter()
			{

			@Override
			public void mouseReleased(MouseEvent e)
				{
				System.out.println(e.getPoint());
				}
			});

		bouton.addMouseListener(new MouseAdapter()
			{

			@Override
			public void mouseReleased(MouseEvent e)
				{
				System.out.println(e.getPoint());
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
	private JButton bouton;
	}
