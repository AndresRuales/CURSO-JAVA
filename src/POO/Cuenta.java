package POO;

public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();

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
	
	
	
	
	
	
	
	
	
	
	
	
}
