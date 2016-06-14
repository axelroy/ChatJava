
package ch.hearc.cours.moo.generic;

import java.util.LinkedList;
import java.util.List;

public class Pile<T>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Pile()
		{
		list = new LinkedList<T>();
		}

	public Pile(Pile<T> source)
		{
		this();
		for(T value:source.list)
			{
			//copie superficielle autorisé car Integer (Wrapper) est inatérable
			list.add(value);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Pile [list=");
		builder.append(this.list);
		builder.append("]");
		return builder.toString();
		}

	public synchronized boolean push(T value)
		{
		return list.add(value);
		}

	public synchronized T pop()
		{
		if (size() >= 1)
			{
			return list.remove(size() - 1);
			}
		else
			{
			System.err.println("[Pile]:pop Pile vide");
			return null;
			}
		}

	public synchronized int size()
		{
		return list.size();
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

	//Tools
	private List<T> list;

	}
