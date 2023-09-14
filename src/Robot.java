/**
 * Clase que representa al robot
 */
public class Robot{
    MenuGeneral menuGeneral;
    MenuDelDia menuDia;
    MenuDeLujo menuLujo;


    public Robot(MenuGeneral menuGeneral, MenuDelDia menuDia, MenuDeLujo menuDeLujo){
        this.menuGeneral = menuGeneral;
        this.menuDia = menuDia;
        this.menuLujo = menuDeLujo;
    }

    public void printMenu(){
        Iterator menuGeneralIterador = menuGeneral.createIterator();
        Iterator menuDiaIterador = menuDia.createIterator();
        Iterator menuLujoIterator = menuLujo.createIterator();

        System.out.println("Menú General :D \n");
        printMenu(menuGeneralIterador);
        System.out.println("Menú del día D: \n");
        printMenu(menuDiaIterador);
        System.out.println("Menú deluxe :D \n");
        printMenu(menuLujoIterator);


    }
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            Platillo platillo = (Platillo)iterator.next();
            System.out.print(platillo.getName() + ", ");
            System.out.print(platillo.getPrecio() + " -- ");
            System.out.println(platillo.getDescripcion());
        }
    }

}
