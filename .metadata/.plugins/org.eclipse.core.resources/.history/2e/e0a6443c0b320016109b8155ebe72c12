
package ch.hearc.cours.moo.garage;

import java.util.Arrays;

public class Voiture
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Voiture(StringBuilder marque, Roue[] tabRoues)
		{
		this.marque = marque;
		this.tabRoues = tabRoues;
		}

	public Voiture(Voiture source)
		{
		this(new StringBuilder(source.marque), cloneTableau(source.tabRoues));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Voiture [marque=");
		builder.append(this.marque);
		builder.append(", tabRoues=");
		builder.append(Arrays.toString(this.tabRoues));
		builder.append("]");
		return builder.toString();
		}

	public Voiture cloneOf()
		{
		return new Voiture(this);
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	//TODO equals to isEquals

	public boolean isEquals(Voiture voiture2)
		{
		if (!this.marque.equals(voiture2.marque))
			{
			return false;
			}
		else if (this.tabRoues.length != voiture2.tabRoues.length)
			{
			return false;
			}
		else
			{
			int n = this.tabRoues.length;
			for(int i = 0; i < n; i++)
				{
				if(!this.tabRoues[i].isEquals(voiture2.tabRoues[i]))
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

	public void setMarque(StringBuilder marque)
		{
		this.marque = marque;
		}

	public void setTabRoues(Roue[] tabRoues)
		{
		this.tabRoues = tabRoues;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Roue[] getTabRoues()
		{
		return this.tabRoues;
		}

	public StringBuilder getMarque()
		{
		return this.marque;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static Roue[] cloneTableau(Roue[] tabRouesSource)
		{
		int n = tabRouesSource.length;
		Roue[] tabRouesCopie = new Roue[n];

		int i = 0;
		for(Roue roueSource:tabRouesSource)
			{
			Roue roueCopie = new Roue(roueSource);
			tabRouesCopie[i] = roueCopie;
			i++;
			}
		return tabRouesCopie;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Inputs
	private StringBuilder marque;
	private Roue[] tabRoues;

	//Output

	//Tools
	}
