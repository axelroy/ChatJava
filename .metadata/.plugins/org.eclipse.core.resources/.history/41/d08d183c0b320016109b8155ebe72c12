
package ch.hearc.cours.moo.interfaces;

public class UseHomme
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
		Homme homme = new Homme();
		work(homme);
		work2(homme);

		Manger_I manger = homme;
		work3(manger);

		Extraterrestre extraterrestre = new Extraterrestre();
		work2(extraterrestre);

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void work(Homme homme)
		{
		homme.courir();
		homme.marcher();
		homme.respirer();
		homme.manger();
		}

	/**
	 * Peut ête utilisée avec un homme ou un extraterrestre ou toute
	 * classe implémentant Deplacer_I
	 */
	private static void work2(Deplacer_I deplacer)
		{
		deplacer.courir();
		deplacer.marcher();
		}

	private static void work3(Manger_I manger)
		{
		manger.manger();
		}
	}
