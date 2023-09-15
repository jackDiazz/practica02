/**
 * Clase que representa al main y al restaurante, donde se pueden alterar los menú del día y de lujo 
 */
import java.util.Iterator;

public class Restaurante {
    public static void main(String[] args) {
        // Creación de los menús
        MenuGeneral menuGeneral = new MenuGeneral();
        MenuDelDia menuDia = new MenuDelDia();
        MenuDeLujo menuDeLujo = new MenuDeLujo();

        // Creación e iniciliazación de los ietardores.
        Iterator menuGeneralIterator = menuGeneral.createIterator();
        Iterator menuDiaIterator = menuDia.createIterator();
        Iterator menuLujoIterator = menuDeLujo.createIterator();

        // Creación de la instancia Robot (SOLO RECIBE ITERADORES)
        Robot robot = new Robot(menuGeneralIterator, menuDiaIterator, menuLujoIterator);

        // Objecto robot llama al método para imprimir el menú.
        robot.printMenu();
    }
}
