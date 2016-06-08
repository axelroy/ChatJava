
package ch.hearc.cours.moo.heritage.animal.mammifere.felin.concret;

import ch.hearc.cours.moo.heritage.animal.mammifere.felin.Felins;

public class Chats extends Felins
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Chats(String nom)
		{
		super(nom);
		}

	public Chats(Chats source)
		{
		super(source);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Chats.class.getSimpleName();
		}

	@Override
	public String mange()
		{
		return FOOD;
		}

	@Override
	public Chats cloneOf()
		{
		return new Chats(this);
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

	private static final String FOOD = "souris";

	}
