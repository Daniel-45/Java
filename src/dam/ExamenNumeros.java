package dam;

import java.util.*;

import daw.com.Teclado;

public class ExamenNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Pedir la longitud de un array por teclado. 
		 * 2. Llenar el array con valores introducidos por teclado. 
		 * 3. Mostrar la posición que ocupa y el valor de los numeros menores de 5.
		 */

		int longitud = leerPositivo("Introduce la longitud del array:");

		int numeros[] = new int[longitud];

		// Llenar el array.
		leerNumeros(numeros);

		// Mostrar la posición y valor correspondiente.
		mostrarValores(numeros);
	}

	// Función para determinar la longitud del array.
	@SuppressWarnings("resource")
	public static int leerPositivo(String mensaje) {

		Scanner entrada = new Scanner(System.in);

		int num;

		do {
			System.out.println(mensaje);
			num = entrada.nextInt();
		} while (num < 0);

		return num;
	}

	// Función para llenar el array.
	@SuppressWarnings({ "unused" })
	public static void leerNumeros(int numerosFuncion[]) {

		int valores;

		System.out.println("Introduce los valores del array:");
		
		for (int i = 0; i < numerosFuncion.length; i++) {
			numerosFuncion[i] = valores = Teclado.leerInt();
		}
		
	}

	// Función para mostrar la posición de los valores menores de 5.
	public static void mostrarValores(int valoresFuncion[]) {

		System.out.println("\nEl resultado de llenar el array es:\n");
		for (int i = 0; i < valoresFuncion.length; i++) {
			System.out.print("[" + valoresFuncion[i] + "]");
		}

		System.out.println();
		System.out.println("\nLos valores menores de 5 del el array estan en:\n");

		for (int i = 0; i < valoresFuncion.length; i++) {
			if (valoresFuncion[i] < 5) {
				System.out.println("La posición [" + i + "] contiene el valor [" + valoresFuncion[i] + "]");
			}

		}

		System.out.println();
		System.out.println("Los valores mayores o iguales a 5 del el array estan en:\n");

		for (int i = 0; i < valoresFuncion.length; i++) {
			if (valoresFuncion[i] >= 5) {
				System.out.println("La posición [" + i + "] contiene el valor [" + valoresFuncion[i] + "]");
			}
		}
	}
}
