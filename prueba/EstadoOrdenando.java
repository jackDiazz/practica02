package practica02.prueba;
import java.util.Scanner;
// Clase que representa el estado ordenando del robot
class EstadoOrdenando extends EstadoRobot {
    // Constructor que llama al constructor de la clase padre
    public EstadoOrdenando(Robot robot) {
        super(robot);
    }

    // Método para activar el robot
    @Override
    public void activar() {
        System.out.println("El robot ya está activado");}

        // Método para suspender el robot
        @Override
        public void suspender() {
            System.out.println("No puedo suspenderme mientras estoy ordenando");
        }
    
        // Método para caminar
        @Override
        public void caminar() {
            System.out.println("No puedo caminar mientras estoy ordenando");
        }
    
        // Método para cocinar
        @Override
        public void cocinar() {
            System.out.println("No puedo cocinar sin haber recibido el ID del platillo");
        }
    
        // Método para ordenar
        @Override
        public void ordenar() {
            // Pedir al usuario que ingrese el ID del platillo que desea
            System.out.println("Por favor, ingrese el ID del platillo que desea");
            // Crear un objeto de la clase Scanner para leer la entrada del usuario
            Scanner sc = new Scanner(System.in);
            // Leer el ID como un entero
            int id = sc.nextInt();
            // Validar que el ID sea válido (entre 1 y 3)
            if (id >= 1 && id <= 3) {
                // Asignar el nombre del platillo según el ID
                String platillo = "";
                switch (id) {
                    case 1:
                        platillo = "Hamburguesa sencilla";
                        break;
                    case 2:
                        platillo = "Hamburguesa doble";
                        break;
                    case 3:
                        platillo = "Hamburguesa especial";
                        break;
                }
                // Mostrar un mensaje de confirmación de la orden
                System.out.println("Ha ordenado una " + platillo);
                // Cambiar el estado del robot a cocinando y reiniciar el contador de cocción
                robot.setEstado(robot.getEstadoCocinando());
                robot.setCoccion(0);
            }
            // Si el ID no es válido, mostrar un mensaje de error y volver a pedir la orden
            else {
                System.out.println("El ID ingresado no es válido. Por favor, intente de nuevo");
                ordenar();
            }
        }
    
        // Método para apagar el robot
        @Override
        public void apagar() {
            System.out.println("No puedo apagarme mientras estoy ordenando");
        }
    }
  
