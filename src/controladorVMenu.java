import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.AudioClip;
public class controladorVMenu implements ActionListener, MouseListener {
	
	VMenu vMenu;
	DarthMaul dMaul;
	AudioClip sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/objetos/4.wav"));
	AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/objetos/2.wav"));
	public controladorVMenu(VMenu vMenu) 
	{		
		this.vMenu=vMenu;
		sonido2.loop();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object obj = e.getSource();
		if(obj==vMenu.btnSith)
		{
			System.exit(0);
		}
		if(obj==vMenu.btnMaul){
			
			DarthMaul dMaul = new DarthMaul();
			ControladorMaul controMaul = new ControladorMaul(dMaul,vMenu,sonido2);
			dMaul.setControlador(controMaul);
			vMenu.contentPane.add(dMaul);
			dMaul.setVisible(true);
			vMenu.lblVader.setVisible(false);
			sonido1.stop();
			sonido2.stop();
			vMenu.btnMaul.setEnabled(false);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		sonido1.loop();

	}

	

	@Override
	public void mouseExited(MouseEvent e) {
		sonido1.stop();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
