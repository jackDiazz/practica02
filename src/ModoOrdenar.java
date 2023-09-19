import java.util.Scanner;

/**
 * Clase que representa el estado "Modo Ordenar" de un robot en un restaurante.
 */
public class ModoOrdenar implements EstadoRobot {
    /**
     * Referencia al robot.
     */
    protected Robot robot;

    /**
     * Menús disponibles y sus iteradores correspondientes.
     */
    MenuGeneral menuGeneral = new MenuGeneral();
    MenuDelDia menuDelDia = new MenuDelDia();
    MenuDeLujo menuDeLujo = new MenuDeLujo();

    /**
     * Scanner para recibir la instrucción del usuario.
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Constructor del estado "Modo Ordenar".
     * @param robot El robot al que se asignará este estado.
     */
    public ModoOrdenar(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void suspender() {
        System.out.println("¿Me trajiste hasta aquí solo para suspenderme?\nOrdena algo de una vez.");
    }

    @Override
    public void caminar() {
        System.out.println("No necesito caminar más. Ordena algo por favor.");
    }

    @Override
    public void activar() {
        System.out.println("Oye, ¿no ves que ya estoy activo?");
    }

    @Override
    public void cocinar() {
        System.out.println("Primero déjame tomar tu orden -.-");
    }

    @Override
    public void apagarse() {
        System.out.println("Te arrepentirás de no haber ordenado >:c");
        System.out.println("**Cambiando a modo Apagado**");
        robot.asignarNuevoEstado(robot.getEstadoApagado());
    }

    @Override
    public void ordenar() {
        System.out.println("**Cambiando a modo Tomar Orden**");
        System.out.println("Te mostraré nuestro menú:");
        robot.printMenu();

        System.out.println("Por favor, indícame el ID del platillo que te gustaría ordenar.");

        int id = 0;
        try {
            do {
                id = scanner.nextInt();
                if (!existePlatillo(id)) {
                    System.out.println("Opción inválida, ingresa un ID válido.");
                }
            } while (!existePlatillo(id));

            String nombrePlatillo = getNombrePlatillo(id);
            boolean tieneQueso = preguntarQueso(nombrePlatillo);

            Platillo ordenPedida = getPlatillo(id);
            if (ordenPedida != null) {
                ordenPedida.setQueso(tieneQueso);
                robot.setOrden(ordenPedida);
                System.out.println("Enseguida vuelvo con tu " + nombrePlatillo + " uwu");
                System.out.println("**Cambiando a modo Cocinar**");
                robot.asignarNuevoEstado(robot.getEstadoCocinar());
                robot.setCoccion(0);
            } else {
                System.out.println("Lo siento, esa opción no la tengo, vuelve a ordenar.");
            }
        } catch (Exception e) {
            System.out.println("Lo siento, esa opción no la tengo, vuelve a ordenar.");
            scanner.nextLine();
        }
    }

    /**
     * Método para preguntarle al usuario si desea queso en su platillo.
     * @param nombrePlatillo El nombre del platillo.
     * @return true si el usuario quiere queso, false en caso contrario.
     */
    public boolean preguntarQueso(String nombrePlatillo) {
        System.out.println("¿Quieres tu " + nombrePlatillo + " con queso?");
        int opcion = 0;
        do {
            try {
                System.out.println("Por favor selecciona una opción:");
                System.out.println("1. Sí, ponle queso");
                System.out.println("2. No, sin queso por favor");
                opcion = scanner.nextInt();
                if (opcion == 1) {
                    System.out.println("Perfecto, preparando una " + nombrePlatillo + " con queso.");
                } else if (opcion == 2) {
                    System.out.println("Perfecto, preparando una " + nombrePlatillo + " sin queso.");
                } else {
                    System.out.println("Esa opción no es válida.");
                }
            } catch (Exception e) {
                System.out.println("Esa no es una opción válida.");
                scanner.nextLine();
            }
        } while (opcion != 1 && opcion != 2);
        return opcion == 1;
    }

    /**
     * Método para obtener un platillo por su ID.
     * @param id El ID del platillo deseado.
     * @return El platillo correspondiente al ID o null si no existe.
     */
    public Platillo getPlatillo(int id) {
        Platillo platillo = menuGeneral.getPlatillo(id);
        if (platillo != null) {
            return platillo;
        }
        platillo = menuDelDia.getPlatillo(id);
        if (platillo != null) {
            return platillo;
        }
        return menuDeLujo.getPlatillo(id);
    }

    /**
     * Método para obtener el nombre de un platillo por su ID.
     * @param id El ID del platillo deseado.
     * @return El nombre del platillo correspondiente al ID o null si no existe.
     */
    public String getNombrePlatillo(int id) {
        String nombrePlatillo = menuGeneral.getNombrePlatillo(id);
        if (nombrePlatillo != null) {
            return nombrePlatillo;
        }
        nombrePlatillo = menuDelDia.getNombrePlatillo(id);
        if (nombrePlatillo != null) {
            return nombrePlatillo;
        }
        return menuDeLujo.getNombrePlatillo(id);
    }

    /**
     * Método para verificar si existe un platillo con un ID dado.
     * @param id El ID del platillo a verificar.
     * @return true si el platillo existe, false si no.
     */
    public boolean existePlatillo(int id) {
        return (menuGeneral.getPlatillo(id) != null) ||
               (menuDelDia.getPlatillo(id) != null) ||
               (menuDeLujo.getPlatillo(id) != null);
    }
}
