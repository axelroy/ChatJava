
package ch.hearc.cours.moo.heritage.formes;

import ch.hearc.cours.kitbase.tools.MathTools;

public class Ellipse extends Formes
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Ellipse(String nom, double rw, double rh)
		{
		super(nom);
		this.rw = rw;
		this.rh = rh;
		}

	public Ellipse(Ellipse source)
		{
		super(source);
		this.rw = source.rw;
		this.rh = source.rh;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append("\nrw:");
		stringBuilder.append(rw);
		stringBuilder.append("\nrh:");
		stringBuilder.append(rh);
		return stringBuilder.toString();
		}

	@Override
	public double perimetre()
		{
		return Math.PI * Math.sqrt(2 * (rh * rh + rw * rw)); //Approximation
		}

	@Override
	public double aire()
		{
		return Math.PI * rh * rw;
		}

	@Override
	public Ellipse cloneOf()
		{
		return new Ellipse(this);
		}

	public boolean isEquals(Ellipse e2)
		{
		return super.isEquals(e2) && MathTools.isEquals(rw, e2.rw, 1e-6) && MathTools.isEquals(rh, e2.rh, 1e-6);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private double rw;
	private double rh;

	}
