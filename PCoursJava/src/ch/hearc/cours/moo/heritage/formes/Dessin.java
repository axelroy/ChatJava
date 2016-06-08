
package ch.hearc.cours.moo.heritage.formes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import ch.hearc.cours.kitbase.tools.MathTools;

public class Dessin implements Iterable<Formes>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Dessin(String nom)
		{
		this.nom = nom;
		listFormes = new ArrayList<Formes>();
		}

	public Dessin(Dessin source)
		{
		this(source.nom);

		for(Formes f:source)
			{
			this.listFormes.add(f.cloneOf());
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Iterator<Formes> iterator()
		{
		return listFormes.iterator();
		}

	public Dessin cloneOf()
		{
		return new Dessin(this);
		}

	@Override
	public String toString()
		{
		StringBuilder stringBuilder = new StringBuilder();
		for(Formes f:this)
			{
			stringBuilder.append(f.toString());
			stringBuilder.append("\n");
			}

		return stringBuilder.toString();
		}

	public boolean isEquals(Dessin d2)
		{
		if (listFormes.size() != d2.listFormes.size())
			{
			return false;
			}
		else if (!this.nom.equals(d2.nom))
			{
			return false;
			}
		else
			{

			Comparator<Formes> comparator = new Comparator<Formes>()
				{

				@Override
				public int compare(Formes f1, Formes f2)
					{
					if (f1.getNom().equals(f2.getNom()))
						{
						if (MathTools.isEquals(f1.aire(), f2.aire(), 1e-6))
							{
							return new Double(f1.perimetre()).compareTo(f2.perimetre());
							}
						else
							{
							return new Double(f1.aire()).compareTo(f2.aire());
							}
						}
					else
						{
						return f1.getNom().compareTo(f2.getNom());
						}
					}
				};

			Collections.sort(listFormes, comparator);
			Collections.sort(d2.listFormes, comparator);

			Iterator<Formes> iterator1 = listFormes.iterator();
			for(Formes f2:d2)
				{
				Formes f1 = iterator1.next();
				if (!f1.isEquals(f2)) { return false; }
				}
			return true;
			}
		}

	public double aire()
		{
		double total = 0;

		for(Formes f:this)
			{
			total += f.aire();
			}

		return total;
		}

	public double perimetre()
		{
		double total = 0;

		Iterator<Formes> iterator = listFormes.iterator();
		while(iterator.hasNext())
			{
			Formes f = iterator.next();
			total += f.perimetre();
			}

		return total;
		}

	public boolean add(Formes f)
		{
		return listFormes.add(f);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Inputs
	private String nom;

	//Tools
	private List<Formes> listFormes;

	}
