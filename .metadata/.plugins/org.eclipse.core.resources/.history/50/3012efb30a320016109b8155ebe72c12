
package ch.hearc.cours.kitbase.container;

public class Tab2D
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static double[][] create(int n, int m)
		{
		double[][] tabExt = new double[n][];
		for(int i = 0; i < n; i++)
			{
			double[] tabInt = new double[m];
			tabExt[i] = tabInt;
			}
		return tabExt;
		}

	public static double[][] create(int[] tabNbColonneParLigne)
		{
		int n = tabNbColonneParLigne.length;
		double[][] tabExt = new double[n][];
		for(int i = 0; i < n; i++)
			{
			int mi = tabNbColonneParLigne[i];
			double[] tabInt = new double[mi];
			tabExt[i] = tabInt;
			}
		return tabExt;
		}

	public static double[][] createDirect(int n, int m)
		{
		return new double[n][m];
		}

	public static double[][] createTriangulaire(int n)
		{
		double[][] tabExt = new double[n][];
		for(int i = 0; i < n; i++)
			{
			double[] tabInt = new double[i + 1];
			tabExt[i] = tabInt;
			}
		return tabExt;
		}

	public static void print(double[][] tab)
		{
		for(int i = 0; i < tab.length; i++) // Variation sur les lignes
			{
			int mi = tab[i].length;
			for(int j = 0; j < mi; j++) // Variation sur les colonnes
				{
				System.out.print(tab[i][j] + "	");
				}
			System.out.println();
			}
		System.out.println();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
