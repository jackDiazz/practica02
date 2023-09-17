public class ModoCocinar implements EstadoRobot{
    Robot robot;
    private int contadorCocinar=0;
    public ModoCocinar(Robot robot){
		this.robot = robot;
	}
    @Override
    public void suspender(){
        System.out.println("Si me suspendo mientras cocino, todo se incendiará");
    }
    @Override
	public void caminar(){
        System.out.println("Es peligroso que camine mientras cocino!");
    }
    @Override
	public void activar(){
        System.out.println("Ya estoy activo.");
    }
    @Override
	public void cocinar(){
        if (contadorCocinar == 0) {
            System.out.println("Estoy cocinando tu anvorguesa");
        }else if(contadorCocinar==1){
            System.out.println("Poniendo detalles");
        }else if (contadorCocinar == 2) {
            System.out.println("No te desesperes, ya casi termino");
        }else{
            System.out.println("Tu hamburguesa está lista, aquí la tienes");
            robot.asignarNuevoEstado(robot.getEstadoCocinar());
            System.out.println("Mi trabajo aquí ha terminado. Cambiando a modo Suspendido");
            robot.asignarNuevoEstado(robot.getEstadoSuspendido());
        }
        robot.incrementarContadorCocinar();
    }
    @Override
    public void ordenar(){
        System.out.println("Ya tomé tu orden, espera a que termine para ordenar otra vez.");
    }
    
}
