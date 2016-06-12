package ch.hearc.cours.io.file.object.bin;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.hearc.cours.moo.tools.Chrono;

public class SerializerToolsTest
{
	/*------------------------------------------------------------------*\
	 |*							Constructeurs							*|
	 \*------------------------------------------------------------------*/

	@Before public void before()
	{
	// rien
	}

	@After public void after()
	{
	// rien
	}

	/*------------------------------------------------------------------*\
	 |*							Methodes Public							*|
	 \*-----------------------------------------------------------------*/

	@Test public void testClone() throws ClassNotFoundException, IOException
	{

	Chrono chrono = new Chrono();
	int n = Integer.MAX_VALUE/1000;

	Equipe equipeSrc = EquipeTools.create(n);
	Equipe equipeClone =(Equipe)SerializerTools.clone(equipeSrc);

	chrono.stop();

	System.out.println(chrono);

	assertTrue(equipeSrc.isEquals(equipeClone));

	}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

}