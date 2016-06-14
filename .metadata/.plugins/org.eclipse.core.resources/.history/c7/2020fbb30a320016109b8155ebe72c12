
package ch.hearc.cours.io.file.object.bin;

import java.io.Serializable;

public class Homme implements Serializable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Homme(String nom, int poids)
		{
		this.nom = nom;
		this.poids = poids;
		}

	public Homme(Homme source)
		{
		this(source.nom, source.poids);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Homme [nom=");
		builder.append(this.nom);
		builder.append(", poids=");
		builder.append(this.poids);
		builder.append("]");
		return builder.toString();
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Homme homme2)
	{
		return this.nom.equals(homme2.nom) && this.poids == homme2.poids;
	}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setNom(String nom)
		{
		this.nom = nom;
		}


	public void setPoids(int poids)
		{
		this.poids = poids;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getNom()
		{
		return this.nom;
		}


	public int getPoids()
		{
		return this.poids;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/







	//inputs
	private String nom;
	private int poids;
	}
