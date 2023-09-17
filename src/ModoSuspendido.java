public class ModoSuspendido implements EstadoRobot{
    Robot robot;
    public ModoSuspendido(Robot robot){
		this.robot = robot;
	}
    public void suspender(){
        System.out.println("zZzzZ, ya estoy suspendido, deja de molestar.");

    }
	public void caminar(){
        System.out.println("Para caminar, primero debes activarme.");
    }
	public void activar(){
        System.out.println("Cambiando a modo Activado");
        robot.asignarNuevoEstado(robot.getEstadoActivado());
        System.out.println("Ahora estoy activo!");
        
    }
	public void cocinar(){
        System.out.println("Zzzz, no puedo cocinar mientras estoy suspendido.");
    }
	
    public void ordenar(){
        System.out.println("Si quieres ordenar, por lo menos debo estar cerca de ti.");
        
    }
    
}
