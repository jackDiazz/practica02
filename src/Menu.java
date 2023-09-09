/**
 * Clase que representa al menu que contiene a todos los menús y donde se podrán agregar o eliminar elementos al menú del día y de lujo
 */
public class Menu{
	private MenuGeneral menuGeneral;
	private MenuDelDia menuDia;
	private MenuDeLujo menuLujo;

	/**
	 * Constructor de la clase
	 */
	public Menu(MenuDelDia menuDia, MenuDeLujo menuLujo){
		this.menuGeneral = new MenuGeneral();
		this.menuDia = menuDia;
		this.menuLujo = menuLujo;
	}

	/**
	 * Método que imprimirá todos los menús
	 */
	public void getTodosMenus(){
		/*
		menuGeneral.getMenu();
		menuDia.getMenu();
		menuLujo.getMenu();
		*/
	}

	/**
	 * Método que devolverá sólo el menú general
	 */
	public void getMenuGeneral(){
		//menuGeneral.getMenu();
	}

	/**
	 * Método que devolverá sólo el menú del día
	 */
	public void getMenuDia(){
	//	menuDia.getMenu();
	}

	/**
	 * Método que devolverá sólo el menú de lujo
	 */
	public void getMenuLujo(){
		//menuLujo.getMenu();
	}
}
