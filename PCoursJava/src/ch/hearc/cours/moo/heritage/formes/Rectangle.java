
package ch.hearc.cours.moo.heritage.formes;

import ch.hearc.cours.kitbase.tools.MathTools;

public class Rectangle extends Formes
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Rectangle(String nom, double w, double h)
		{
		super(nom);
		this.w = w;
		this.h = h;
		}

	public Rectangle(Rectangle source)
		{
		super(source);
		this.w = source.w;
		this.h = source.h;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append("\nwidth: ");
		stringBuilder.append(w);
		stringBuilder.append("\nheight: ");
		stringBuilder.append(h);
		return stringBuilder.toString();
		}

	@Override
	public double perimetre()
		{
		return 2 * (w + h);
		}

	@Override
	public double aire()
		{
		return w * h;
		}

	@Override
	public Rectangle cloneOf()
		{
		return new Rectangle(this);
		}

	public boolean isEquals(Rectangle f2)
		{
		return super.isEquals(f2) && MathTools.isEquals(w, f2.w, 1e-6) && MathTools.isEquals(h, f2.h, 1e-6);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Inputs
	private double w;
	private double h;

	}
