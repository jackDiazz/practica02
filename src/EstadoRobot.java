/**
 * Interfaz State para los estados que puede tener el robot
 */
public interface EstadoRobot{
	/**
	 * Método para suspender al robot
	 */
	public void suspender();
	public void caminar();
	public void activar();
	public void cocinar();
    public void ordenar();
}