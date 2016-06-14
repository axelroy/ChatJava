
package ch.hearc.cours.io.file.object.bin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Equipe implements Iterable<Homme>,Serializable
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Equipe(String nom)
		{
		this.nom = nom;
		this.list = new ArrayList<Homme>();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public boolean add(Homme homme)
		{
		return list.add(homme);
		}

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Equipe [list=");
		builder.append(this.list);
		builder.append(", nom=");
		builder.append(this.nom);
		builder.append("]");
		return builder.toString();
		}

	@Override
	public Iterator<Homme> iterator()
		{
		return list.iterator();
		}

	public boolean isEquals(Equipe equipe2)
		{
		//TODO: copie des equipes avant le tri pour ne pas modifier l'ordre des listes.
		if (!this.nom.equals(equipe2.nom))
			{
			return false;
			}
		else if(this.list.size() != equipe2.list.size())
			{
			return false;
			}
		else
			{
			Comparator<Homme> comparator = new Comparator<Homme>()
				{

					@Override
					public int compare(Homme h1, Homme h2)
						{
						if(h1.getNom().equals(h2.getNom()))
							{
							return Integer.compare(h1.getPoids(), h2.getPoids());
							}
						else
							{
							return h1.getNom().compareTo(h2.getNom());
							}
						}
				};

			Collections.sort(this.list, comparator);
			Collections.sort(equipe2.list, comparator);

			Iterator<Homme> it2 = equipe2.iterator();

			for(Homme homme1:this)
				{
				Homme homme2 = it2.next();
				if(!homme1.isEquals(homme2))
					{
					return false;
					}
				}
			return true;
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

	//tools
	private List<Homme> list;

	//input
	private String nom;

	}
