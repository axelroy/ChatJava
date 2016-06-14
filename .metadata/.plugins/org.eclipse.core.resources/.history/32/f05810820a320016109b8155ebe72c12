
package ch.hearc.cours.moo.thread.de;

import java.util.Random;

import ch.hearc.cours.kitbase.tools.RandomTools;

public class Experience implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Experience(int nbFaces, Random random)
		{
		this.nbFaces = nbFaces;
		this.random = random;

		this.tabFaceObtenue = new boolean[nbFaces];
		}

	public Experience(int nbFaces)
		{
		this(nbFaces, new Random(System.currentTimeMillis()));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		reset();

		while(!isFull())
			{
			int face = RandomTools.random(random, nbFaces);

			tabFaceObtenue[face-1] = true;

			nbLances++;
			}
		}

	public void reset()
		{
		nbLances = 0;

		for(int i = 0; i < nbFaces; i++)
			{
			tabFaceObtenue[i] = false;
			}
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public int getNbLances()
		{
		return this.nbLances;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/


	private boolean isFull()
		{
		boolean isFull = true;
		for(int i = 0; i < nbFaces; i++)
			{
			isFull &= tabFaceObtenue[i];
			}

		return isFull;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private int nbFaces;

	//output
	private int nbLances;

	// tools
	private Random random;
	private boolean[] tabFaceObtenue;



	}
