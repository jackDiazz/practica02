package practica02.prueba;

// Clase que representa el estado cocinando del robot
class EstadoCocinando extends EstadoRobot {
    // Constructor que llama al constructor de la clase padre
    public EstadoCocinando(Robot robot) {
        super(robot);}

        // Método para activar el robot
        @Override
        public void activar() {
            System.out.println("El robot ya está activado");
        }
    
        // Método para suspender el robot
        @Override
        public void suspender() {
            System.out.println("No puedo suspenderme mientras estoy cocinando");
        }
    
        // Método para caminar
        @Override
        public void caminar() {
            System.out.println("No puedo caminar mientras estoy cocinando");
        }
    
        // Método para cocinar
        @Override
        public void cocinar() {
            // Incrementar el contador de cocción
            robot.setCoccion(robot.getCoccion() + 1);
            // Si el contador es menor que 3, mostrar un mensaje de que está cocinando
            if (robot.getCoccion() < 3) {
                System.out.println("Estoy cocinando");
            }
            // Si el contador es igual a 3, mostrar un mensaje de que ha terminado de cocinar y entregar el platillo
            else if (robot.getCoccion() == 3) {
                System.out.println("He acabado de cocinar, aquí tiene su comida");
                // Cambiar el estado del robot a suspendido y reiniciar los contadores de pasos y cocción
                robot.setEstado(robot.getEstadoSuspendido());
                robot.setPasos(0);
                robot.setCoccion(0);
            }
            // Si el contador es mayor que 3, mostrar un mensaje de que ya ha entregado el platillo
            else {
                System.out.println("Ya he entregado el platillo y ahora estoy suspendido");
            }
        }
    
        // Método para ordenar
        @Override
        public void ordenar() {
            System.out.println("No puedo ordenar mientras estoy cocinando");
        }
    
        // Método para apagar el robot
        @Override
        public void apagar() {
            System.out.println("No puedo apagarme mientras estoy cocinando");
        }
    }
    
