
package ch.hearc.cours.moo.heritage.hello;

import ch.hearc.coursjava.moo.heritage.simple.HmTimes;

public class HmsTimes extends HmTimes
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public HmsTimes(int heure, int minute, int seconde)
		{
		super(heure, minute);
		this.seconde = seconde;
		}

	public HmsTimes(HmsTimes source)
		{
		super(source);
		this.seconde = source.seconde;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		return super.toString() + this.seconde + "s ";
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void set(int heure, int minute, int s)
		{
		//		//v1
		//			{
		//			super.set(heure, minute);
		//			this.seconde = s;
		//			}
		//
		//		//v2
		//			{
		//			super.set(heure, minute);
		//			seconde = s;
		//			}

		//v3
			{
			set(heure, minute);
			seconde = s;
			}
		//		//v4
		//			{
		//			this.set(heure, minute);
		//			seconde = s;
		//			}

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
	//Inputs
	private int seconde;
	}
