
package ch.hearc.cours.moo.tri.scia;

public class Maison implements Comparable<Maison>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Maison(double prix, int surface)
		{
		this.prix = prix;
		this.surface = surface;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Maison [prix=");
		builder.append(this.prix);
		builder.append(", surface=");
		builder.append(this.surface);
		builder.append("]");
		return builder.toString();
		}

	@Override
	public int compareTo(Maison maison2)
		{
		//V1
		//			{
		//			if (this.surface < maison2.surface)
		//				{
		//				return -1;
		//				}
		//			else if (this.surface > maison2.surface)
		//				{
		//				return 1;
		//				}
		//			else
		//				{
		//				return 0;
		//				}
		//			}

		// V2
		//			{
		//			return (new Integer(this.surface)).compareTo(maison2.surface);
		//			}

		// Autre critère
			{
			int compareSurface = (new Integer(this.surface)).compareTo(maison2.surface);
			if (compareSurface == 0)
				{
				return -(new Double(this.prix)).compareTo(maison2.prix);
				}
			else
				{
				return -compareSurface;
				}
			}
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double getPrix()
		{
		return this.prix;
		}

	public int getSurface()
		{
		return this.surface;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	//Inputs
	private double prix;

	private int surface;

	}
