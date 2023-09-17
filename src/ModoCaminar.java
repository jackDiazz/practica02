public class ModoCaminar implements EstadoRobot {
    Robot robot;
    private int contadorCaminar=0;
    public ModoCaminar(Robot robot){
		this.robot = robot;
	}
    public void suspender(){
        System.out.println("Ni siquiera he llegado y ya quieres que duerma):");
        System.out.println("Cambiando a modo Suspendido");
        robot.asignarNuevoEstado(robot.getEstadoSuspendido());
        System.out.println("Listo, ahora estoy en modo Suspendido UnU");
    }
	public void caminar(){
        if (contadorCaminar == 0) {
            System.out.println("**Robot caminando**");
        }else if(contadorCaminar==1){
            System.out.println("Voy lo más rápido que puedo");
        }else if (contadorCaminar == 2) {
            System.out.println("No te desesperes, ya casi llego");
        }else{
            System.out.println("Ya estoy aquí. ¿Puedo tomar tu orden?");
            robot.estadoActual.caminar();
        }
        robot.incrementarContadorCaminar();
    }
	public void activar(){
        System.out.println("Es evidente que ya estoy activo >:(");
    }
	public void cocinar(){
        System.out.println("No puedo cocinar mientras estoy caminando.");
    }
    public void ordenar(){
        System.out.println("HOlaaa");

    }
}
