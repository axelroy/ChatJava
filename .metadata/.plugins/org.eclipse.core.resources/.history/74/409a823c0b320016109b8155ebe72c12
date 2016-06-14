package ch.hearc.cours.gui.layout.combinaison.hello;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelGauche extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelGauche()
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
		button = new JButton("blablalbalblablalaba");

		// Layout : Specification
			{
			FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
			setLayout(flowlayout);

			// flowlayout.setHgap(20);
			// flowlayout.setVgap(20);
			}

		// JComponent : add
		add(button);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		Dimension dimPanel = new Dimension(200,-1);
		//setMinimumSize(dimPanel);
		//setMaximumSize(dimPanel);
		setPreferredSize(dimPanel);

		Dimension dimButton = new Dimension(80,80);
		button.setMinimumSize(dimButton);
		//button.setMaximumSize(dimButton);
		button.setPreferredSize(dimButton);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JButton button;

	}
