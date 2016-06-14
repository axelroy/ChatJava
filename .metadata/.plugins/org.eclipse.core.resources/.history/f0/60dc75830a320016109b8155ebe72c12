
package ch.hearc.cours.io.file.data.txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import ch.hearc.cours.io.file.data.Tools;

public class UseFileTxt
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		try
			{
			main();
			}
		catch (IOException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

	public static void main() throws IOException
		{
		System.out.println("UseFileTxt.java");
		int n = 10;
		String txtFileName = "file.txt";
		float[] tabSource = Tools.create(n);
		write(tabSource, txtFileName);
		float[] tabCopy = read(txtFileName);
		Tools.print(tabSource);
		Tools.print(tabCopy);
		Tools.delete(txtFileName);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static float[] read(String txtFileName) throws IOException
		{
		FileReader fr = new FileReader(txtFileName);
		BufferedReader br = new BufferedReader(fr);

		List<Float> list = new LinkedList<Float>();
		String ligneTxt;
		while((ligneTxt = br.readLine()) != null)
			{
			parser(ligneTxt, list); //parser ajoute les elements de la ligne à la liste déjà remplie par les lignes précédentes
			}

		br.close();
		fr.close();
		return Tools.toArray(list);
		}

	private static void parser(String ligneTxt, List<Float> list)
		{
		StringTokenizer st = new StringTokenizer(ligneTxt, DELIMITER);
		while(st.hasMoreTokens())
			{
			String token = st.nextToken();
			list.add(toFloat(token));
			}
		}

	private static Float toFloat(String txt)
		{
		try
			{
			return Float.valueOf(txt);
			}
		catch (NumberFormatException e)
			{
			System.err.println("Fichier txt ne contient pas que des floats, remplacé par Float.MAX_VALUE");
			return Float.MAX_VALUE;
			}
		}

	private static void write(float[] tabSource, String txtFileName) throws IOException
		{
		FileWriter fw = new FileWriter(txtFileName);
		BufferedWriter bw = new BufferedWriter(fw);

		for(float element:tabSource)
			{
			bw.write(element + DELIMITER);
			}

		bw.close();
		fw.close();
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String DELIMITER = " ";

	}
