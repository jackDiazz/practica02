package practica02.prueba;
import java.util.Scanner;
// Clase principal con el método main para probar el programa
public class Main {
  public static void main(String[] args) {
      // Crear un objeto de la clase Robot
      Robot robot = new Robot();
      // Saludar al usuario y mostrar el estado inicial del robot
      System.out.println("Hola, bienvenido al restaurante de hamburguesas");
      System.out.println("El estado actual del robot es: " + robot.getEstadoActual().getClass().getSimpleName());
      // Crear una variable booleana para controlar el ciclo del menú
      boolean salir = false;
      // Crear un objeto de la clase Scanner para leer la entrada del usuario
      Scanner sc = new Scanner(System.in);
      // Mostrar el menú de opciones mientras no se elija salir
      while (!salir) {
          System.out.println("Estas son las acciones disponibles del robot:");
          System.out.println("1. Activar el robot");
          System.out.println("2. Suspender el robot");
          System.out.println("3. Caminar");
          System.out.println("4. Cocinar");
          System.out.println("5. Ordenar");
          System.out.println("6. Apagar el robot");
          System.out.println("7. Salir del programa");
          System.out.println("Por favor, ingrese el número de la opción que desea");
          // Leer la opción como un entero
          int opcion = sc.nextInt();
          // Ejecutar la acción correspondiente a la opción elegida
          switch (opcion) {
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
                  robot.apagar();
                  break;
              case 7:
                  salir = true;
                  break;
              default:
                  System.out.println("La opción ingresada no es válida. Por favor, intente de nuevo");
                  break;
          }
          // Mostrar el estado actual del robot después de cada acción
          System.out.println("El estado actual del robot es: " + robot.getEstadoActual().getClass().getSimpleName());
      }
      // Despedir al usuario y cerrar el scanner
      System.out.println("Gracias por usar el programa. Hasta pronto");
      sc.close();
  }
}