public class ModoActivo implements EstadoRobot{
    Robot robot;
    public ModoActivo(Robot robot){
		this.robot = robot;
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
        robot.incrementarContadorCaminar();
    }
    @Override
	public void activar(){
        System.out.println("Ya estoy activo.");
    }
    @Override
	public void cocinar(){
        System.out.println("No me pidas cocinar, ni siquiera he tomado tu orden!");
    }
    @Override
    public void ordenar(){
        System.out.println("Debo estar cerca de tí para tomar tu orden.");
    }
    
}

