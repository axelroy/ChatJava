
package ch.hearc.cours.moo.hello;

public class UseLinear
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
		Linear linear = new Linear(2, 4);
		linear.run();
		double x = linear.getX();
		System.out.println(x);
		System.out.println(linear);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
