package ManejoExcepciones;

public class Flujo {
	
	//Pila de ejecucion
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	
	private static void metodo1() {
		System.out.println("Inicion metodo1");
		try {
			metodo2();
		} catch (MiException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicion metodo2");
		
		throw new MiException("Mi excepcion fue lanzada");
		
		/*
		try {//intenta esto
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
			System.out.println("fin metodo2");
		} catch (Exception e) { //atrapa el error
			System.out.println("Sale el error de la excepcion");
		}*/
		
		//LAS EXCEPCIONES SON OBJETOS, TIENEN METODOS
		//metodo para dar el mensaje de la excepcion .getMessage()
		//metodo para mostrar la trazabilidad del error .printStackTrace()
		//con throw new AritmeticException(), se esta lanzando la excepcion.
			//el throw solo funciona con objetos de tipo exception
		
		
		//HERENCIA DE EXCEPCIONES
			// THROWABLE -> EXCEPTION -> RUTIMEEXCEPTION -> 
					//ARITHMETICEXCEPTION y NullPointerExceptio
		
		//HERENCIA DE ERRORRES --> NO PUEDEN SER CONTROLADOS POR NOSOTROS
			// THROWABLE -> ERROR -> STACKOVERFLOWERROR 
				
		//Miexcepcion no puede heredar de Throwable, porque los errores tambien heredan de
			//Thrrowable
		
		
		//Es mejor heredar mi Excepcion de la clase RuntimeException, 
			//porque puede que quiza lance excepcion o no
			//si se extiende de Exception, si o si toca lanzarla con Throwable
		
		
		
		//Las excepciones de la clase EuntimeException son Uncheked
		//Las de la clase Exception son Checked
		
			//Se diferencian al momento de la compilacion
		
		
		
		
		
	}
}
