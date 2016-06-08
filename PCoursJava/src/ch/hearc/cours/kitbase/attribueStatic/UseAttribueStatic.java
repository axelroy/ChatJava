
package ch.hearc.cours.kitbase.attribueStatic;

import java.util.Arrays;

public class UseAttribueStatic
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
		System.out.println(Arrays.toString(TAB));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static Integer[] createTAB(int n)
		{
		Integer[] tab = new Integer[n];
		for(int i = 0; i < tab.length; i++)
			{
			tab[i] = new Integer(i);
			}
		return tab;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final Integer[] TAB = createTAB(6);

	}
