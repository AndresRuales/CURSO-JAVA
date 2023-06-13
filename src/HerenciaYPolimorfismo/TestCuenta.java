package HerenciaYPolimorfismo;

public class TestCuenta {
	public static void main(String[] args) {
		
		
		CuentaCorriente cc = new CuentaCorriente(1,1);
		CuentaAhorros ca = new CuentaAhorros(2,2);
		
		cc.aumentarSaldo(2000);
	}

}
