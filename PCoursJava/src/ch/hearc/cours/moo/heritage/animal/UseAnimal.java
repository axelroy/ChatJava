
package ch.hearc.cours.moo.heritage.animal;

import ch.hearc.cours.moo.heritage.animal.mammifere.felin.concret.Chats;
import ch.hearc.cours.moo.heritage.animal.mammifere.felin.concret.Tigres;
import ch.hearc.cours.moo.heritage.animal.mammifere.rongeur.concret.Souris;
import ch.hearc.cours.moo.heritage.animal.oiseaux.concret.Canards;
import ch.hearc.cours.moo.heritage.animal.oiseaux.concret.Rapaces;

public class UseAnimal
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
		//usefeuille();
		//useNonFeuille();
		//useClone();
		//useIsEquals();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void usefeuille()
		{
		Souris souris = new Souris("Jerry");
		System.out.println(souris);

		System.out.println("\n");

		Chats chat = new Chats("Tom");
		System.out.println(chat);

		System.out.println("\n");

		Tigres tigre = new Tigres("Diego");
		System.out.println(tigre);

		System.out.println("\n");

		Canards canard = new Canards("Donald", 12000);
		System.out.println(canard);

		System.out.println("\n");

		Rapaces rapace = new Rapaces("Kai", 10000);
		System.out.println(rapace);

		System.out.println("\n");
		}

	private static void useClone()
		{
		Chats chatSource = new Chats("cat");
		Chats chatCopie = chatSource.cloneOf();

		System.out.println(chatSource);
		System.out.println(chatCopie);

		chatSource.setNom("Hello");
		chatSource.setTempSang(28);

		System.out.println(chatSource);
		System.out.println(chatCopie);
		}

	private static void useIsEquals()
		{
		Chats chat = new Chats("moustache");
		Tigres tigre = new Tigres("moustache");
		boolean isEqual = chat.isEquals(tigre);

		System.out.println(isEqual);
		}

	}
