/**
 * Clase que representa al main y al restaurante, donde se pueden alterar los menú del día y de lujo 
 */
public class Restaurante{
	public static void main(String[] args){

		// Crear los menús del día y de lujo
		MenuDelDia menuDia = new MenuDelDia();
		menuDia.agregarPlatillo(new Platillo(4, "Hamburguesa con pollo", "¿Verdaderamente necesitas una descripción? Es una hamburguesa, y tiene pollo.", 110, true, false));
		menuDia.agregarPlatillo(new Platillo(5, "Hamburguesa de res", "¿En serio? Es una hamburguesa, y tiene res.", 120, true, false));
		menuDia.agregarPlatillo(new Platillo(6, "Hamburguesa de pato", "Fresco, para los amantes del chile.", 150, true, false));
		menuDia.agregarPlatillo(new Platillo(7, "Hamburguesa de conejo", "No te preocupes, era un conejo deprimido.", 150, true, false));
	    MenuDeLujo menuLujo = new MenuDeLujo();
		menuLujo.agregarPlatillo(8, new Platillo(8, "Especialidad de la casa", "La receta secreta, no preguntes de qué es la carne ni de dónde salió, sólo disfrutala, (algunos dicen que el sabor se parece al cerdo).", 300, true, false));
		menuLujo.agregarPlatillo(9, new Platillo(9, "Hamburguesa de unicornio", "Sí, como leíste.", 220, false, true));
		menuLujo.agregarPlatillo(10, new Platillo(10, "Hamburguesa de gato", "No te preocupes, ningún gato fue lastimado durante la creación de ésta hamburguesa.", 220, false, true));

		// Crear el menú
		Menu menu = new Menu(menuDia, menuLujo);
	}	
}
