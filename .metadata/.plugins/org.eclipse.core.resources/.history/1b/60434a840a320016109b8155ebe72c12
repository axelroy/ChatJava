
package ch.hearc.cours.gui.java2d.repere.polygone;

import javax.swing.JFrame;

public class JFramePolygone extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFramePolygone(int n)
		{
		geometry(n);
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry(int n)
		{
		jpanel = new JPanelPolygone(n);
		this.add(jpanel);
		}

	private void control()
		{
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	private void appearance()
		{
		setSize(800, 600);
		setTitle("Polygone");
		setLocationRelativeTo(null); // frame centrer
		setVisible(true); // last!
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JPanelPolygone jpanel;

	}
