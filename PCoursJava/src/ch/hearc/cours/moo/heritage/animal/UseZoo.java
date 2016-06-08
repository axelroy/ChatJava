
package ch.hearc.cours.moo.heritage.animal;

import ch.hearc.cours.moo.heritage.animal.mammifere.felin.concret.Chats;
import ch.hearc.cours.moo.heritage.animal.mammifere.felin.concret.Tigres;
import ch.hearc.cours.moo.heritage.animal.oiseaux.concret.Canards;

public class UseZoo
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
		Zoo zoo = new Zoo("Bale");
		zoo.add(new Chats("Mistigri"));
		zoo.add(new Canards("Donald", 1000));
		//System.out.println(zoo);
		System.out.println(zoo.mange());
		testClone(zoo);
		}

	private static void testClone(Zoo zoo)
		{
		Zoo zooCopy = new Zoo(zoo);
		System.out.println(zoo);
		System.out.println(zooCopy);
		zooCopy.add(new Tigres("Tigrou"));
		System.out.println("--");
		System.out.println(zoo);
		System.out.println(zooCopy);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
