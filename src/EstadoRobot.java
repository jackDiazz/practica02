/**
 * Interfaz State para los estados que puede tener el robot
 */
public interface EstadoRobot{
	/**
	 * Método para suspender al robot
	 */
	public void suspender();
	/**
	 * Método para que el robot camine
	 */
	public void caminar();
	/**
	 * Método para activar al robot
	 */
	public void activar();
	/**
	 * Método para que el robot cocine
	 */
	public void cocinar();
	/**
	 * Método para que el robot tome la orden del usuario
	 */
    public void ordenar();
	/**
	 * Método para que el robot se apague
	 */
	public void apagarse();
}