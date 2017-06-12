import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMaul implements ActionListener
{
	VMenu vMenu;
	DarthMaul dMaul;
	AudioClip sonido2;
	AudioClip sonido3 = java.applet.Applet.newAudioClip(getClass().getResource("/objetos/3.wav"));
	AudioClip sonido6 = java.applet.Applet.newAudioClip(getClass().getResource("/objetos/6.wav"));
	public ControladorMaul(DarthMaul dMaul, VMenu vMenu, AudioClip sonido2)
	{
		this.sonido2=sonido2;
		this.vMenu=vMenu;
		this.dMaul = dMaul;
		sonido2.stop();
		sonido3.loop();
		sonido6.play();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();
		if(obj==dMaul.btnVolver)
		{
			sonido3.stop();
			dMaul.setVisible(false);
			vMenu.lblVader.setVisible(true);
			sonido2.loop();
			vMenu.btnMaul.setEnabled(true);
		}
		
	}
}
