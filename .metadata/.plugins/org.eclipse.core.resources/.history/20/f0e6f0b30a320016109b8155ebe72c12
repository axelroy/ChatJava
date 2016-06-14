
package ch.hearc.cours.kitbase.container;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UseMap
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
		Map<String, Integer> mapNomTel = new TreeMap<String, Integer>();
		peupler(mapNomTel, n);
		print(mapNomTel);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void print(Map<String, Integer> mapNomTel)
		{
		//TODO: Autres versions
		//Afficher clefs
			{
			System.out.println(mapNomTel.keySet());
			}

		System.out.println();

		//Afficher valeurs
			{
			System.out.println(mapNomTel.values());
			}

		System.out.println();

		//V1
			{
			Set<Entry<String, Integer>> entrySet = mapNomTel.entrySet();
			for(Entry<String, Integer> entryI:entrySet)
				{
				Integer valeur = entryI.getValue();
				String clef = entryI.getKey();
				System.out.println("(" + clef + "," + valeur + ")");
				}
			}

		System.out.println();

		//V2
			{
			System.out.println(mapNomTel.toString());
			}

		System.out.println();

		//V3
			{
			System.out.println(mapNomTel);
			}
		}

	private static void peupler(Map<String, Integer> mapNomTel, int n)
		{
		for(int i = 0; i < n; i++)
			{
			mapNomTel.put("toto" + i, i);
			}
		}
	}
