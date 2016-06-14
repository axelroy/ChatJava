
package ch.hearc.cours.moo.heritage.animal.oiseaux.concret;

import ch.hearc.cours.moo.heritage.animal.oiseaux.Oiseaux;

public class Canards extends Oiseaux
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Canards(String nom, int nbPlumes)
		{
		super(nom, nbPlumes);
		}

	public Canards(Canards source)
		{
		super(source);
		}
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Canards.class.getSimpleName();
		}

	@Override
	public String mange()
		{
		return FOOD;
		}

	@Override
	public Canards cloneOf()
		{
		return new Canards(this);
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

	private static final String FOOD = "pain";

	}
