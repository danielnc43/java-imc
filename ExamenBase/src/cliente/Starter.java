package cliente;

import view.GeneralView;

public class Starter {
	
	public static void main(String[] args){
		GeneralView general = new GeneralView();
		new Control(general); 
		general.getNuevoView().setVisible(true); 
	}
}
