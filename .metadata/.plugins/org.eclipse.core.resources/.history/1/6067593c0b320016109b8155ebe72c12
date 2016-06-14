
package ch.hearc.cours.kitbase.junit.hello;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest
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
		int a = 5;
		int b = 8;
		int resultatEmpirique = Calculatrice.add(a, b);
		int resultatTheorique = 13;
		assertTrue(resultatEmpirique == resultatTheorique);
		}

	@Test
	public void testMultiplication()
		{
		//Test 1
			{
			int a = 5;
			int b = 8;
			int resultatEmpirique = Calculatrice.multiply(a, b);
			int resultatTheorique = 40;
			assertTrue(resultatEmpirique == resultatTheorique);
			}

		//Test 2
			{
			int a = 12;
			int b = 2;
			int resultatEmpirique = Calculatrice.multiply(a, b);
			int resultatTheorique = 24;
			assertTrue(resultatEmpirique == resultatTheorique);
			}
		}

	/*------------------------------------------------------------------*\
		|*							Methodes Private						*|
		\*------------------------------------------------------------------*/

	}
