
package ch.hearc.cours.io.file.object.bin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EquipeTools
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/


	public static Equipe read(String fileName) throws IOException, ClassNotFoundException
		{
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis= new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);

		Equipe equipe = (Equipe) ois.readObject();

		ois.close();
		bis.close();
		fis.close();
		return equipe;
		}

	public static void write(Serializable equipeSrc, String fileName) throws IOException
		{
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(equipeSrc);

		oos.close();
		bos.close();
		fos.close();
		}

	public static Equipe create(int n)
		{
		Equipe equipe = new Equipe("Xamax");
		for(int i = 0; i < n; i++)
			{
			equipe.add(new Homme("arc" + i,i));
			}
		return equipe;
		}
	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
