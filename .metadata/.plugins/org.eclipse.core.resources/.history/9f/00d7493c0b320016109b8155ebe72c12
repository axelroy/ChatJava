
package ch.hearc.cours.moo.doublerepresentation;

import ch.hearc.cours.kitbase.tools.MathTools;

public class Complex
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Complex(double re, double im)
		{
		this.re = re;
		this.im = im;

		updatePolar();
		}

	public Complex(Complex source)
		{
		this(source.re, source.im);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append(S1);
		builder.append(this.re);
		builder.append(S2);
		builder.append(this.im);
		builder.append(S3);
		builder.append(this.module);
		builder.append(S4);
		builder.append(this.argument);
		builder.append(S5);
		return builder.toString();
		}

	public Complex add(Complex z2)
		{
		//		//V1 Catastrophique, non robuste � l'ajout de la rep�sentation polaire.
		//n�c�ssite  alors updater le code. V2 s'affranchit par contre totalement de cette probl�matique.
		//			{
		//			Complex z = new Complex(0, 0);
		//			z.re = re + z2.re;
		//			z.im = im + z2.im;
		//			return z;
		//			}
		//V2
		return new Complex(re + z2.re, im + z2.im);
		}

	public void adds(Complex z2)
		{
		this.re += z2.re;
		this.im += z2.im;
		updatePolar();
		}

	public Complex mult(double alpha)
		{
		return new Complex(re * alpha, im * alpha);
		}

	public Complex mult(Complex z2)
		{
		double module = this.module * z2.module;
		double argument = this.argument + z2.argument;
		return Complex.createPolar(module, argument);
		}

	public Complex div(double alpha)
		{
		return this.mult(1 / alpha);
		}

	public Complex sub(Complex z2)
		{
		return this.add(z2.opposite());
		}

	public Complex opposite()
		{
		return this.mult(-1);
		}

	public Complex pow(int n)
		{
		double module = Math.pow(this.module, n);
		double argument = this.argument * n;
		return Complex.createPolar(module, argument);
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Complex z2)
		{
		return this.isEquals(z2, EPSILON);
		}

	public boolean isEquals(Complex z2, double epsilon)
		{
		return MathTools.isEquals(this.re, z2.re, epsilon) && MathTools.isEquals(this.im, z2.im, epsilon);
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setRe(double re)
		{
		this.re = re;
		updatePolar();
		}

	public void setIm(double im)
		{
		this.im = im;
		updatePolar();
		}

	public void setArgument(double argument)
		{
		this.argument = argument;
		updateCartesian();
		}

	public void setModule(double module)
		{
		this.module = module;
		updateCartesian();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double getRe()
		{
		return this.re;
		}

	public double getIm()
		{
		return this.im;
		}

	public double getArgument()
		{
		return this.argument;
		}

	public double getModule()
		{
		return this.module;
		}

	/*------------------------------------------------------------------*\
	|*							M�thodes Static 						*|
	\*-----------------------------------------------------------------*/

	public static Complex createPolar(double module, double argument)
		{
		return new Complex(toRe(module, argument), toIm(module, argument));
		}

	public static Complex createCartesian(double re, double im)
		{
		return new Complex(re, im);
		}

	public static double toRe(double module, double argument)
		{
		return module * Math.cos(argument);
		}

	public static double toIm(double module, double argument)
		{
		return module * Math.sin(argument);
		}

	public static double toModule(double re, double im)
		{
		return Math.sqrt(re * re + im * im);
		}

	public static double toArgument(double re, double im)
		{
		return Math.atan2(im, re);
		}

	public static Complex gravity(Complex[] tabZ)
		{
		Complex zGravity = new Complex(0, 0);
		for(Complex z:tabZ)
			{
			//zGravity = zGravity.add(z);
			zGravity.adds(z);
			}
		return zGravity.div(tabZ.length);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void updatePolar()
		{
		this.module = Complex.toModule(re, im);
		this.argument = toArgument(re, im);
		}

	private void updateCartesian()
		{
		this.re = Complex.toRe(module, argument);
		this.im = Complex.toIm(module, argument);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input : Forme cartesienne
	private double re;
	private double im;

	//input : Forme polaire
	private double argument;
	private double module;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final double EPSILON = 1e-6;
	private static final String S1 = "Z = ";
	private static final String S2 = " + i(";
	private static final String S3 = ") = ";
	private static final String S4 = "ei(";
	private static final String S5 = ")";

	}
