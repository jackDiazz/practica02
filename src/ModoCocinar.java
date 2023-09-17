public class ModoCocinar implements EstadoRobot{
    // Referencia al robot
    protected Robot robot;
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
        String nombreOrden= robot.orden.getName();
        switch (robot.getCoccion()) {
            case 1:
                System.out.println("Le estoy poniendo la base del pan a tu "+ nombreOrden);
                break;
            case 2:
                System.out.println("Le estoy poniendo mayonesa markorni a tu "+ nombreOrden);
                break;
            case 3:
                System.out.println("Le estoy poniendo mostaza a tu "+ nombreOrden);
                break;
            case 4:
                if(robot.orden.esVegetariano()){
                    System.out.println("Estoy preparando la carne vegetariana de tu "+ nombreOrden);
                }else{
                    System.out.println("Estoy preparando la carne carnívora de tu " + nombreOrden);
                }
                break;
            case 5:
                System.out.println("Estoy poniendo la carne a tu "+ nombreOrden);
                break;
            case 6:
                if(robot.orden.tieneQueso()){
                    System.out.println("Le estoy poniendo kesito a tu "+ nombreOrden);
                    break;
                }else{
                    robot.setCoccion(robot.getCoccion()+1);
                }
            case 7:
                System.out.println("Estoy poniendo vegetales a tu "+ nombreOrden);
                break;
            case 8:
                System.out.println("Estoy poniendo catsup a tu "+ nombreOrden);
                break;
            case 9:
                System.out.println("Estoy poniendo la tapa del pan a tu "+ nombreOrden);
                System.out.println("He terminado tu platillo, aquí tienes tu "+nombreOrden);
                System.out.println("**Cambiando a modo Suspendido**");
                robot.asignarNuevoEstado(robot.getEstadoSuspendido());
                robot.setPasos(0);
                robot.setCoccion(0);
                break;
            default:
                break;
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
