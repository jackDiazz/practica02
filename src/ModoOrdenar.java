import java.util.Scanner;
 
public class ModoOrdenar implements EstadoRobot{
    Robot robot;
    Scanner scanner = new Scanner(System.in);
    int opcion = scanner.nextInt();
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
        robot.printMenu();
        if(opcion<=10){
            System.out.println("Excelente elección. Cambiando a modo Cocinar");
            robot.asignarNuevoEstado(robot.getEstadoCocinar());
        }else{
            System.out.println("Esa no es una opción válida."+"\nPor favor elige un platillo.");
        }
    }
    
}
