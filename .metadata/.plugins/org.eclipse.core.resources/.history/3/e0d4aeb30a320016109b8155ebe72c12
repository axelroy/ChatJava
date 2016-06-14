
package ch.hearc.cours.moo.thread;

public class UseThreadHello
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		System.out.println("Fin Main");
		}

	public static void main()
		{
		//hello();
		//hello2();
		//hello3();
		//hello4();
		hello5();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void hello()
		{
		Thread thread = new Thread(new Runnable()
			{

			@Override
			public void run()
				{
				try
					{
					Thread.sleep(2000);
					}
				catch (InterruptedException e)
					{
					e.printStackTrace();
					}
				System.out.println("Hello from " + Thread.currentThread().getName());
				}
			});
		thread.setName("t1");
		thread.start();
		}

	private static void hello2()
		{
		Runnable runnable = new Runnable()
			{

			@Override
			public void run()
				{
				System.out.println("Hello from " + Thread.currentThread().getName());
				}
			};

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.setName("t1");
		thread2.setName("t2");
		thread1.start();
		thread2.start();
		}

	private static void hello3()
		{
		int n = 18;

		Runnable runnable = new Runnable()
			{

			@Override
			public void run()
				{
				System.out.println("Hello from " + Thread.currentThread().getName());
				}
			};
		Thread[] tabThread = new Thread[n];
		for(int i = 0; i < tabThread.length; i++)
			{
			Thread thread = new Thread(runnable);
			thread.setName("t" + i);
			tabThread[i] = thread;
			}
		for(int i = 0; i < tabThread.length; i++)
			{
			tabThread[i].start();
			}
		}

	private static void hello4()
		{
		Thread thread = new Thread(new Runnable()
			{

			@Override
			public void run()
				{
				try
					{
					Thread.sleep(10000);
					}
				catch (InterruptedException e)
					{
					e.printStackTrace();
					}
				System.out.println("Hello from " + Thread.currentThread().getName());
				}
			});
		thread.setName("t1");
		thread.start();
		try
			{
			thread.join(); //le thread courant ( ici le thread principale) attend que le thread t1 soit terminé
			}
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}

	private static void hello5()
		{
		System.out.println(Runtime.getRuntime().availableProcessors());
		}

	}
