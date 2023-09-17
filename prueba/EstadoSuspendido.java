package practica02.prueba;
// Clase que representa el estado suspendido del robot
class EstadoSuspendido extends EstadoRobot {
    // Constructor que llama al constructor de la clase padre
    public EstadoSuspendido(Robot robot) {
        super(robot);
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
        System.out.println("El robot ya está suspendido");
    }

    // Método para caminar
    @Override
    public void caminar() {
        System.out.println("No puedo caminar mientras esté suspendido");
    }

    // Método para cocinar
    @Override
    public void cocinar() {
        System.out.println("No puedo cocinar mientras esté suspendido");
    }

    // Método para ordenar
    @Override
    public void ordenar() {
        System.out.println("No puedo ordenar mientras esté suspendido");
    }

    // Método para apagar el robot
    @Override
    public void apagar() {
        System.out.println("No puedo apagarme mientras esté suspendido");
    }
}
