
package ch.hearc.cours.moo.heritage.special;

public class UseAB
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
		//echauffement();
		levelsupp();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void echauffement()
		{
		//Afficher le nom de la classe de l'objet manipulé

		A a = new A();

		//V1 pre-HES
		System.out.println("A"); //Pas robuste au refactoring

		//V2 post-HES
		System.out.println(a.getClass().getSimpleName());
		System.out.println(a.getClass().getName());

		}

	private static void levelsupp()
		{
		C c = new C();
		c.printNameClass();

		c.printNameClassFaux();
		}
	}
