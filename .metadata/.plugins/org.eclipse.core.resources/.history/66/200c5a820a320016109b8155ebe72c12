
package ch.hearc.cours.moo.heritage.hello;

public class UseHmsTimes
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
		HmsTimes hms = new HmsTimes(10, 20, 30);
		System.out.println(hms);
		hms.set(100, 200, 300);
		System.out.println(hms);

		HmsiTimes hmsi = new HmsiTimes(10,20,30,40);
		System.out.println(hmsi);
		hmsi.set(100, 200, 300, 400);
		System.out.println(hmsi);

		//testConstructeurCopie();
		testConstructeurCopie2();

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void testConstructeurCopie2()
		{
		HmsiTimes hmsiSource = new HmsiTimes(10, 20, 30,40);
		HmsiTimes hmsiClone = new HmsiTimes(hmsiSource);
		System.out.println(hmsiSource);
		System.out.println(hmsiClone);
		hmsiSource.set(100, 200, 300, 400);
		System.out.println(hmsiSource);
		System.out.println(hmsiClone);

		}

	private static void testConstructeurCopie()
		{
		HmsTimes hmsSource = new HmsTimes(10, 20, 30);
		HmsTimes hmsClone = new HmsTimes(hmsSource);
		System.out.println(hmsSource);
		System.out.println(hmsClone);
		hmsSource.set(100, 200, 300);
		System.out.println(hmsSource);
		System.out.println(hmsClone);
		}

	}
