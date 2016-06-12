package ch.hearc.cours.io.file.object.bin;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.hearc.cours.io.file.data.Tools;
import ch.hearc.cours.moo.tools.Chrono;

public class FileObjectTest
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

@Test public void testCloneParSerialisation() throws IOException, ClassNotFoundException
	{
	Chrono chrono = new Chrono();


	int n = Integer.MAX_VALUE/1000;
	String fileName = "equipe.bin";
	Equipe equipeSrc = EquipeTools.create(n);
	EquipeTools.write(equipeSrc,fileName);
	Equipe equipeClone = EquipeTools.read(fileName);
	chrono.stop();
//	System.out.println(equipeSrc);
//	System.out.println(equipeClone);
	Tools.delete(fileName);
//	System.out.println(chrono);


	assertTrue(equipeSrc.isEquals(equipeClone));
	}

/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

}