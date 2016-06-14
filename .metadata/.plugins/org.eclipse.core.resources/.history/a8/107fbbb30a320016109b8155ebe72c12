
package ch.hearc.cours.moo.heritage.hello;

public class HmsiTimes extends HmsTimes
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public HmsiTimes(int heure, int minute, int seconde, int millisec)
		{
		super(heure, minute, seconde);
		this.millisec = millisec;
		}

	public HmsiTimes(HmsiTimes source)
		{
		super(source);
		this.millisec = source.millisec;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		return super.toString() + this.millisec + "ms";
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void set(int heure, int minute, int s, int ms)
		{
			set(heure, minute,s);
			 millisec = ms;
			}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	//input
	private int millisec;

	}
