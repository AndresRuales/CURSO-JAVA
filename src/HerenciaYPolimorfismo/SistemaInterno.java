package HerenciaYPolimorfismo;

public class SistemaInterno {
	
	
	private String clave = "1234";
	
	public boolean autentica(Gerente gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
		
	}
	
	

}
