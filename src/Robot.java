import java.util.Iterator;

public class Robot {
    Iterator menuGeneralIterador;
    Iterator menuDiaIterador;
    Iterator menuLujoIterator;

    private EstadoRobot estadoActual;

    private EstadoRobot modoApagado;
	private EstadoRobot modoSuspendido;
	private EstadoRobot modoCaminar;
	private EstadoRobot modoCocinar;
	private EstadoRobot modoOrdenar;

    public Robot(Iterator menuGeneralIterador, Iterator menuDiaIterador, Iterator menuLujoIterator){
        this.menuGeneralIterador = menuGeneralIterador;
        this.menuDiaIterador = menuDiaIterador;
        this.menuLujoIterator = menuLujoIterator;
    }
    public Robot(){
        modoApagado=new ModoApagado(this);
        modoSuspendido= new ModoSuspendido(this);
        modoCaminar= new ModoCaminar(this);
        modoCocinar= new ModoCocinar(this);
        modoOrdenar=new ModoOrdenar(this);

        estadoActual = modoApagado;
    }

    public void asignarNuevoEstado(EstadoRobot nuevoEstado){
		estadoActual = nuevoEstado;
	}
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
