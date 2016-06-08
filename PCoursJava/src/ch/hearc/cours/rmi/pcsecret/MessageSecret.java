
package ch.hearc.cours.rmi.pcsecret;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MessageSecret implements Serializable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public MessageSecret(String message)
		{
		this.message = message;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("MessageSecret [message=");
		builder.append(this.message);
		builder.append("]");
		return builder.toString();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getMessage()
		{
		return this.message;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*	Customisation sérialisation	*|
	\*------------------------------*/

	private void writeObject(ObjectOutputStream oos) throws IOException
		{
		System.out.println("[MessageSecret]: writeObject: customisation serialisation: cryptage");
		oos.writeObject(crypter(this.message));
		}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
		{
		System.out.println("[MessageSecret]: readObject: customisation deserialisation: decryptage");
		this.message = decrypter((String)ois.readObject());
		}

	private String crypter(String source)
		{
		return "12" + source; //TODO: employer un algorithme sérieux !!!
		}

	private String decrypter(String source)
		{
		return source.substring(2);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	// input/output
	private String message;
	}
