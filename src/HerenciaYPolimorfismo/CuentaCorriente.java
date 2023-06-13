package HerenciaYPolimorfismo;

public class CuentaCorriente extends Cuenta{

	public CuentaCorriente(int agencia, int numero) {
		//super esta llamando al constructor de la clase CUENTA
			//Y se inicializan los dos tributos
		super(agencia, numero);
	}
	
	
	@Override
	public boolean retirar(double valor) {
		// TODO Auto-generated method stub
		return super.retirar(valor);
	}
}
