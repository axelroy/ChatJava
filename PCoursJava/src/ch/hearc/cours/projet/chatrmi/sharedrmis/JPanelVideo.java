
package ch.hearc.cours.projet.chatrmi.sharedrmis;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

import ch.hearc.cours.projet.chatrmi.ChatManager;
import ch.hearc.cours.projet.chatrmi.ChatPreferences;
import ch.hearc.cours.projet.chatrmi.IDsRmi;
import ch.hearc.cours.projet.chatrmi.PcChat;
import ch.hearc.cours.projet.chatrmi.states.ReconnectingState;
import ch.hearc.cours.projet.chatrmi.states.ReconnectionState;
import ch.hearc.cours.projet.chatrmi.tools.Tools;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class JPanelVideo extends JPanel implements PanelVideo_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelVideo() throws RemoteException
		{
		webCam = Webcam.getDefault();

		Dimension[] nonStandardResolutions = new Dimension[] { WebcamResolution.UXGA.getSize(), WebcamResolution.HD720.getSize(), new Dimension(1920, 1080), new Dimension(1280, 720), };

		webCam.setCustomViewSizes(nonStandardResolutions);
		webCam.setViewSize(WebcamResolution.UXGA.getSize());

		dimensionImageYou = WebcamResolution.UXGA.getSize();
		dimensionImageMe = Tools.getScaledDimension(WebcamResolution.UXGA.getSize(), AREA_ME);

		imageMe = null;
		imageYou = null;

		geometry();
		control();
		appearance();

		rmiUrl = new RmiURL(IDsRmi.idRmi2, RmiTools.getLocalHost(), ChatPreferences.getPort());
		RmiTools.shareObject(this, rmiUrl);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/
	public void openWebcam()
		{
		webCam.open();
		}

	@Override
	public void putImage(byte[] image) throws RemoteException
		{
		if (image != null)
			{
			imageYou = bytesToImage(image);
			}

		}

	public void start()
		{
		thread.start();
		}

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		AffineTransform transformInitial = g2d.getTransform();
		draw(g2d);
		g2d.setTransform(transformInitial);
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void draw(Graphics2D g2d)
		{

		g2d.drawImage(imageYou, (this.getWidth() - dimensionImageYou.width) / 2, (this.getHeight() - dimensionImageYou.height) / 2, dimensionImageYou.width, dimensionImageYou.height, null);
		g2d.drawImage(imageMe, 0, 0, dimensionImageMe.width, dimensionImageMe.height, null);
		}

	private void geometry()
		{

		}

	private void control()
		{
		thread = new Thread(new Runnable()
			{


			@Override
			public void run()
				{
				PcChat pcChat = PcChat.getInstance();
				PanelVideo_I remotePanelVideo = pcChat.getRemotePanelVideo();
				ChatManager chatManager = ChatManager.getInstance();

				while(!Thread.currentThread().isInterrupted())
					{
					try
						{
						Thread.sleep(50);
						}
					catch (InterruptedException e)
						{
						e.printStackTrace();
						}

					imageMe = webCam.getImage();
					if (!(chatManager.getCurrentState() instanceof ReconnectionState) && !(chatManager.getCurrentState() instanceof ReconnectingState))
						{

						try
							{
							if (imageMe != null)
								{
								remotePanelVideo = pcChat.getRemotePanelVideo();
								remotePanelVideo.putImage(imageToBytes((BufferedImage)imageMe));
								}

							}
						catch (RemoteException e)
							{
							chatManager.SetState(new ReconnectionState());
							}
						}

					JPanelVideo.this.repaint();
					}
				}
			});

		addComponentListener(new ComponentAdapter()
			{


			@Override
			public void componentResized(ComponentEvent e)
				{
				dimensionImageYou = Tools.getScaledDimension(WebcamResolution.HD720.getSize(), JPanelVideo.this.getSize());
				}
			});
		}

	private void appearance()
		{
		}

	private byte[] imageToBytes(BufferedImage image)
		{
		try
			{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(image, "jpg", baos);
			return baos.toByteArray();
			}
		catch (IOException e)
			{
			e.printStackTrace();
			return null;
			}

		}

	private BufferedImage bytesToImage(byte[] bytesImages)
		{
		try
			{
			return ImageIO.read(new ByteArrayInputStream(bytesImages));
			}
		catch (IOException e)
			{
			e.printStackTrace();
			return null;
			}
		}
	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Webcam webCam;
	private Dimension dimensionImageMe;
	private Dimension dimensionImageYou;

	Thread thread;

	// Input
	private Image imageYou;
	private Image imageMe;

	public static final Dimension AREA_ME = new Dimension(300, 300);
	public final RmiURL rmiUrl;

	}
