
package ch.hearc.cours.moo.heritage.animal;

public abstract class Animals
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Animals(String nom)
		{
		this.nom = nom;
		}

	public Animals(Animals source)
		{
		this(source.nom); // copie superficielle autorisé car classe inaltérable
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Abstract						*|
	\*------------------------------------------------------------------*/

	public abstract String mange();

	public abstract Animals cloneOf();

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public boolean isEquals(Animals a2)
		{
		boolean isSameClass;

		//v1
			{
			isSameClass = this.getClass().getName().equals(a2.getClass().getName());
			}

		return this.nom.equals(a2.nom) && isSameClass;

		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setNom(String nom)
		{
		this.nom = nom;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getNom()
		{
		return this.nom;
		}

	public String nomClass()
		{
		return Animals.class.getSimpleName();
		}

	@Override
	public String toString()
		{
		return "nom classe: " + this.nomClass() + "\n" + "nom: " + this.nom + "\n" + "mange:" + mange();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	// input
	private String nom;

	}
