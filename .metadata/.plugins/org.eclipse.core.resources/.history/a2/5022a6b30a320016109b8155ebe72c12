
package ch.hearc.cours.moo.tri.drill;

public class Banane
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Banane(int poids, int prix)
		{
		this.poids = poids;
		this.prix = prix;
		}

	public Banane(Banane source)
		{
		this(source.poids, source.prix);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Banane [poids=");
		builder.append(this.poids);
		builder.append(", prix=");
		builder.append(this.prix);
		builder.append("]");
		return builder.toString();
		}

	public Banane cloneOf()
		{
		return new Banane(this);
		}

	@Override
	protected Banane clone() throws CloneNotSupportedException
		{
		return this.cloneOf();
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Banane b2)
		{
		return b2.poids == this.poids && b2.prix == this.prix;
		}

	@Override
	public boolean equals(Object obj)
		{
		if (obj instanceof Banane)
			{
			Banane banane = (Banane)obj;

			return this.isEquals(banane);
			}
		else
			{
			return false;
			}
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public int getPoids()
		{
		return this.poids;
		}

	public int getPrix()
		{
		return this.prix;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Inputs

	private int poids;
	private int prix;

	}
