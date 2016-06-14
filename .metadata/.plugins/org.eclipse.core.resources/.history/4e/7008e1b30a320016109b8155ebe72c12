
package ch.hearc.cours.kitbase.tools;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Histogram
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * Lent car beaucoup d'objets instanciés
	 * @param nbFaces
	 * @param nbLances
	 * @return
	 */
	//	public static HashMap<Integer, Integer> generateHistogram(int possibilities, int factor)
	//		{
	//		HashMap<Integer, Integer> histo = new HashMap<Integer, Integer>(possibilities);
	//		for(int i = 0; i < factor; i++)
	//			{
	//			int randNumber = RandomTools.random(possibilities);
	//
	//			if (histo.containsKey(randNumber))
	//				{
	//				histo.put(randNumber, histo.get(randNumber) + 1);
	//				}
	//			else
	//				{
	//				histo.put(randNumber, 1);
	//				}
	//			}
	//		return histo;
	//		}

	public static int[] generateHistogram(int nbFaces, int nbLances)
		{
		int[] tabHisto = new int[nbFaces];
		for(int i = 0; i < nbLances; i++)
			{
			int randNumber = RandomTools.random(nbFaces);
			Assert.assertTrue(randNumber >= 1 && randNumber <= nbFaces);
			tabHisto[randNumber - 1]++;
			}
		return tabHisto;
		}

	public static void generateSpreadsheet(int[] tabHisto, int nbLances, String fileName)
		{

		try
			{
			WritableWorkbook book = Workbook.createWorkbook(new File(fileName + ".xls"));
			WritableSheet sheet = book.createSheet("Histogram", 0);

			writeCell(sheet, 0, 0, "Possibility");
			writeCell(sheet, 1, 0, "Apperances");

			for(int i = 1; i <= tabHisto.length; i++)
				{
				writeCell(sheet, 0, i, String.valueOf(i));
				writeCell(sheet, 1, i, tabHisto[i - 1] + "");

				if (i == tabHisto.length)
					{
					writeCell(sheet, 0, i + 2, "total");
					writeCell(sheet, 1, i + 2, String.valueOf(nbLances));
					}
				}

			book.write();
			book.close();
			}
		catch (WriteException e)
			{
			e.printStackTrace();
			}
		catch (IOException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void writeCell(WritableSheet sheet, int col, int row, String content) throws WriteException, RowsExceededException
		{
		Label label = new Label(col, row, content);
		sheet.addCell(label);
		}
	}
