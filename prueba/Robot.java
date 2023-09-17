package practica02.prueba;
// Clase que representa al robot
public class Robot {
  // Atributos que representan los estados posibles del robot
  private EstadoRobot estadoSuspendido;
  private EstadoRobot estadoActivado;
  private EstadoRobot estadoCaminando;
  private EstadoRobot estadoOrdenando;
  private EstadoRobot estadoCocinando;
  private EstadoRobot estadoApagado;

  // Atributo que representa el estado actual del robot
  private EstadoRobot estadoActual;

  // Atributos que representan los contadores de pasos y cocción del robot
  private int pasos;
  private int coccion;

  // Constructor que inicializa los estados y asigna el estado inicial
  public Robot() {
      estadoSuspendido = new EstadoSuspendido(this);
      estadoActivado = new EstadoActivado(this);
      estadoCaminando = new EstadoCaminando(this);
      estadoOrdenando = new EstadoOrdenando(this);
      estadoCocinando = new EstadoCocinando(this);
      estadoApagado = new EstadoApagado(this);
      estadoActual = estadoSuspendido;
      pasos = 0;
      coccion = 0;
  }
      // Métodos para obtener los estados del robot
    public EstadoRobot getEstadoSuspendido() {
      return estadoSuspendido;
  }

  public EstadoRobot getEstadoActivado() {
      return estadoActivado;
  }

  public EstadoRobot getEstadoCaminando() {
      return estadoCaminando;
  }

  public EstadoRobot getEstadoOrdenando() {
      return estadoOrdenando;
  }

  public EstadoRobot getEstadoCocinando() {
      return estadoCocinando;
  }

  public EstadoRobot getEstadoApagado() {
      return estadoApagado;
  }

  // Método para obtener el estado actual del robot
  public EstadoRobot getEstadoActual() {
      return estadoActual;
  }

  // Método para cambiar el estado actual del robot
  public void setEstado(EstadoRobot estado) {
      this.estadoActual = estado;
  }

  // Métodos para obtener los contadores de pasos y cocción del robot
  public int getPasos() {
      return pasos;
  }

  public int getCoccion() {
      return coccion;
  }

  // Métodos para cambiar los contadores de pasos y cocción del robot
  public void setPasos(int pasos) {
      this.pasos = pasos;
  }

    public void setCoccion(int coccion) {
      this.coccion = coccion;}
      // Métodos para delegar las acciones del robot al estado actual
    public void activar() {
        estadoActual.activar();
    }

    public void suspender() {
        estadoActual.suspender();
    }

    public void caminar() {
        estadoActual.caminar();
    }

  public void cocinar() {
      estadoActual.cocinar();
  }

  public void ordenar() {
      estadoActual.ordenar();
  }

  public void apagar() {
      estadoActual.apagar();
  }
}


 














