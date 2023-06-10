
public class EjemploCaracteres {

	public static void main(String[] args) {

		// Solo acepta un caracter
		char caracter = 'a';
		System.out.println(caracter);

		// Las variables primitivas son en minusculas

		// Objeto, String,

		String palabra = "Daniel Andres Ruales";
		int numero = 5;
		System.out.println(palabra + numero);

		// CONDICIONAL IF --> el OR es ||
		// --> Y es &&

		if (numero == 5 || numero == 2) {
			System.out.println("Hola");
		}

		int mes = 10;

		switch (mes) {
		case 1:
			System.out.println("El mes es enero");
			break;
		case 2:
			System.out.println("El mes es febrero");
			break;
		case 3:
			System.out.println("El mes es marzo");
			break;
		case 4:
			System.out.println("El mes es abril");
			break;
		case 5:
			System.out.println("El mes es mayo");
			break;
		case 6:
			System.out.println("El mes es junio");
			break;
		case 7:
			System.out.println("El mes es julio");
			break;
		case 8:
			System.out.println("El mes es agosto");
			break;
		case 9:
			System.out.println("El mes es septiembre");
			break;
		case 10:
			System.out.println("El mes es octubre");
			break;
		case 11:
			System.out.println("El mes es noviembre");
			break;
		case 12:
			System.out.println("El mes es diciembre");
			break;
		default:
			System.out.println("Mes inválido");
			break;

		}
		int contador = 0;

		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}

	}

}
