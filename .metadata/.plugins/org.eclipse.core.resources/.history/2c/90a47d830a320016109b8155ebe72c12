
package ch.hearc.cours.io.file.data;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Tools
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static float[] toArray(List<Float> list)
		{
		float[] tab = new float[list.size()];

		int i = 0;
		for(float element:list)
			{
			tab[i] = element;
			i++;
			}

		return tab;
		}

	public static float[] create(int n)
		{
		float[] tab = new float[n];
		for(int i = 0; i < n; i++)
			{
			tab[i]=i;
			}
		return tab;
		}

	public static void print(float[] tab)
		{
		System.out.println(Arrays.toString(tab));
		}

	public static void delete(String fileName)
		{
		File file = new File(fileName);
		boolean isOK = file.delete();
		System.out.println("file deleted : " + isOK);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/


	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	}

