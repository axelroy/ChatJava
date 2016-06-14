
package ch.hearc.cours.kitbase.container.de;

import java.util.HashSet;
import java.util.Set;

import ch.hearc.cours.kitbase.tools.RandomTools;

public class De
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static int moyenneur(int nbFaces, int nbExperiences)
		{
		int nbLances = 0;
		Set<Integer> setValeurs = new HashSet<Integer>(nbFaces);
		for(int i = 0; i < nbExperiences; i++)
			{
			while(setValeurs.size() < nbFaces)
				{
				setValeurs.add(RandomTools.random(nbFaces));
				nbLances++;
				}
			setValeurs.clear();
			}
		return (int)Math.ceil(nbLances / (double)nbExperiences);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
