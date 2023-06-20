package ManejoExcepciones;

public class MiException extends Exception{
	
	
	public MiException() {
		super();
	}
	
	
	public MiException(String message) {
		super(message);
	}
	
	
	//Es mejor heredar mi Excepcion de la clase RuntimeException, 
		//porque puede que quiza lance excepcion o no
		//si se extiende de Exception, si o si toca lanzarla con Throwable


	
	

}
