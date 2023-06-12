package POO;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();

	
	//CONSTRUCTOR por defecto
	

	//CONSTRUCTOR para inicializar agencia
		//SE OBLIGA A PASAR UN VALOR CUANDO SE CREA UN OBJETO DE TIPO CUENTA
	public Cuenta(int agencia) {
		if (agencia <=0) {
			System.out.println("No se permite 0");
			this.agencia = agencia;
		}
	}
	
	
	
	//METODO PARA AUMENTAR SALDO
	public void aumentarSaldo (double valor) {
		//this para hacer referencia al atributo de la clase
		this.saldo += valor;
		
	}
	
	public boolean retirar(double valor) {
		
		if(this.saldo>= valor) {
			this.saldo-=valor;
			return true;
		} else {
			return false;
		}	
	}
	
	public boolean transferir (double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.aumentarSaldo(valor);
			return true;
		}else {
			return false;
		}
	}
	
	//ENCAPSULAMIENTO, MODIFICAR EL PUBLIC, POR PRIVATE, PARA QQUE SOLO SE MODIFIQUE 
		//CON CIERTOS METODOS, COMO EL GETTER
	
	//EL METODO GETTER DEBE DE TENER EL MISMO FORMATO QUE SU VARIABLE 
		//Es publico para que el metodo sea accesible a todo el codigo externo
	
	public double getSaldo(){
		return this.saldo;
		
	}
	
	//LOS METODOS SETT, SE USAN PARA PONER CONDICIONALES, EN ESTE CASO,
		//SE LE ASIGNA EL VALOR SI EL NUMERO ES POSITIVO
	public void setAgencia (int nuevaAgencia) {
		if (nuevaAgencia>0) {
			this.agencia = nuevaAgencia;
		}else {
			System.out.println("No estan permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	
	
	
	
	
}
