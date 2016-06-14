
package ch.hearc.cours.kitbase.tools;

import java.util.Arrays;

public class Tab1DTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * Indépendamment de l'ordre des éléments
	 */
	public static boolean isEqualsSansOrdre(double[] tab1, double[] tab2)
		{
		Arrays.sort(tab1);
		Arrays.sort(tab2);

		return isEquals(tab1, tab2);
		}

	public static boolean isEquals(double[] tab1, double[] tab2)
		{
		if (tab1.length != tab2.length)
			{
			return false;
			}
		else
			{
			for(int i = 0; i < tab1.length; i++)
				{
				if (!MathTools.isEquals(tab1[i], tab2[i])) { return false; }
				}
			return true;
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
