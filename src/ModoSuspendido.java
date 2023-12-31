public class ModoSuspendido implements EstadoRobot{
    Robot robot;
    public ModoSuspendido(Robot robot){
		this.robot = robot;
	}
    @Override
    public void suspender(){
        System.out.println("zZzzZ, ya estoy suspendido, deja de molestar.");

    }
    @Override
	public void caminar(){
        System.out.println("Para caminar, primero debes activarme.");
    }
    @Override
	public void activar(){
        System.out.println("Cambiando a modo Activado");
        robot.asignarNuevoEstado(robot.getEstadoActivado());
        System.out.println("Hola! Ahora estoy activo!");
        
    }
    @Override
	public void cocinar(){
        System.out.println("Zzzz, no puedo cocinar mientras estoy suspendido.");
    }
	@Override
    public void ordenar(){
        System.out.println("Si quieres ordenar, por lo menos debo estar cerca de ti.");
        
    }
    @Override
    public void apagarse(){
        System.out.println("**Cambiando a modo Apagado**");
        robot.asignarNuevoEstado(robot.getEstadoApagado());



    }
    
}
