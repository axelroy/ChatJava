
package ch.hearc.cours.kitbase.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

public class UseBiList
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
		int n = 4;
		List<Integer> listX = new ArrayList<Integer>(n);
		List<Integer> listY = new ArrayList<Integer>(n);
		peupler(listX, listY, n);
		print(listX, listY);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * Hypothese: listX même taille que listY
	 */
	private static void print(List<Integer> listX, List<Integer> listY)
		{
		Assert.assertTrue(listX.size() == listY.size());

		//V1
			{
			Iterator<Integer> itX = listX.iterator();
			Iterator<Integer> itY = listY.iterator();
			while(itX.hasNext())
				{
				System.out.println(itX.next() + "\t" + itY.next());
				}
			}

		System.out.println("V2:");

		//V2
			{
			Iterator<Integer> itY = listY.iterator();
			for(Integer elementI:listX)
				{
				System.out.println(elementI + "\t" + itY.next());
				}
			}
		}

	private static void peupler(List<Integer> listX, List<Integer> listY, int n)
		{
		for(int i = 0; i < n; i++)
			{
			listX.add(i);
			listY.add(i * 10);
			}
		}

	}
