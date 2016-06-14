
package ch.hearc.cours.moo.thread.de;

import java.util.Random;

public class Moyenneur implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Moyenneur(int nbExperience, int nbFace, Random random)
		{
		this.nbExperience = nbExperience;
		this.experience = new Experience(nbFace, random);
		}

	public Moyenneur(int nbExperience, int nbFace)
		{
		this(nbExperience, nbFace, new Random(System.currentTimeMillis()));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		nbLancer = 0;
		for(int i = 1; i <= nbExperience; i++)
			{
			experience.reset();
			experience.run();
			nbLancer += experience.getNbLances();
			}

		nbLancerMoyen = (int)Math.ceil(nbLancer / (double)nbExperience);
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public int getNbLancerMoyen()
		{
		return this.nbLancerMoyen;
		}

	public long getNbLancer()
		{
		return this.nbLancer;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Inputs
	private int nbExperience;

	// Outputs
	private int nbLancerMoyen;
	private long nbLancer;

	// Tools
	private Experience experience;

	}
