public class ModoApagado implements EstadoRobot{

	Robot robot;

	public ModoApagado(Robot robot){
		this.robot = robot;
	}

	public void activar(){
		System.out.println("hola1");
	}

	public void caminar(){
		System.out.println("hola2");
	}

	public void ordenar(){
		System.out.println("hola3");
	}

	public void cocinar(){
		System.out.println("hola4");
	}
	public void apagarse(){
		System.out.println("***MODO APAGADO***\nel robot ya está apagado.");
	}
    public void suspender(){
    }
}