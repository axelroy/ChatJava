
package ch.hearc.cours.moo.fibo;

/**
 * -Dn=10
 */
public class UseFibo
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		int n = Integer.valueOf(System.getProperty("n"));

		Fibo fibo = new Fibo(n);
		fibo.run();

		System.out.println(fibo);

		remarque();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void remarque()
		{
		StringBuilder remarque = new StringBuilder();

		remarque.append("Long.MAX_VALUE :");
		remarque.append("\n\tvalue=");
		remarque.append(Long.MAX_VALUE);
		remarque.append("\n\t#digits=");
		remarque.append(("" + Long.MAX_VALUE).length());

		System.out.println(remarque);
		}

	}
