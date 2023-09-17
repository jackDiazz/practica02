import java.util.Scanner;
 
public class ModoOrdenar implements EstadoRobot{
    protected Robot robot;
    protected Robot robot1;
    Scanner scanner = new Scanner(System.in);
    int id = scanner.nextInt();
    public ModoOrdenar(Robot robot){
		this.robot = robot;
	}
    @Override
    public void suspender(){
        System.out.println("¿Me trajiste hasta aquí solo para suspenderme?"+"\nOrdena algo de una vez");
    }
    @Override
	public void caminar(){
        System.out.println("No necesito caminar más. Ordena algo por favor.");
        
    }
    @Override
	public void activar(){
        System.out.println("Oye!,¿no ves que ya estoy activo?");
        
    }
    @Override
	public void cocinar(){
        System.out.println("Primero déjame tomar tu orden -.-");
    }
    @Override
    public void ordenar(){
        System.out.println("Te mostraré nuestro menú. Por favor elige un platillo.");
        //robot1.printMenu();
        Platillo platillo;
        if(id >=1 && id<=10){
            System.out.println("Excelente, haz ordenado una ");
            System.out.println("**Cambiando a modo Cocinar**");
            robot.asignarNuevoEstado(robot.getEstadoCocinar());
            robot.setCoccion(0);
        }else{
            System.out.println("No encuentro ese ID en nuestro menú. Por favor selecciona una opción válida.");
            ordenar();
        }
    }
    @Override
    public void apagarse(){
        System.out.println("Te arrepentirás de no haber ordenado >:c");
        System.out.println("**Cambiando a modo Apagado**");
        robot.asignarNuevoEstado(robot.getEstadoApagado());
    }
    
}
