package ManejoExcepciones;

public class TestCuentaExceptionCheked {
	
	
	public static void main(String[] args) {
		
		//Verificacion de una excepcion de tipo Checked

		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		} catch (MiException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
