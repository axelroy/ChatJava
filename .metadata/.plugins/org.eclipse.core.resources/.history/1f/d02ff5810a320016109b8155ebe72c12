
package ch.hearc.cours.moo.tri.scia;

import java.util.Arrays;
import java.util.Comparator;

public class UseMaison
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
		useFiger();
		useFlexible();
		useFlexibleClasseInterneAnonyme();
		useFlexibleClasseInterneAnonymeV2();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * Utilise comme critère de tri la méthode compareTo de la classe Maison.
	 * Le critère de tri ne peut pas être changé facilement.
	 */
	private static void useFiger()
		{
		int n = 3;
		Maison[] tabMaison = createTabMaion(n);
		sort(tabMaison);
		System.out.println(Arrays.toString(tabMaison));
		}

	/**
	 * Possibilité de choisir à la volée le critère de comparaison.
	 */
	private static void useFlexible()
		{
		int n = 3;
		Maison[] tabMaison = createTabMaion(n);
		Arrays.sort(tabMaison, new MaisonComparatorSurface()); // Tri sur place
		System.out.println(Arrays.toString(tabMaison));
		Arrays.sort(tabMaison, new MaisonComparatorPrix());
		}

	/**
	 * Même objectif que useFlexible mais sans classe et fichier externe
	 */
	private static void useFlexibleClasseInterneAnonyme()
		{
		int n = 3;
		Maison[] tabMaison = createTabMaion(n);
		Arrays.sort(tabMaison, new Comparator<Maison>()
			{

			@Override
			public int compare(Maison maison1, Maison maison2)
				{
				return (new Integer(maison1.getSurface()).compareTo(maison2.getSurface()));
				}

			}); // Tri sur place
		System.out.println(Arrays.toString(tabMaison));
		Arrays.sort(tabMaison, new Comparator<Maison>()
			{

			@Override
			public int compare(Maison maison1, Maison maison2)
				{
				return (new Double(maison1.getPrix()).compareTo(maison2.getPrix()));
				}
			});
		}

	private static void useFlexibleClasseInterneAnonymeV2()
		{
		int n = 3;
		Maison[] tabMaison = createTabMaion(n);
		Comparator<Maison> comparateurMaisonSurface = new Comparator<Maison>()
			{

			@Override
			public int compare(Maison maison1, Maison maison2)
				{
				return (new Integer(maison1.getSurface()).compareTo(maison2.getSurface()));
				}
			};
		Comparator<Maison> comparateurMaisonPrix = createComparatorPrix();

		Arrays.sort(tabMaison, comparateurMaisonSurface);
		Arrays.sort(tabMaison, comparateurMaisonPrix);
		}

	private static Comparator<Maison> createComparatorPrix()
		{
		return new Comparator<Maison>()
			{

			@Override
			public int compare(Maison maison1, Maison maison2)
				{
				return (new Double(maison1.getPrix()).compareTo(maison2.getPrix()));
				}
			};
		}

	private static Maison[] createTabMaion(int n)
		{
		Maison[] tab = new Maison[n];
		for(int i = 0; i < n - 1; i++)
			{
			tab[i] = new Maison(i * Math.PI, i);
			}
		tab[n - 1] = new Maison(10000, 0);
		return tab;
		}

	private static void sort(Maison[] tabMaison)
		{
		Arrays.sort(tabMaison); // Tri sur place
		}

	}
