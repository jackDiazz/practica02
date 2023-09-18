public class ModoCaminar implements EstadoRobot {
    /**
     * Referencia al robot 
     */
    protected Robot robot;
    /**
     * Constructor de la clase ModoCaminar
     * @param robot
     */
    public ModoCaminar(Robot robot){
		this.robot = robot;
	}
    @Override
    public void suspender(){
        System.out.println("Ni siquiera he llegado y ya quieres que duerma):");
        System.out.println("Cambiando a modo Suspendido");
        robot.asignarNuevoEstado(robot.getEstadoSuspendido());
        robot.setPasos(0);
        robot.setCoccion(0);
        System.out.println("Listo, ahora estoy en modo Suspendido UnU");
    }

    @Override
	public void caminar(){
        //Incrementamos el contador
        robot.setPasos(robot.getPasos()+1);
        //Si el contador es menor que 3, mostramos el mensajito
        if(robot.getPasos()<2){
            System.out.println("Estoy caminando");
        }else if(robot.getPasos()==2){
            System.out.println("No te desesperes, ya casi estoy contigo.");
        }else if(robot.getPasos()==3){
            System.out.println("He llegado, ahora puedo atenderte.");
            //System.out.println("**Cambiando a modo Ordenar**");
            System.out.println("Selecciona la opción Ordenar para mostrarte el menú.");
            robot.asignarNuevoEstado(robot.getEstadoOrdenar());
        }else{
            System.out.println("Ya estoy contigo, por favor selecciona Ordenar para que pueda tomar tu orden:)");
        }
    }
    @Override
	public void activar(){
        System.out.println("Es evidente que ya estoy activo >:(");
    }
    @Override
	public void cocinar(){
        System.out.println("No puedo cocinar mientras estoy caminando.");
    }
    @Override
    public void ordenar(){
        System.out.println("No puedo tomar tu orden sin haber llegado a ti.");

    }
    @Override
    public void apagarse(){
        System.out.println("Ni siquiera me dejaste saludar):");
        System.out.println("**Cambiando a modo Apagado**");
        robot.asignarNuevoEstado(robot.getEstadoApagado());
        robot.setPasos(0);
        robot.setCoccion(0);

    }
}
