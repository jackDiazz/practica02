import java.util.Hashtable;
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

	/*
	@Override
	protected Iterator getIterador(){
		return platillos.iterador();
	} */
}
