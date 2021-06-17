package cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.GeneralView;

public class Control {
	private GeneralView view;
	
	public Control(GeneralView vista)
	{
		view = vista;
		vista.getNuevoView().addGuardarListener(new GuardarNListener());
		vista.getNuevoView().addCancelarListener(new CancelarNListener());
		vista.getMenu().addRegresar(new RegresarListener());
	}

	class GuardarNListener implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0)
		{
			try{
				String nombre = view.getNuevoView().getNombre();
				char sexo = view.getNuevoView().getSexo();
				String edad = view.getNuevoView().getEdad();
				String peso = view.getNuevoView().getPeso();
				String altura = view.getNuevoView().getAltura();
				
				if(edad.length() == 0 || peso.length() == 0 || altura.length() == 0) {
					JOptionPane.showMessageDialog( null, "Llene todos los campos");
				}else if(!isNumeric(edad)) {
					JOptionPane.showMessageDialog( null, "Introduca una edad correcta");
				} else if(!isNumeric(peso)) {
					JOptionPane.showMessageDialog( null, "Introduca un peso correcto");
				} else if(!isNumeric(altura)) {
					JOptionPane.showMessageDialog( null, "Introduca una altura correcta");
				} else {
				
					Persona persona = new Persona(nombre, Integer.parseInt(edad), sexo,  Double.parseDouble(peso), Double.parseDouble(altura));
					
					System.out.println(persona.toString());
	
					view.getMenu().setVisible(true);
					view.getMenu().setNombre(persona.getNombre());
					view.getMenu().setNss(persona.getNss());
					view.getMenu().setSexo(persona.getSexoNombre());
					view.getMenu().setEdad(String.valueOf(persona.getEdad()));
					view.getMenu().setPeso(String.valueOf(persona.getPeso()));
					view.getMenu().setAltura(String.valueOf(persona.getAltura()));
					
					view.getMenu().setResultado(persona.getImcEvaluacion());
				}

			}catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog( null, "Ha ocurrido un error :(");
			}
		}
	}

	class CancelarNListener implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0)
		{
			System.exit(0);
		}
	}
	
	class RegresarListener implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0)
		{
			view.getMenu().setVisible(false);
		}

	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
				
}
