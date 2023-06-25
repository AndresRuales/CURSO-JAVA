package Java.util;
import java.util.ArrayList;
import HerenciaYPolimorfismo.Cuenta;
import HerenciaYPolimorfismo.CuentaCorriente;



public class ArrayListEjemplo {
	
	public static void main(String[] args) {
		
		//Inicializar un arrayList
			//DE TIPO CUENTA <> se forza a que reciba solo un tipo de objeto <Cuenta>
		ArrayList<Cuenta> lista = new ArrayList();
		//Se puede llamar diferentes metodos
		
		Cuenta cc = new CuentaCorriente(2, 11);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		
		
		
		
		//El arrayList, se amplia automaticamente cuando se llena.
			//metodo add para agregar un objeto al arraylist
		lista.add(cc2);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		
		//Hace un recorrido por todo el arraylist y inprime el objeto
		//tamaño de la lista .size
		for (int i =0; i< lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		//Iterar arraylist con For Each:
		
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
	}

}
