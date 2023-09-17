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
						if (!activado) {
                        	robot.activar();
                        	activado = true;
                    	} else {
                        	System.out.println("El robot ya está activado.");
                    	}
                    	break;

					case 2:
						robot.suspender();
                    	activado = false;
                    	contadorCaminar = 0;
                    	contadorCocinar = 0;
                    	break;

					case 3:
						if (activado) {
                        	if (contadorCaminar < 2) {
                            System.out.println("Estoy caminando.");
                        	} else if (contadorCaminar == 2) {
                            System.out.println("Cada vez estoy más cerca.");
                        	} else {
                            System.out.println("El robot ha llegado.");
                        	}
                        	contadorCaminar++;
							} else {
								System.out.println("El robot está suspendido. Debes activarlo primero.");
							}
							break;

					case 4:
						if (activado) {
                        	if (contadorCocinar < 3) {
                            	System.out.println("Estoy cocinando.");
                        	} else {
                            	System.out.println("He acabado de cocinar, aquí tienes tu comida.");
                        	}
                        	contadorCocinar++;
                    	} else {
                        	System.out.println("El robot está suspendido. Debes activarlo primero.");
                    	}
                    	break;

					case 5:
						if (activado) {
                        robot.ordenar();
                    	} else {
                       	 System.out.println("El robot está suspendido. Debes activarlo primero.");
                    	}
                    	break;
                    case 6:
						robot.suspender();
                    	activado = false;
                    	contadorCaminar = 0;
                    	contadorCocinar = 0;
                    	System.out.println("Robot apagado.");
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

