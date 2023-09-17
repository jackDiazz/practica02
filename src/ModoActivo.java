public class ModoActivo implements EstadoRobot{
    //Referencia al robot
    protected Robot robot;
    /**
     * Constructor de la clase ModoActivo
     * @param robot
     */
    public ModoActivo(Robot robot){
		this.robot = robot;
    }
    @Override
	public void activar(){
        System.out.println("Hola! Ya estoy activo.");
    }
    @Override
    public void suspender(){
        System.out.println("Cambiando a modo suspendido");
        robot.asignarNuevoEstado(robot.getEstadoSuspendido());
        System.out.println("Zzzz, estoy suspendido.");
    }
    @Override
	public void caminar(){
        System.out.println("Cambiando a modo caminar.");
        robot.asignarNuevoEstado(robot.getEstadoCaminar());
        robot.setPasos(0);
        robot.setCoccion(0);
    }
    
    @Override
	public void cocinar(){
        System.out.println("No me pidas cocinar, ni siquiera he tomado tu orden!");
    }
    @Override
    public void ordenar(){
        System.out.println("Debo estar cerca de tí para tomar tu orden.");
    }
    @Override
    public void apagarse(){
        System.out.println("**Robot apagado**");
        robot.asignarNuevoEstado(robot.getEstadoApagado());
    }
    
}

