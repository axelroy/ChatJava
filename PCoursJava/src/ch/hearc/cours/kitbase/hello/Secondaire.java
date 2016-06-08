
package ch.hearc.cours.kitbase.hello;

public class Secondaire
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	static public void hello()
		{
		int n = 10;

		version1(n);
		version2(n);
		version3(n);
		}

	private static void version1(int n)
		{
		for(int i = 0; i < n; i++)
			{
			System.out.println("Hel\tlo " + i);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void version2(int n)
		{
		int i = 0;

		while(i < n)
			{
			i++;
			System.out.println("Hel\tlo " + i);
			}
		}

	private static void version3(int n)
		{
		int i = 0;

		do
			{
			i++;
			System.out.println("Hel\tlo " + i);
			} while(i < n);
		}
	}
