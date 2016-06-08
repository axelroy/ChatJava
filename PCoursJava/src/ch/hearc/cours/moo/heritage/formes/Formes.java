
package ch.hearc.cours.moo.heritage.formes;

public abstract class Formes
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Formes(String nom)
		{
		this.nom = nom;
		}

	public Formes(Formes source)
		{
		this(source.nom);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Abstract						*|
	\*------------------------------------------------------------------*/

	public abstract double perimetre();

	public abstract double aire();

	public abstract Formes cloneOf();

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public boolean isEquals(Formes f2)
		{
		return nom.equals(f2.nom) && this.getClass().getName().equals(f2.getClass().getName());
		}

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Formes [nom=");
		builder.append(this.nom);
		builder.append("]");
		builder.append("\nAire: ");
		builder.append(aire());
		builder.append("\nPerimetre:");
		builder.append(perimetre());
		return builder.toString();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getNom()
		{
		return nom;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Inputs
	private String nom;

	}
