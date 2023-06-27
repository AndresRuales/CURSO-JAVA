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
		//tamaño de la lista .size, son los elementos que contiene, SIN CONTAR LOS VACIOS.
			//El arrayList se auto incrementa en espacios.
		for (int i =0; i< lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		//Iterar arraylist con For Each:
		
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		
		//Metodo contains --> 	Si una lista contiene un elemento	
			//Es como una pregunta, si la lista contiene el elemento CC, retorna True,
			//Es un booleano
		boolean contiene = lista.contains(cc);
		
		//SE COMPARA POR REFERENCIA DE OBJETO
		if (contiene) {
			System.out.println("La lista contiene el elemento: "+cc);
		} else {
			System.out.println("La lista NO contiene el elemento: "+cc);
		}
		
		//SE PUEDE COMPARAR POR VALORES DE OBJETO
			//CREANDO UN MENTODO DONDE SE OBTENGAN LOS VALORES DE CADA OBJETO CON GET.
		
		//el metodo equals se debe sobre escribir, para que haga una COMPARACION SOBRE
			//VALORES Y NO BASADA EN REFERENCIAS
		
		//linkedList --> Es como una lista, pero ahorra servicios del sistema
			//al poder eliminar y ordenar los elementos de la lista mas rapidamente.
			//Cada objeto sabe cual es su vecino, asi se elimina uno, los otros se
			//ordenan automaticamenteç
		//PARA RECORRER TODA LA LISTA EL LINKEDLIST NO ES RECOMENDADO, PORQUE SIEMPRE
			//DEBE PREGUNTAR EL OBJETO, CUAL ES SU OBJETO VECINO
		
		
		//HERENCIA DE LISTAS
			//JAVA.UTIL.LIST --> ARRAYLIST
			//				 --> KLINKEDLIST
			//				 --> VECTOR
		
		//List es una interface, ArrayList y LinkedList son implementaciones.
		
		
	}

}
