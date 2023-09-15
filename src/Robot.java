import java.util.Iterator;

public class Robot {
    Iterator menuGeneralIterador;
    Iterator menuDiaIterador;
    Iterator menuLujoIterator;

    public Robot(Iterator menuGeneralIterador, 
                Iterator menuDiaIterador, 
                Iterator menuLujoIterator) {

        this.menuGeneralIterador = menuGeneralIterador;
        this.menuDiaIterador = menuDiaIterador;
        this.menuLujoIterator = menuLujoIterator;
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
