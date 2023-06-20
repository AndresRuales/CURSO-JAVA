package HerenciaYPolimorfismo;

public class TestReferencias {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		
		
		
		funcionario.setSalario(2000);
		//gerente.setSalario(10000);
		
		//SE PUEDE DECLARAR UN FUNCIONARIO COMO = NEW GERENTE(), PORQUE TODO GERENTE
			//ES FUNCIONARIO
		
		
		//PARA PODER UTILIZAR LOS METODOS DE GERENTE, SE DEBE INSTANCEAR UN OBJETO GERENTE.
			//ASI EL FUNCIONARIO SEA = NEW GERENTE(), NO DEJA UTILIZAR SUS FUNCIONES,
				//DEBE DE SER GERENTE gerente = new Gerente();
	}

}
