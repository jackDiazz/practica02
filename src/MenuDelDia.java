import java.util.ArrayList;
/**
 * Clase que representa al menú del día
 */
public class MenuDelDia extends MenuTemplate{
	/**
	 * ArrayList que guarda todos los platillos
	 */
	private ArrayList<Platillo> platillos = new ArrayList<>();

	/**
	 * Constructor de la clase
	 */
	public MenuDelDia(){
		tipoMenu = "Menu del día";
	}

	/**
	 * Método que permite al restaurante añadir platillos
	 */
	public void agregarPlatillo(Platillo p){
		platillos.add(p);
	}

	/**
	 * Método que permite al restaurante eliminar platillos
	 */
	public void eliminarPlatillo(Platillo p){
		platillos.remove(p);
	}

	/*
	@Override
	protected Iterator getIterador(){
		return platillos.iterador();
	} */
}
