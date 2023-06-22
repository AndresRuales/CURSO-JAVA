package Java.lang;


/**Esto es una documentacion
 * 
 * Aqui se pone para que sirve esta clase
 * @version 1.0
 * @author Ruales
 * 
 * El java DOC, sirve para obtener la documentacion del codigo
 *
 */

public class ModificadoresAcceso {
	//son los public, private, protected, default
		//limita el alcance de un objeto, metodo
		//si no hay modificador de acceso es default
	
	//Default, la clase es visible solo dentro del mismo package
	//Public, puede usarlo cualquier clase en cualquier package
	//Protected, da visibilidad a nivel de package y herencia
		//un atributo es accesible por cualquier hija de la clase fuera del package
		// y tambien dentro del mismo package
	//Private: no puede acceder ni fuera de la clase
	
	
	//Public accesible desde cualquier parte
	//default accesible dentro del paquete
	//protected default + clases hijas
	//private solo desde la clase misma --> se puede acceder por metodo getters y setters
	
	/**
	 *Tambien se puede documentar el constructor
	 */
	public ModificadoresAcceso() {
		
	}
	
	
}
