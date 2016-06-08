
package ch.hearc.cours.moo.garage;

public class UseGarage
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
		useRoue();
		useVoiture();
		useGarage();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void useGarage()
		{
		Garage garage = new Garage("Toto Garage");

		Voiture voiture = new Voiture(new StringBuilder("Fiat"), new Roue[] { new Roue("F11", 11), new Roue("F12", 12) });
		garage.add(voiture);
		System.out.println(garage.size());
		garage.remove(voiture);
		System.out.println(garage.size());

		int nombreRoues = calculerNombreRoues(garage);
		System.out.println(nombreRoues);
		Garage g2 = garage.cloneOf();
		// Tests cloneOf et isEquals
		System.out.println(g2.isEquals(garage));
		Voiture voiture2 = new Voiture(new StringBuilder("BMW"), new Roue[] { new Roue("F12", 19), new Roue("F12", 19) });
		g2.add(voiture2);
		System.out.println(garage.size());
		System.out.println(g2.size());
		System.out.println(g2.isEquals(garage));
		}

	private static int calculerNombreRoues(Garage garage)
		{
		int nombreRoues = 0;
		for(Voiture voiturei:garage)
			{
			nombreRoues += voiturei.getTabRoues().length;
			}
		return nombreRoues;
		}

	private static void useVoiture()
		{
		Roue[] tabRoues = new Roue[] { new Roue("F11", 11), new Roue("F12", 12) };
		Voiture voiture = new Voiture(new StringBuilder("Fiat"), tabRoues);

		System.out.println(voiture);
		}

	private static void useRoue()
		{
		Roue roue = new Roue("11", 12);
		System.out.println(roue);
		}

	}
