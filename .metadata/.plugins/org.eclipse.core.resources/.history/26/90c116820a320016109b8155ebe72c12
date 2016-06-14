
package ch.hearc.cours.moo.thread.de;

import ch.hearc.cours.moo.tools.Chrono;

public class UseDe
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	private static void main()
		{
		int nbExperience = Integer.MAX_VALUE / 50;
		int nbFace = 6;

		long timeSequentiel = sequentiel(nbExperience, nbFace);
		long timeParallel = parallel(nbExperience, nbFace);

		analysePerformance(timeSequentiel, timeParallel);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static long sequentiel(int nbExperience, int nbFace)
		{
		Chrono chrono = new Chrono();
		Moyenneur moyenneur = new Moyenneur(nbExperience, nbFace);
		moyenneur.run();
		chrono.stop();

		System.out.println("\nSequentiel");
		System.out.println("#LancerMoyen  = " + moyenneur.getNbLancerMoyen());
		System.out.println("#nbExperience = " + nbExperience);
		System.out.println("Durée         = " + chrono + " (ms)");

		return chrono.getTime();
		}

	private static long parallel(int nbExperience, int nbFace)
		{
		Chrono chrono = new Chrono();
		MoyenneurParallel moyenneur = new MoyenneurParallel(nbExperience, nbFace);
		moyenneur.run();
		chrono.stop();

		System.out.println("\nParallel");
		System.out.println("#LancerMoyen  = " + moyenneur.getNbLancerMoyen());
		System.out.println("#nbExperience = " + nbExperience);
		System.out.println("Durée         = " + chrono + " (ms)");

		return chrono.getTime();
		}

	private static void analysePerformance(long timeSequentiel, long timeParallel)
		{
		float ratio = timeSequentiel / (float)timeParallel;
		int nbCore = Runtime.getRuntime().availableProcessors();

		System.out.println("\nAnalyse Performance");
		System.out.println("nbCore = " + nbCore);
		System.out.println("ratio  = " + ratio);
		}

	}
