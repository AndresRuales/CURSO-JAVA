package HerenciaYPolimorfismo;

public class TestGerente {
	
	public static void main(String[] args) {
		
		//Gerente gerente = new Gerente();
		
		//gerente.setSalario(5000);
		
		Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setTipo(1);
		gerente.getBonificacion();
		
		System.out.println(gerente.getBonificacion());
		
		
		
		
		Gerente gerente2 = new Gerente();
		
		
		
		gerente2.setClave("Alura");

		System.out.println(gerente2.iniciarSesion("Alura"));
	}

}
