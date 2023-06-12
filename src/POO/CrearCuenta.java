package POO;

//INSTANCIAS
public class CrearCuenta {
	public static void main(String[] args) {
		//Primera instancia del objeto CUENTA
		//Cuenta primeraCuenta = new Cuenta();
		
		
		//Segunda instancia del objeto CUENTA

		//Cuenta segundaCuenta = new Cuenta();
		
		//Se usa el metodo SET para darle un valos a agencia.
		//segundaCuenta.setAgencia(22);
		//System.out.println(segundaCuenta);
		
		//segundaCuenta.aumentarSaldo(5000);
		
		//Cuenta cuentadeJimena = new Cuenta();
		//cuentadeJimena.aumentarSaldo(10000);
		//cuentadeJimena.transferir(400, cuentadeJimena);
		
		
		Cuenta cuentaDaniel = new Cuenta(100);
		Cliente daniel = new Cliente();
		
		//daniel.documento = "11444444";
		//aniel.nombre = "Daniel Andres Ruales";
		//daniel.telefono = "346448";
		//cuentaDaniel.titular = daniel;
		
		//SE OBTIENE EL SALDO POR PARTE DEL METODO GETTER
		System.out.println(cuentaDaniel.getSaldo());
		
		//Puedo modificar el atributo documento porque la cuenta tiene atributo de
			// tipo Cliente.
		//cuentaDaniel.titular.documento = "1445";
		//System.out.println(cuentaDaniel.titular.documento);
		cuentaDaniel.setAgencia(500);
		System.out.println(cuentaDaniel.getAgencia());
	}
}



