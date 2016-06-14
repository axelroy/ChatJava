
package ch.hearc.cours.moo.heritage.animal.mammifere.rongeur;

import ch.hearc.cours.moo.heritage.animal.mammifere.Mammiferes;

public abstract class Rongeurs extends Mammiferes
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Rongeurs(String nom)
		{
		super(nom, TEMP_SANG);
		}

	public Rongeurs(Rongeurs source)
		{
		super(source);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Rongeurs.class.getSimpleName();
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

	static private final int TEMP_SANG = 33;
	}
