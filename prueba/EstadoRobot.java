package practica02.prueba;
// Clase abstracta que representa el estado del robot
abstract class EstadoRobot {
    // Referencia al robot
    protected Robot robot;

    // Constructor que recibe el robot
    public EstadoRobot(Robot robot) {
        this.robot = robot;
    }

    // Métodos abstractos para las acciones del robot
    public abstract void activar();
    public abstract void suspender();
    public abstract void caminar();
    public abstract void cocinar();
    public abstract void ordenar();
    public abstract void apagar();
}
  
  
