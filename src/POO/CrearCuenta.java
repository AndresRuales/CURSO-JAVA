package POO;

//INSTANCIAS
public class CrearCuenta {
	public static void main(String[] args) {
		//Primera instancia del objeto CUENTA
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo=1000;
		
		//Segunda instancia del objeto CUENTA

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo=500;
		System.out.println(segundaCuenta);
		
		segundaCuenta.aumentarSaldo(5000);
		
		Cuenta cuentadeJimena = new Cuenta();
		cuentadeJimena.aumentarSaldo(10000);
		cuentadeJimena.transferir(400, cuentadeJimena);
		
		
		Cuenta cuentaDaniel = new Cuenta();
		Cliente daniel = new Cliente();
		
		daniel.documento = "11444444";
		daniel.nombre = "Daniel Andres Ruales";
		daniel.telefono = "346448";
		cuentaDaniel.titular = daniel;
		System.out.println(cuentaDaniel.saldo);
		
		//Puedo modificar el atributo documento porque la cuenta tiene atributo de
			// tipo Cliente.
		cuentaDaniel.titular.documento = "1445";
		System.out.println(cuentaDaniel.titular.documento);

	}
}
