package practica02.prueba;
// Clase que implementa el estado apagado del robot
class EstadoApagado implements EstadoRobot {
    // Referencia al robot
    protected Robot robot;

    // Constructor que recibe el robot
    public EstadoApagado(Robot robot) {
        this.robot = robot;
    }

    // Método para activar el robot
    @Override
    public void activar() {
        System.out.println("Robot activado");
        // Cambiar el estado del robot a activado
        robot.setEstado(robot.getEstadoActivado());
    }

    // Método para suspender el robot
    @Override
    public void suspender() {
        System.out.println("No puedo suspenderme mientras estoy apagado");
    }

    // Método para caminar
    @Override
    public void caminar() {
        System.out.println("No puedo caminar mientras estoy apagado");
    }

    // Método para cocinar
    @Override
    public void cocinar() {
        System.out.println("No puedo cocinar mientras estoy apagado");
    }

    // Método para ordenar
    @Override
    public void ordenar() {
        System.out.println("No puedo ordenar mientras estoy apagado");
    }

    // Método para apagar el robot
    @Override
    public void apagar() {
        System.out.println("El robot ya está apagado");
    }
}
    