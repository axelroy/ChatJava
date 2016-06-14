
package ch.hearc.cours.moo.heritage.animal.mammifere;

import ch.hearc.cours.moo.heritage.animal.Animals;

public abstract class Mammiferes extends Animals
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 *  la signature du constructeur est égal à la signature du constructeur de la classe parente
	 *  a laquel on a rajouté les attributes de la classe mammifère.
	 */
	public Mammiferes(String nom, int tempSang)
		{
		super(nom);
		this.tempSang = tempSang;
		}

	public Mammiferes(Mammiferes source)
		{
		//v1
		super(source);
		this.tempSang = source.tempSang;

		//v2
		//this(source.getNom(), source.tempSang);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String nomClass()
		{
		return super.nomClass() + "." + Mammiferes.class.getSimpleName();
		}

	@Override
	public String toString()
		{
		return "\n" + super.toString() + "\ntempérature: " + this.tempSang + " degré, ";
		}


	public boolean isEquals(Mammiferes m2)
		{
		return super.isEquals(m2) && this.tempSang == m2.tempSang;
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setTempSang(int tempSang)
		{
		this.tempSang = tempSang;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public int getTempSang()
		{
		return this.tempSang;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// input
	private int tempSang;
	}
