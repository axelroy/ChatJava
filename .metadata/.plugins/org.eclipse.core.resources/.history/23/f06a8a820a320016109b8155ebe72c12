
package ch.hearc.cours.moo.heritage.animal.mammifere.felin.concret;

import ch.hearc.cours.moo.heritage.animal.mammifere.felin.Felins;

public class Tigres extends Felins
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Tigres(String nom)
		{
		super(nom);
		}

	public Tigres(Tigres source)
		{
		super(source);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Tigres.class.getSimpleName();
		}

	@Override
	public String mange()
		{
		return FOOD;
		}

	@Override
	public Tigres cloneOf()
		{
		return new Tigres(this);
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

	private static final String FOOD = "gazelles";


	}
