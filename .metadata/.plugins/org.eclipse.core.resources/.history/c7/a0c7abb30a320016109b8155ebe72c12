
package ch.hearc.cours.moo.thread.de;

import java.util.Random;

/**
 * Utilise moyenneur
 */
public class MoyenneurParallel implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public MoyenneurParallel(int nbExperience, int nbFace)
		{
		this.nbExperience = nbExperience;
		this.nbFace = nbFace;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		try
			{
			int nbCore = Runtime.getRuntime().availableProcessors();

			parallel(nbCore);
			}
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public int getNbLancerMoyen()
		{
		return this.nbLancerMoyen;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void parallel(int nbThread) throws InterruptedException
		{
		Thread[] tabThread = new Thread[nbThread];
		Moyenneur[] tabMoyenneur = new Moyenneur[nbThread];

		// lancer thread
			{
			int nbExperienceThread = nbExperience / nbThread;

			for(int i = 0; i < nbThread; i++)
				{
				Random random = new Random(System.currentTimeMillis() + i * 1000); // un random different par thread!

				tabMoyenneur[i] = new Moyenneur(nbExperienceThread, nbFace, random);

				tabThread[i] = new Thread(tabMoyenneur[i]);
				tabThread[i].start();
				}
			}

		long nbLancer = 0;
		// recuperer resultat
			{
			for(int i = 0; i < nbThread; i++)
				{
				tabThread[i].join();
				nbLancer += tabMoyenneur[i].getNbLancer();
				}
			}

		// consolider
		nbLancerMoyen = (int)Math.ceil(nbLancer / (double)nbExperience);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Inputs
	private int nbExperience;
	private int nbFace;

	// Outputs
	private int nbLancerMoyen;

	}
