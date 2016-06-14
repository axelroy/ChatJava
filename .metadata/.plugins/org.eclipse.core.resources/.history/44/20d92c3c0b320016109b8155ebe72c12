
package ch.hearc.cours.moo.heritage.animal.oiseaux;

import ch.hearc.cours.moo.heritage.animal.Animals;

public abstract class Oiseaux extends Animals
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Oiseaux(String nom, int nbPlumes)
		{
		super(nom);
		this.nbPlumes = nbPlumes;
		}

	public Oiseaux(Oiseaux source)
		{
		super(source);
		this.nbPlumes = source.nbPlumes;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Oiseaux.class.getSimpleName();
		}

	@Override
	public String toString()
		{
		return "\n" + super.toString() + "\nplumes: " + this.nbPlumes + " plumes, ";
		}


	public boolean isEquals(Oiseaux o2)
		{
		return super.isEquals(o2) && this.nbPlumes == o2.nbPlumes;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public int getNbPlumes()
		{
		return this.nbPlumes;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// input
	private int nbPlumes;

	}
