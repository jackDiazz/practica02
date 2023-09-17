package practica02.prueba;
// Clase que representa el estado activado del robot
class EstadoActivado extends EstadoRobot {
  // Constructor que llama al constructor de la clase padre
  public EstadoActivado(Robot robot) {
      super(robot);
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
      robot.setCoccion(0);}

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
  
  
