public class ModoApagado implements EstadoRobot{
	/**
     * Referencia al robot 
     */
	protected Robot robot;
	/**
	 * Constructor del Modo Apagado
	 * @param robot inicializamos el robot
	 */
	public ModoApagado(Robot robot){
		this.robot = robot;
	}
	@Override
	public void activar(){
		System.out.println("Hola! Ahora estoy activo.");
		robot.asignarNuevoEstado(robot.getEstadoActivado());
	}
	@Override
	public void caminar(){
		System.out.println("**Robot apagado**"+"\nNo puede caminar si está apagado");
	}
	@Override
	public void ordenar(){
		System.out.println("**Robot Apagado**"+"\nNo puede tomar tu orden si está apagado");
	}
	@Override
	public void cocinar(){
		System.out.println("**Robot apagado**"+"\nNo puede cocinar si está apagado");
	}
	@Override
    public void suspender(){
		System.out.println("**Robot apagado**" +"\nNo puedes suspender al robot si ya está apagado.");
    }
	@Override
	public void apagarse(){
		System.out.println("**El robot ya está apagado**");
	}
}