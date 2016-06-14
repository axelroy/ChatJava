
package ch.hearc.cours.moo.garage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Garage implements Iterable<Voiture>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Garage(String nom)
		{
		//Input
		this.nom = nom;

		//Tools
		this.listVoitures = new LinkedList<Voiture>();
		}

	public Garage(Garage source)
		{
		this(source.nom);

		//for(Voiture voitureSource:source.listVoitures)
		for(Voiture voitureSource:source)
			{
			Voiture voitureCopie = new Voiture(voitureSource);
			this.listVoitures.add(voitureCopie);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Iterator<Voiture> iterator()
		{
		return listVoitures.iterator();
		}

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Garage [nom=");
		builder.append(this.nom);
		builder.append(", listVoitures=");
		builder.append(this.listVoitures);
		builder.append("]");
		return builder.toString();
		}

	public boolean add(Voiture voiture)
		{
		return listVoitures.add(voiture);
		}

	public boolean remove(Voiture voiture)
		{
		return listVoitures.remove(voiture);
		}

	public int size()
		{
		return listVoitures.size();
		}

	public Garage cloneOf()
		{
		return new Garage(this);
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Garage garage2)
		{
		if (this.listVoitures.equals(garage2.listVoitures))
			{
			return true;
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

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private String nom;

	//Tools
	private List<Voiture> listVoitures;

	}
