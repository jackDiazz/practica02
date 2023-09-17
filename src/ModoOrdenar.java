import java.util.Scanner;
 
public class ModoOrdenar implements EstadoRobot{
    protected Robot robot;

    MenuGeneral menuGeneral= new MenuGeneral();
    MenuGeneralIterador menuGeneralIterator = menuGeneral.createIterator();
    MenuDelDia menuDelDia= new MenuDelDia();
    MenuDeLujo menuDeLujo= new MenuDeLujo();
    MenuDiaIterador menuDiaIterador= menuDelDia.createIterator();
    MenuLujoIterador menuLujoIterador=menuDeLujo.createIterator();
    Scanner scanner = new Scanner(System.in);
    //int id = scanner.nextInt();
    public ModoOrdenar(Robot robot){
		this.robot = robot;
	}
    @Override
    public void suspender(){
        System.out.println("¿Me trajiste hasta aquí solo para suspenderme?"+"\nOrdena algo de una vez");
    }
    @Override
	public void caminar(){
        System.out.println("No necesito caminar más. Ordena algo por favor.");
        
    }
    @Override
	public void activar(){
        System.out.println("Oye!,¿no ves que ya estoy activo?");
        
    }
    @Override
	public void cocinar(){
        System.out.println("Primero déjame tomar tu orden -.-");
    }
    @Override
    public void ordenar(){
        //private Platillo[] platillo = new Platillo[4];
        System.out.println("**Cambiando a modo Tomar Orden**");
        System.out.println("Te mostraré nuestro menú");
        robot.printMenu();
        //Platillo platillo;
        System.out.println("Por favor, indícame el ID del platillo que te gustaría ordenar.");
        
        int id=0;
        try {
            do{
            id = scanner.nextInt();
            if(!existePlatillo(id)){
                System.out.println("Opción inválida, ingresa un ID válido.");
            }
            }while(!existePlatillo(id));
            String nombrePlatillo=getNombrePlatillo(id);
            boolean tieneQueso=preguntarQueso(nombrePlatillo);
            //getPlatillo(id).setQueso(tieneQueso);
            Platillo ordenPedida=getPlatillo(id);
            ordenPedida.setQueso(tieneQueso);
            robot.setOrden(ordenPedida);
            System.out.println("Enseguida vuelvo con tu "+ nombrePlatillo+" uwu");
            System.out.println("**Cambiando a modo Cocinar**");
            robot.asignarNuevoEstado(robot.getEstadoCocinar());
            robot.setCoccion(0);
        } catch (Exception e) {
            // TODO: handle exception       
            System.out.println("Lo siento, esa opción no la tengo, vuelve a ordenar.");
            //robot.asignarNuevoEstado(robot.getEstadoOrdenar());
            scanner.nextLine();
            
        }
        
        
    }

    /**
     * Método para preguntarle al usuario si desea queso en su hamburguesa.
     * @param nombrePlatillo
     */
    public boolean preguntarQueso(String nombrePlatillo){
        System.out.println("¿Quieres tu "+ nombrePlatillo+" con queso?");
        int opcion=0;
        do{
            try {
                System.out.println("Por favor selecciona una opción");
                System.out.println("1. Sii, ponle kesito");
                System.out.println("2. No, sin queso pls");
                opcion= scanner.nextInt();
                if(opcion==1){
                System.out.println("Perfecto, preparando una "+nombrePlatillo+" con queso.");
                }else if(opcion==2){
                  System.out.println("Perfecto, preparando una "+nombrePlatillo+" sin queso.");
                }else{
                    System.out.println("Esa opción no es válida.");
                }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Esa no es una opción válida.");
            scanner.nextLine();
        }
        }while(opcion!=1 && opcion!=2);
        return opcion==1?true:false;

    }
    /**
     * Método para retornar el platillo
     * @param id
     * @return platilloTemporal;
     */
    public Platillo getPlatillo(int id){
		try {
            menuGeneralIterator.resetPosicion();
            menuDiaIterador.resetPosicion();
            menuLujoIterador.resetPosicion();
			//Iterar sobre el menú general
            while(menuGeneralIterator.hasNext()){
                Platillo platilloTemporal= menuGeneralIterator.next();
                if(platilloTemporal.getId()==id){
                    return platilloTemporal;
                }
            }
            while(menuDiaIterador.hasNext()){
                
                Platillo platilloTemporal= menuDiaIterador.next();
                if(platilloTemporal.getId()==id){
                    return platilloTemporal;
                }
            }
            while(menuLujoIterador.hasNext()){
                Platillo platilloTemporal= menuLujoIterador.next();
                if(platilloTemporal.getId()==id){
                    return platilloTemporal;
                }
            }
            
		} catch (Exception e) {
			// TODO: handle exception
            return menuDiaIterador.next();
		}return menuGeneralIterator.next();

	}

    /**
     * Método para obtener el nombre del platillo
     * @param id es el número identificador del platillo
     * @return platilloTemporal.getName();
     */
    public String getNombrePlatillo(int id){
		try {
            menuGeneralIterator.resetPosicion();
            menuDiaIterador.resetPosicion();
            menuLujoIterador.resetPosicion();
			//Iterar sobre el menú general
            while(menuGeneralIterator.hasNext()){
                Platillo platilloTemporal= menuGeneralIterator.next();
                if(platilloTemporal.getId()==id){
                    return platilloTemporal.getName();
                }
            }
            while(menuDiaIterador.hasNext()){
                
                Platillo platilloTemporal= menuDiaIterador.next();
                if(platilloTemporal.getId()==id){
                    return platilloTemporal.getName();
                }
            }
            while(menuLujoIterador.hasNext()){
                Platillo platilloTemporal= menuLujoIterador.next();
                if(platilloTemporal.getId()==id){
                    return platilloTemporal.getName();
                }
            }
            
		} catch (Exception e) {
			// TODO: handle exception
            return "Platillo inválido";
		}return "Platillo inválido";

	}
    /**
     * Método para verificar que existe un platillo
     * @param id
     * @return
     */
    public boolean existePlatillo(int id){
		try {
            menuGeneralIterator.resetPosicion();
            menuDiaIterador.resetPosicion();
            menuLujoIterador.resetPosicion();
			//Iterar sobre el menú general
            while(menuGeneralIterator.hasNext()){
           
                Platillo platilloTemporal= menuGeneralIterator.next();
                if(platilloTemporal.getId()==id){
                    return true;
                }
            }
            while(menuDiaIterador.hasNext()){
                Platillo platilloTemporal= menuDiaIterador.next();
                if(platilloTemporal.getId()==id){
                    return true;
                }
            }
            while(menuLujoIterador.hasNext()){
                Platillo platilloTemporal= menuLujoIterador.next();
                if(platilloTemporal.getId()==id){
                    return true;
                }
            }
            
		} catch (Exception e) {
			// TODO: handle exception
            return false;
		}
        return false;

	}
    @Override
    public void apagarse(){
        System.out.println("Te arrepentirás de no haber ordenado >:c");
        System.out.println("**Cambiando a modo Apagado**");
        robot.asignarNuevoEstado(robot.getEstadoApagado());
    }
    
}
