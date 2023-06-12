package HerenciaYPolimorfismo;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		
		diego.setDocumento("12353");
		diego.setNombre("Diego");
		diego.setSalario(100);
		
		
		
		
		System.out.println(diego.getNombre());
		System.out.println(diego.getDocumento());
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
