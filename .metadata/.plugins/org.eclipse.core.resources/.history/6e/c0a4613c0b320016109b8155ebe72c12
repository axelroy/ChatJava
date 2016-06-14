
package ch.hearc.cours.kitbase.container;

public class UseTab2D
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
		double[][] tab = creerPeuplerRectangulaire();
		Tab2D.print(tab);
		double[][] tabHetero = creerPeuplerHeterogene();
		Tab2D.print(tabHetero);
		double[][] tabTriangulaire = creerPeuplerTriangulaire();
		Tab2D.print(tabTriangulaire);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static double[][] creerPeuplerRectangulaire()
		{
		int n = 3;
		int m = 4;
		double[][] tab = Tab2D.create(n, m);
		for(int i = 1; i <= n; i++)
			{
			for(int j = 1; j <= m; j++)
				{
				tab[i - 1][j - 1] = (10 * i) + j;
				}
			}
		return tab;
		}

	private static double[][] creerPeuplerHeterogene()
		{
		int[] tabNbColonneParLigne = { 3, 1, 2 };

		double[][] tab = Tab2D.create(tabNbColonneParLigne);

		int n = tabNbColonneParLigne.length;
		for(int i = 1; i <= n; i++)
			{
			int mi = tabNbColonneParLigne[i - 1];
			for(int j = 1; j <= mi; j++)
				{
				tab[i - 1][j - 1] = (10 * i) + j;
				}
			}
		return tab;
		}

	private static double[][] creerPeuplerTriangulaire()
		{
		int n = 4;
		double[][] tab = Tab2D.createTriangulaire(n);

		for(int i = 1; i <= n; i++)
			{
			int mi = i;
			for(int j = 1; j <= mi; j++)
				{
				tab[i - 1][j - 1] = (10 * i) + j;
				}
			}
		return tab;
		}
	}
