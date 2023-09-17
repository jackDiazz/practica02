import java.util.Iterator;
/**
 * Clase principal Robot
 */
public class Robot {
    Iterator menuGeneralIterador;
    Iterator menuDiaIterador;
    Iterator menuLujoIterator;
    
    //Atributos que representan los estados del robot
    private EstadoRobot modoActivado;
    private EstadoRobot modoCaminar;
	private EstadoRobot modoSuspendido;
	private EstadoRobot modoCocinar;
	private EstadoRobot modoOrdenar;
    private EstadoRobot modoApagado;
    //Atributo que representa el estado actual del robot
    private EstadoRobot estadoActual;
    //Atributos que representan los contadores de pasos y la coccion
    private int pasos;
    private int coccion;

    /**
     * Constructor que recibe todos los menús.
     * Además inicializa los estados y asigna el estado inicial
     * @param menuGeneralIterador
     * @param menuDiaIterador
     * @param menuLujoIterator
     */
    public Robot(Iterator menuGeneralIterador, Iterator menuDiaIterador, Iterator menuLujoIterator){
        this.menuGeneralIterador = menuGeneralIterador;
        this.menuDiaIterador = menuDiaIterador;
        this.menuLujoIterator = menuLujoIterator;

        modoApagado=new ModoApagado(this);
        modoSuspendido= new ModoSuspendido(this);
        modoCaminar= new ModoCaminar(this);
        modoCocinar= new ModoCocinar(this);
        modoOrdenar=new ModoOrdenar(this);
        modoActivado= new ModoActivo(this);

        estadoActual = modoSuspendido;

        pasos=0;
        coccion=0;
    }
    /**
     * Método que asigna un nuevo estado o modo al robot
     * @param nuevoEstado
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado){
		this.estadoActual = nuevoEstado;
	}
    /**
     * Método para obtener el estado o modo actual del robot
     * @return
     */
    public EstadoRobot getEstadoActual(){
        return estadoActual;
    }
    //Métodos para obtener los diferentes estados del robot
    public EstadoRobot getEstadoSuspendido(){
		return modoSuspendido;
	}

	public EstadoRobot getEstadoCaminar(){
		return modoCaminar;
	}

	public EstadoRobot getEstadoCocinar(){
		return modoCocinar;
	}

	public EstadoRobot getEstadoOrdenar(){
		return modoOrdenar;
	}

	public EstadoRobot getEstadoApagado(){
		return modoApagado;
	}
    public EstadoRobot getEstadoActivado(){
        return modoActivado;
    }
    //Métodos para obtener el contador de pasos y cocción
    public int getPasos() {
        return pasos;
    }
  
    public int getCoccion() {
        return coccion;
    }
    //Métodos para cambiar los contadores
    public void setPasos(int pasos) {
        this.pasos = pasos;
    }
  
    public void setCoccion(int coccion) {
        this.coccion = coccion;
    }
    //Métodos para asignar las acciones del robot al estado actual
    public void activar(){
		estadoActual.activar();
	}

	public void caminar(){
        estadoActual.caminar();
	}
	public void apagarse(){
		estadoActual.apagarse();
	}
    public void suspender(){
        estadoActual.suspender();
    }
    public void cocinar(){
        estadoActual.cocinar();
    }
    public void ordenar(){
        estadoActual.ordenar();
    }
    

    public void printMenu() {
        String title = "******************** MENÚ GENERAL ********************";
        String title2 = "******************** MENÚ DEL DÍA ********************";
        String title3 = "******************** MENÚ DELUXE ********************";
    
        int totalWidth = 80;  // Total width of the console (adjust as needed)
        int spaces = (totalWidth - title.length()) / 2;
    
        String blueColor = "\033[34m";
        String redColor = "\033[31m";
        String purpleColor = "\033[35m";
        String resetColor = "\033[0m";
    
        String decorativeLine = "*".repeat(totalWidth);
        String decorativeSpaces = " ".repeat(spaces);
    
        System.out.println(blueColor + decorativeLine + resetColor);
        System.out.println(blueColor + decorativeSpaces + title + resetColor);
        System.out.println(blueColor + decorativeLine + resetColor);
        printMenu(menuGeneralIterador);
    
        System.out.println(redColor + decorativeLine + resetColor);
        System.out.println(redColor + decorativeSpaces + title2 + resetColor);
        System.out.println(redColor + decorativeLine + resetColor);
        printMenu(menuDiaIterador);
    
        System.out.println(purpleColor + decorativeLine + resetColor);
        System.out.println(purpleColor + decorativeSpaces + title3 + resetColor);
        System.out.println(purpleColor + decorativeLine + resetColor);
        printMenu(menuLujoIterator);
    }
    

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Platillo platillo = (Platillo) iterator.next();
            platillo.muestraPlatillo();
        }
    }
}
