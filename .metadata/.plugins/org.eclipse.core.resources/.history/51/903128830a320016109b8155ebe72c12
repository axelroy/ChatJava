
package ch.hearc.cours.kitbase.equations;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineaireTest
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
	public void testLineaire()
		{
		double a = 2.0;
		double b = 8.0;
		double resultatEmpirique = Lineaire.solve(a, b);
		double resultatTheorique = -4.0;
		assertTrue(resultatEmpirique == resultatTheorique);
		}

	@Test
	public void testLineaireTableau()
		{
		double[] tab = { 2.0, 8.0 };
		double resultatEmpirique = Lineaire.solve(tab);
		double resultatTheorique = -4.0;
		assertTrue(resultatEmpirique == resultatTheorique);
		}


	/*------------------------------------------------------------------*\
		|*							Methodes Private						*|
		\*------------------------------------------------------------------*/

	}
