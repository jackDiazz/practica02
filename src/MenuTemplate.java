import java.util.Iterator;

/**
 * Clase abstracta para los menús del rastaurante
 */
public abstract class MenuTemplate {

	/**
	 * Atributo con el nombre menú
	 */
	protected String tipoMenu;

	/**
	 * Método que imprime los platillos del menú
	 */

	public void getMenu() {
		System.out.println(this.tipoMenu);
		Iterator<Platillo> it = getIterador();
		while (it.hasNext()) {
			it.next().muestraPlatillo();
		}
	}

	/**
	 * Método que regreesa un platillo del menú dependiendo del id
	 * 
	 * @param id
	 * @return el platillo
	 */
	public Platillo getPlatillo(int id) {
		Iterator<Platillo> it = getIterador();
		while (it.hasNext()) {
			Platillo platillo = it.next();
			if (platillo.getId() == id) {
				return platillo;
			}
		}
		return null;
	}

	/**
	 * Método que regresa el nombre de un platillo del menú dependiendo del id
	 * 
	 * @param id
	 * @return el nombre del platillo
	 */
	public String getNombrePlatillo(int id) {
		Iterator<Platillo> it = getIterador();
		while (it.hasNext()) {
			Platillo platillo = it.next();
			if (platillo.getId() == id) {
				return platillo.getName();
			}
		}
		return null;
	}

	/**
	 * Método que regresa el iterador de la lista de los platillos
	 * 
	 * @return el iterador de la estructura de datos
	 */

	protected abstract Iterator<Platillo> getIterador();

}
