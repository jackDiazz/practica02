import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que representa al menú del día
 */
public class MenuDelDia extends MenuTemplate {
	/**
	 * ArrayList que guarda todos los platillos
	 */
	private ArrayList<Platillo> platillos = new ArrayList<>();

	/**
	 * Constructor de la clase
	 */
	public MenuDelDia() {
		tipoMenu = "Menu del día";

		agregarPlatillo(new Platillo(4, "Hamburguesa con pollo",
				"¿Verdaderamente necesitas una descripción? Es una hamburguesa, y tiene pollo.", 110, true, false));
		agregarPlatillo(
				new Platillo(5, "Hamburguesa de res", "¿En serio? Es una hamburguesa, y tiene res.", 120, true, false));
		agregarPlatillo(
				new Platillo(6, "Hamburguesa de pato", "Fresco, para los amantes del chile.", 150, true, false));
		agregarPlatillo(new Platillo(7, "Hamburguesa de conejo", "No te preocupes, era un conejo deprimido.", 150, true,
				false));

	}

	/**
	 * Método que permite al restaurante añadir platillos
	 */
	public void agregarPlatillo(Platillo p) {
		platillos.add(p);
	}

	protected MenuDiaIterador createIterator() {
		return new MenuDiaIterador(platillos);
	}

	@Override
	protected Iterator<Platillo> getIterador() {
		return createIterator();
	}
}
