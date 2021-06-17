package view;

public class GeneralView {

	private Menu menu;
	private NuevoClienteView nuevoView;
	
	public GeneralView()
	{
		menu = new Menu();
		nuevoView = new NuevoClienteView();
	}

	public Menu getMenu() {
		return menu;
	}

	public NuevoClienteView getNuevoView() {
		return nuevoView;
	}
	
}
