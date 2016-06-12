
package ch.hearc.cours.kitbase.equations;

import static java.lang.Math.PI;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.hearc.cours.kitbase.tools.Tab1DTools;

public class QuadratiqueTest
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
	public void test2Solutions()
		{
		// Solutions enti�res
			{
			double a = -2.0;
			double b = -2.0;
			double c = 4.0;
			double[] tabSolutionsEmpirique = Quadratique.solve(a, b, c);
			double[] tabSolutionsTheoriques = { 1.0, -2.0 };

			assertTrue(tabSolutionsEmpirique.length == 2);
			assertTrue(tabSolutionsTheoriques.length == 2);
			assertTrue(Tab1DTools.isEqualsSansOrdre(tabSolutionsEmpirique, tabSolutionsTheoriques));
			}

		// Solutions � virugle flottante
			{
			double a = Math.sqrt(2);
			double b = -Math.sqrt(2) * (Math.E + PI);
			double c = Math.sqrt(2) * PI * Math.E;

			double[] tabSolutionsEmpirique = Quadratique.solve(a, b, c);
			double[] tabSolutionsTheoriques = { PI, Math.E };

			assertTrue(tabSolutionsEmpirique.length == 2);
			assertTrue(tabSolutionsTheoriques.length == 2);
			assertTrue(Tab1DTools.isEqualsSansOrdre(tabSolutionsEmpirique, tabSolutionsTheoriques));
			}
		}

	@Test
	public void test1Solutions()
		{
		double a = 3.0;
		double b = -6.0;
		double c = 3.0;
		double[] tabSolutionsEmpirique = Quadratique.solve(a, b, c);
		double[] tabSolutionsTheoriques = { 1.0 };

		assertTrue(tabSolutionsEmpirique.length == 1);
		assertTrue(tabSolutionsTheoriques.length == 1);
		assertTrue(Tab1DTools.isEquals(tabSolutionsEmpirique, tabSolutionsTheoriques));
		}

	@Test
	public void test0Solutions()
		{
		double a = 1.0;
		double b = 1.0;
		double c = 1.0;
		double[] tabSolutionsEmpirique = Quadratique.solve(a, b, c);
		double[] tabSolutionsTheoriques = {};

		assertTrue(tabSolutionsEmpirique.length == 0);
		assertTrue(tabSolutionsTheoriques.length == 0);
		}

	/*------------------------------------------------------------------*\
		|*							Methodes Private						*|
		\*------------------------------------------------------------------*/

	}