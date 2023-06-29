package Java.util;

public class Wrappes {
	
	public static void main(String[] args) {
		
		
		Double numeroDoble = 33.0; // AutoBoxing
		
		Boolean verdadero = true; //AutoBoxing
		
		
		Double numeroDouble2 = Double.valueOf(33); //Transforma el valor a double
											//Porque tiene un metodo sobrecargado
		System.out.println(numeroDouble2);
		
		String numeroString = "43";
		
		//Transforma el String en un Double por el metodo
		Double stringToDouble = Double.valueOf(numeroString);
		
		
		//Transforma el String en un Int por el metodo
		Integer stringToInteger = Integer.valueOf(numeroString);
		
		//TODO LOS WRAPPERS QUE SON DE TIPO NUMERO, EXTIENDEN O SON HIJOS DE JAVA.LANG.NUMBER
		
		//EL METODO parseInt, parseDouble.... etc --> devuelve un PRIMITIVO
		// EL METODO valueOf.... etc --> devuelve una referencia, un objeto
		
	}
		
	
		
}
