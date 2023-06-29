package Java.util;

import java.util.*;

public class Resumen {
	
	public static void main(String[] args) {
		
		int numero=0;
		
		//Lista de numeros de tipo int primitivo
		int[] numeros = new int [10];
		
		//Variable de tipo Integer, objeto
		Integer numeroObjeto = 40;
		
		//La List<> solo recibe objetos no primitivos
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(numero); //Autoboxing --> java hace esto (Integer) numero, un Cast
							//para pasarlo a tipo objeto
		lista.add(numeroObjeto);
		
		//unboxing --> detecta un objeto, y lo pasa automaticamente a primitivo
			//Metodo .intValue(); para volver el objeto en primitivo int
		int valorPrimitivo = numeroObjeto.intValue();
		
		//Metodo para asignar un numero al objeto Integer
		lista.add(Integer.valueOf(50));
		
		
		Integer prueba = Integer.valueOf("3");
		prueba++;
		
		System.out.println(prueba);
		
		//WRAPPE
		
		//para retornar el valor en byte
		numeroObjeto.byteValue();
		//para retornar el valor en double
		numeroObjeto.doubleValue();
		//para retornar el valor en float
		numeroObjeto.floatValue();
		
		
		//CADA PRIMITIVO TIENE SU REPRESENTACION COMO OBJETO
	}

}
