package practica02.prueba;
// Clase que implementa el estado caminando del robot
class EstadoCaminando implements EstadoRobot {
    // Referencia al robot
    protected Robot robot;

    // Constructor que recibe el robot
    public EstadoCaminando(Robot robot) {
        this.robot = robot;
    }

    // Método para activar el robot
    @Override
    public void activar() {
        System.out.println("El robot ya está activado");
    }

    // Método para suspender el robot
    @Override
    public void suspender() {
        System.out.println("Robot suspendido");
        // Cambiar el estado del robot a suspendido y reiniciar los contadores de pasos y cocción
        robot.setEstado(robot.getEstadoSuspendido());
        robot.setPasos(0);
        robot.setCoccion(0);
    }

    // Método para caminar
    @Override
    public void caminar() {
        // Incrementar el contador de pasos
        robot.setPasos(robot.getPasos() + 1);
        // Si el contador es menor que 3, mostrar un mensaje de progreso
        if (robot.getPasos() < 3) {
            System.out.println("Estoy caminando");
        }
        // Si el contador es igual a 3, mostrar un mensaje de llegada y cambiar el estado del robot a ordenando
        else if (robot.getPasos() == 3) {
            System.out.println("El robot ha llegado");
            System.out.println("Estoy tomando la orden");
            System.out.println("Este es el menú:");
            System.out.println("1. Hamburguesa sencilla");
            System.out.println("2. Hamburguesa doble");
            System.out.println("3. Hamburguesa especial");
            robot.setEstado(robot.getEstadoOrdenando());
        }
        // Si el contador es mayor que 3, mostrar un mensaje de que ya ha llegado y que ahora puede seleccionar la opción de Ordenar
        else {
            System.out.println("El robot ya ha llegado y ahora puede seleccionar la opción de Ordenar");
        }
    }

    // Método para cocinar
    @Override
    public void cocinar() {
        System.out.println("No puedo cocinar sin tener una orden");
    }

    // Método para ordenar
    @Override
    public void ordenar() {
        System.out.println("No puedo ordenar sin haber llegado al cliente");
    }

    // Método para apagar el robot
    @Override
    public void apagar() {
        System.out.println("Robot apagado");
        // Cambiar el estado del robot a apagado y reiniciar los contadores de pasos y cocción
        robot.setEstado(robot.getEstadoApagado());
        robot.setPasos(0);
        robot.setCoccion(0);
    }
}