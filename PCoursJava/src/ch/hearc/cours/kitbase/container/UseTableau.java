
package ch.hearc.cours.kitbase.container;

public class UseTableau
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
		int n = 10;
		int[] tabValeurs = new int[n];
		peupler(tabValeurs);
		print(tabValeurs);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void peupler(int[] tabValeurs)
		{
		int n = tabValeurs.length;
		for(int i = 0; i < n; i++)
			{
			tabValeurs[i] = i;
			}
		}

	private static void print(int[] tabValeurs)
		{
		//V1
			{
			int n = tabValeurs.length;
			for(int i = 0; i < n; i++)
				{
				System.out.println(tabValeurs[i]);
				}
			}

		//V2 foreach: readable only!
			{
			for(int elementI:tabValeurs)
				{
				System.out.println(elementI);
				}
			}
		}
	}
