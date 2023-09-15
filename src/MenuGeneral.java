import java.util.Iterator;

/**
 * Clase que representa al menu que nunca cambia
 */
public class MenuGeneral extends MenuTemplate{
	/**
	 * Array que guarda todos los platillos
	 */
	private Platillo[] platillos = new Platillo[4];

	/**
	 * Constructor de la clase
	 */
	public MenuGeneral(){
		this.tipoMenu = "Menu General";
		platillos[0] = new Platillo(0, "Hamborguesa 3b", "Con las tres B: bonita, buena, barata.", 65, false, true);
		platillos[1] = new Platillo(1, "Veggie Burguer", "Conciencia en cada capa, come sin culpa. ", 200, true, true);
		platillos[2] = new Platillo(2, "Hamburguesa sencilla", "Deliciosa y simple.", 85, true, false);
		platillos[3] = new Platillo(3, "Hamburguesa sencilla ++", "Con pan de ajo.", 90, true, false);
	}

	protected Iterator<Platillo> createIterator(){
		return new MenuGeneralIterador(platillos);
	} 
} 
