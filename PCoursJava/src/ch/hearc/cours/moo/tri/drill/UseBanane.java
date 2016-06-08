
package ch.hearc.cours.moo.tri.drill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ch.hearc.cours.kitbase.tools.RandomTools;

public class UseBanane
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
		//useSimple();
		//useTriSimple();
		useTriCroise();
		useTriDecroissantPoids();
		}

	private static void useTriDecroissantPoids()
		{
		int n = 20;
		List<Banane> listBanane = createBanane(n);

		Comparator<Banane> comparatorPoids = new Comparator<Banane>()
			{

			@Override
			public int compare(Banane b1, Banane b2)
				{
				return Integer.compare(b1.getPoids(), b2.getPoids()) * -1;
				}
			};
		listBanane.sort(comparatorPoids);
		System.out.println(listBanane);
		}

	private static void useSimple()
		{
		int n = 5;
		List<Banane> listBanane = createBanane(n);
		System.out.println(listBanane);
		}

	private static void useTriSimple()
		{
		int n = 20;
		List<Banane> listBanane = createBanane(n);
		Comparator<Banane> comparatorPrix = new Comparator<Banane>()
			{

			@Override
			public int compare(Banane b1, Banane b2)
				{
				return Integer.compare(b1.getPrix(), b2.getPrix());
				}
			};
		Collections.sort(listBanane, comparatorPrix);
		System.out.println(listBanane);
		}

	private static void useTriCroise()
		{
		int n = 20;
		List<Banane> listBanane = createBanane(n);
		Comparator<Banane> comparatorPrixPoids = new Comparator<Banane>()
			{

			@Override
			public int compare(Banane b1, Banane b2)
				{
				if (b1.getPrix() == b2.getPrix())
					{
					return Integer.compare(b1.getPoids(), b2.getPoids());
					}
				else
					{
					return Integer.compare(b1.getPrix(), b2.getPrix());
					}
				}
			};
		listBanane.sort(comparatorPrixPoids);
		System.out.println(listBanane);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static List<Banane> createBanane(int n)
		{
		List<Banane> listeBanane = new ArrayList<Banane>(n);

		for(int i = 0; i < n; i++)
			{
			Banane banane = createAleatoire();
			listeBanane.add(banane);
			}

		return listeBanane;
		}

	private static Banane createAleatoire()
		{
		int poids = aleatoire(1000, 2000);
		int prix = aleatoire(10, 20);
		return new Banane(poids, prix);
		}

	private static int aleatoire(int min, int max)
		{
		return RandomTools.randomMinMax(min, max);
		}
	}
