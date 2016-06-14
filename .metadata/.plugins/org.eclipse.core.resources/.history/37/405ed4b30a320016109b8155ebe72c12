
package ch.hearc.cours.moo.garage;

public class Roue implements Cloneable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Roue(String marque, int taille)
		{
		this.marque = marque;
		this.taille = taille;
		}

	public Roue(Roue source)
		{
		this(source.marque, source.taille);
		}
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Roue [marque=");
		builder.append(this.marque);
		builder.append(", taille=");
		builder.append(this.taille);
		builder.append("]");
		return builder.toString();
		}

	public Roue cloneOf()
		{
		return new Roue(this);
		}

	/**
	 * Object ne peut pas être remplacé par Roue car cela
	 * modifierait la signature de la méthode equals.
	 * Ce qui est interdit dans un contexte de surcharge.
	 */
	@Override
	public boolean equals(Object obj)
		{
		if (obj instanceof Roue)
			{
			Roue roue2 = (Roue)obj;
			return this.isEquals(roue2);
			}
		else
			{
			return false;
			}
		}

	/**
	 * Le paramètre de sortie a pu être passé de Object à Roue
	 * car il ne fait pas partie  de la signature de la méthode clone.
	 * On peut donc le changer dans ce contexte de surcharge.
	 */
	@Override
	protected Roue clone()
		{
//		return cloneOf();
		return this.cloneOf();
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Roue roue2)
		{
		return this.marque.equals(roue2.marque) && this.taille == roue2.taille;
		}
	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setMarque(String marque)
		{
		this.marque = marque;
		}

	public void setTaille(int taille)
		{
		this.taille = taille;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getMarque()
		{
		return this.marque;
		}

	public int getTaille()
		{
		return this.taille;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private String marque;
	private int taille;
	}
