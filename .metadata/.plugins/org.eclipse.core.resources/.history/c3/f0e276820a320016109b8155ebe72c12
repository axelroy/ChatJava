
package ch.hearc.cours.moo.heritage.animal.oiseaux.concret;

import ch.hearc.cours.moo.heritage.animal.oiseaux.Oiseaux;

public class Rapaces extends Oiseaux
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Rapaces(String nom, int nbPlumes)
		{
		super(nom, nbPlumes);
		}

	public Rapaces(Rapaces source)
		{
		super(source);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Rapaces.class.getSimpleName();
		}

	@Override
	public String mange()
		{
		return FOOD;
		}

	@Override
	public Rapaces cloneOf()
		{
		return new Rapaces(this);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String FOOD = "marmotte";

	}
