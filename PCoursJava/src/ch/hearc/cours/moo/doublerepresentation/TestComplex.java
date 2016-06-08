
package ch.hearc.cours.moo.doublerepresentation;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestComplex
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	@Before
	public void before()
		{
		// rien
		}

	@After
	public void after()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*-----------------------------------------------------------------*/

	@Test
	public void testAdd()
		{
		Complex z1 = new Complex(200, 10);
		Complex z2 = new Complex(2000, 100);

		Complex zTheorique = new Complex(2200, 110);
		Complex zEmpirique = z1.add(z2);

		assertTrue(zTheorique.isEquals(zEmpirique, 0));
		}

	@Test
	public void testGravite()
		{
		double rayon = 100;
		int n = 10;
		Complex c = new Complex(33, 66);

		Complex[] tabComplex = createCercle(rayon, n, c);

		Complex resultatEmpirique = Complex.gravity(tabComplex);
		Complex resultatTheorique = c;
		double epsilon = 1e-15;

		assertTrue(resultatEmpirique.isEquals(resultatTheorique, epsilon));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private Complex[] createCercle(double rayon, int n, Complex c)
		{
		Complex[] tabZ = new Complex[n];

		double dAlpha = Math.PI * 2 / n;
		double alpha = 0;

		for(int i = 0; i < n; i++)
			{
			tabZ[i] = Complex.createPolar(rayon, alpha);
			alpha += dAlpha;

			//translation
			tabZ[i].adds(c);
			}

		return tabZ;
		}

	}
