/**
 * Clase que representa al main y al restaurante, donde se pueden alterar los menú del día y de lujo 
 */
import java.util.Iterator;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        // Creación de los menús
        MenuGeneral menuGeneral = new MenuGeneral();
        MenuDelDia menuDia = new MenuDelDia();
        MenuDeLujo menuDeLujo = new MenuDeLujo();

        // Creación e iniciliazación de los ietardores.
        Iterator menuGeneralIterator = menuGeneral.createIterator();
        Iterator menuDiaIterator = menuDia.createIterator();
        Iterator menuLujoIterator = menuDeLujo.createIterator();
        
        // Creación de la instancia Robot (SOLO RECIBE ITERADORES)
        
        Robot robot = new Robot(menuGeneralIterator, menuDiaIterator, menuLujoIterator);
		//Robot robot= new Robot();
        // Objecto robot llama al método para imprimir el menú.
        //robot.printMenu();
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("***BIENVENIDO A HAMBURGUESA FELIZ.***"
						+ "\nPor favor elige la opcion que deseas ejecutar."
						+ "\nPor el momento, el robot está suspendido.");
		boolean activado=false;
		int contadorCaminar = 0;
        int contadorCocinar = 0;

		do{
			System.out.println(
				"1.- Activar.\n" +
				"2.- Suspender.\n" + 
				"3.- Caminar.\n" + 
				"4.- Cocinar.\n" +
				"5.- Ordenar.\n" +
				"6.- Apagar.\n"+
                "0.- Salir del restaurante.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige una opción válida\n" + 
							"1.- Activar.\n" +
                            "2.- Suspender.\n" + 
                            "3.- Caminar.\n" + 
                            "4.- Cocinar.\n" +
                            "5.- Ordenar.\n" +
                            "6.- Apagar.\n"+
                            "0.- Salir del restaurante.\n");
					}
				}

				switch(opcion){
					case 1:
                        robot.activar();
                    	break;

					case 2:
						robot.suspender();
                    	break;

					case 3:
						robot.caminar();
						break;

					case 4:
						robot.cocinar();
						break;

					case 5:
						robot.ordenar();
						break;
                    case 6:
						robot.apagarse();
						break;
					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);
	

	}
}

