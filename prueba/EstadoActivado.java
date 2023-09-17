package practica02.prueba;
// Clase que implementa el estado activado del robot
class EstadoActivado implements EstadoRobot {
  // Referencia al robot
  protected Robot robot;

  // Constructor que recibe el robot
  public EstadoActivado(Robot robot) {
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
      // Cambiar el estado del robot a suspendido
      robot.setEstado(robot.getEstadoSuspendido());
  }

  // Método para caminar
  @Override
  public void caminar() {
      System.out.println("Estoy caminando");
      // Cambiar el estado del robot a caminando y reiniciar los contadores de pasos y cocción
      robot.setEstado(robot.getEstadoCaminando());
      robot.setPasos(0);
      robot.setCoccion(0);
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
      // Cambiar el estado del robot a apagado
      robot.setEstado(robot.getEstadoApagado());
  }
}
  
  
