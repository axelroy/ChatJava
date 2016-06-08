
package ch.hearc.cours.moo.heritage.animal.mammifere.rongeur.concret;

import ch.hearc.cours.moo.heritage.animal.mammifere.rongeur.Rongeurs;

public class Souris extends Rongeurs
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Souris(String nom)
		{
		super(nom);
		}

	public Souris(Souris source)
		{
		super(source);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Souris.class.getSimpleName();
		}

	@Override
	public String mange()
		{
		return FOOD;
		}

	@Override
	public Souris cloneOf()
		{
		return new Souris(this);
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

	private static final String FOOD = "fromage";
	}
