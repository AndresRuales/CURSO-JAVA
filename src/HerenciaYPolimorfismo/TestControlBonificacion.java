package HerenciaYPolimorfismo;

public class TestControlBonificacion {
	
	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		diego.setSalario(2000);
		
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		ControlBonificacion controlbonificacion = new ControlBonificacion();
		
		controlbonificacion.registrarSalario(diego);
		controlbonificacion.registrarSalario(jimena);

		Contador alex = new Contador();
		alex.setSalario(5000);
		
		//LOS METODOS SE LLAMAN DE LA CLASE MAS ESPECIFICA A LA MAS GENERAL
		//POR EJEMPLO, SI SE LLAMA EL METODO getBonificacion, primero lo busca en la calse
			//actual, si es gerente, en gerente, si es contador en contar y asi sucesivamente.
			//SINO LO ENCUENTRA VA A SU PADRE.
		
	}
	

}
