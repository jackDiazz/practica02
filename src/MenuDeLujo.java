import java.util.Hashtable;
import java.util.Iterator;

/**
 * Clase que representa al menú de lujo
 */
public class MenuDeLujo extends MenuTemplate{
	/**
	 * Hashtable que guarda todos los platillos
	 */
	private Hashtable<Integer, Platillo> platillos = new Hashtable<>();

	/**
	 * Constructor de la clase
	 */
	public MenuDeLujo(){
		this.tipoMenu = "Menu de lujo";

		agregarPlatillo(8, new Platillo(10, "Especialidad de la casa", "La receta secreta, no preguntes de qué es la carne ni de dónde salió, sólo disfrutala, (algunos dicen que el sabor se parece al cerdo).", 300, true, false));
		agregarPlatillo(9, new Platillo(9, "Hamburguesa de unicornio", "Sí, como leíste.", 220, false, true));
		agregarPlatillo(10, new Platillo(8, "Hamburguesa de gato", "No te preocupes, ningún gato fue lastimado durante la creación de ésta hamburguesa.", 220, false, true));
		

	}

	/**
	 * Método que permite al restaurante añadir platillos
	 */
	public void agregarPlatillo(int id, Platillo p){
		platillos.put(id, p);
	}

	/**
	 * Método que permite al restaurante eliminar platillos
	 */
	public void eliminarPlatillo(int id){
		platillos.remove(id);
	}

	public Iterator<Platillo> createIterator(){
		return new MenuLujoIterador(platillos);

	}

}
