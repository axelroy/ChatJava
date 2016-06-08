
package ch.hearc.cours.moo.generic;

import ch.hearc.cours.moo.garage.Roue;

public class UsePile
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		//Pile avec Integer
			{
			Pile<Integer> pile = new Pile<Integer>();
			pile.push(4);
			pile.push(5);
			System.out.println(pile.size());
			System.out.println(pile);
			System.out.println(pile.pop());
			System.out.println(pile.pop());
			System.out.println(pile.pop());
			}

		//Pile avec Roue
			{
			Pile<Roue> pile = new Pile<Roue>();
			pile.push(new Roue("roue", 12));
			pile.push(new Roue("roue 2", 12));
			System.out.println(pile.size());
			System.out.println(pile);
			System.out.println(pile.pop());
			System.out.println(pile.pop());
			System.out.println(pile.pop());
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
