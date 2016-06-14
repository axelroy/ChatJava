
package ch.hearc.cours.moo.heritage.redefinitionindirecte;

public class UseABC
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
		use1();
		use2();
		use3();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void use1()
		{
		B b = new B();
		b.m(); //b

		A a = b;
		a.m(); //b
		}

	private static void use2()
		{
		C c = new C();
		c.m(); //c

		B b = c;
		b.m(); //c

		A a = b;
		a.m(); //c
		}

	private static void use3()
		{
		A a = new A();
		a.m(); //a

		B b = new B();
		b.m(); //b

		C c = new C();
		c.m(); //c
		}

	}
