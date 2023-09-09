/**
 * Clase que representa a los platillos del restaurante
 */

public class Platillo{
	private int id;
	private String nombre;
	private String descripcion;
	private int precio;
	private boolean tieneQueso;
	private boolean esVegetariano;

	/**
	 * Constructor de la clase 
	 */
	public Platillo(int id, String nombre, String descripcion, int precio, boolean queso, boolean vegetariano){
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.tieneQueso = queso;
		this.esVegetariano = vegetariano;
	}

	/**
	 * Método que regresa el id del platillo
	 * @return id del platillo
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * Método que regresa el precio del platillo
	 * (Por si en algún momento se quiere hacer algo con él,
	 * como sacar la cuenta por ejemplo)
	 * @return precio del platillo
	 */
	public int getPrecio(){
		return this.precio;
	}

	/**
	 * Método que dice si el platillo tiene queso
	 * @return boolean explicando si tiene queso o no
	 */
	public boolean tieneQueso(){
		return tieneQueso;
	}

	/**
	 * Método que dice si el platillo es vegetariano
	 * @return boolean explicando si es vegetariano o no
	 */
	public boolean esVegetariano(){
		return esVegetariano;
	}

	/**
	 * Método que muestra la información del platillo
	 */
	public void muestraPlatillo(){
		System.out.println("Id: " + String.valueOf(getId()));
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Descripción: " + this.descripcion);
		System.out.println("Precio: $" + String.valueOf(getPrecio()));
		System.out.println("Con queso: " + String.valueOf(tieneQueso()));
		System.out.println("Vegetariano: " + String.valueOf(esVegetariano()));
	}

}
