public class ModoCocinar implements EstadoRobot{
    // Referencia al robot
    protected Robot robot;
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
        //Incrementamos el contador
        robot.setCoccion(robot.getCoccion()+1);
        if(robot.getCoccion()<2){
            System.out.println("Estoy cocinando.");
        }else if(robot.getCoccion()==2){
            System.out.println("No te desesperes, ya casi está lista tu anvorguesa.");
        }else if(robot.getCoccion()==3){
            System.out.println("He terminado tu hamburguesa, aquí tienes tu platillo.");
            System.out.println("Terminé mi trabajo, toca descansito.");
            System.out.println("**Cambiando a modo Suspendido**");
            robot.asignarNuevoEstado(robot.getEstadoSuspendido());
            robot.setPasos(0);
            robot.setCoccion(0);

        }
    }
    @Override
    public void ordenar(){
        System.out.println("Ya tomé tu orden, espera a que termine para ordenar otra vez.");
    }
    @Override
    public void apagarse(){
        System.out.println("No puedo apagarme mientras cocino, es peligroso!");

    }
    
}
