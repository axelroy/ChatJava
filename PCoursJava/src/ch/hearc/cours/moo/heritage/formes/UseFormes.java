
package ch.hearc.cours.moo.heritage.formes;

public class UseFormes
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
		Carre carre = new Carre("c1", 10);
		Rectangle rectangle = new Rectangle("r1", 8, 7);
		Ellipse ellipse = new Ellipse("e1", 5, 3);
		Cercle cercle = new Cercle("c2", 4);

		System.out.println(carre);
		System.out.println(rectangle);
		System.out.println(ellipse);
		System.out.println(cercle);

		Dessin dessin = new Dessin("dessin1");
		dessin.add(carre);
		dessin.add(rectangle);
		dessin.add(ellipse);
		dessin.add(cercle);

		System.out.println(dessin.aire());
		System.out.println(dessin.perimetre());
		System.out.println(dessin);

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
