public class ModoApagado implements EstadoRobot{

	Robot robot;

	public ModoApagado(Robot robot){
		this.robot = robot;
	}
	@Override
	public void activar(){
		System.out.println("Primero necesito estar en modo suspendido para poder activarme.");
	}
	@Override
	public void caminar(){
		System.out.println("Zzzz, estoy apagado, no puedo caminar.");
	}
	@Override
	public void ordenar(){
		System.out.println("Zzzz, estoy apagado, no puedo tomar tu orden");
	}
	@Override
	public void cocinar(){
		System.out.println("Lo siento, no puedo cocinar si estoy apagado, enciéndeme *guiño,guiño*");
	}
	//@Override
	/*public void apagarse(){
		System.out.println("***MODO APAGADO***\nel robot ya está apagado.");
		//robot.asignarNuevoEstado(robot.getEstadoApagado());
	}*/
	
	@Override
    public void suspender(){
		System.out.println("Pasando a modo Suspendido");
		robot.asignarNuevoEstado(robot.getEstadoSuspendido());

    }
}