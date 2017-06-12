
public class Principal {

	public static void main(String[] args) 
	{
		VMenu vMenu = new VMenu();
		
		controladorVMenu controMenu = new controladorVMenu(vMenu);
		
		vMenu.setControlador(controMenu);		//activa el controlador
		vMenu.setVisible(true);	
		

	}

}
