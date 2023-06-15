package HerenciaYPolimorfismo;

public class CuentaCorriente extends Cuenta{

	public CuentaCorriente(int agencia, int numero) {
		//super esta llamando al constructor de la clase CUENTA
			//Y se inicializan los dos tributos
		super(agencia, numero);
	}
	
	
	//SOBREESCRITURA DE METODO DEL PADRE CUENTA
	@Override
	public boolean retirar(double valor) {
		return super.retirar(valor);
	}
}
