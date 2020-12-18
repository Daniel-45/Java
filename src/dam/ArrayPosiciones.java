package dam;

import java.util.*;

public class ArrayPosiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un array de N posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el indice y el valor al que corresponde. 
		 * Haz dos métodos, uno para rellenar valores y otro para mostrar.
		 */

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la dimension del array:");

		int array[] = new int[entrada.nextInt()];

		rellenarArray(array);
		mostrarArray(array);
	}

	// Función para rellenar el array.
	public static void rellenarArray(int[] arrayFuncion) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < arrayFuncion.length; i++) {
			System.out.print("Introduzca el numero de la posicion [" + i + "]" + " de " + "[" + arrayFuncion.length
					+ "]" + ": ");
			arrayFuncion[i] = entrada.nextInt();
		}
	}

	// Función para mostrar el array.
	public static void mostrarArray(int[] arrayFuncion) {

		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {
			System.out.println("La posicion [" + i + "]" + " del array tiene el numero " + arrayFuncion[i]);
		}
	}
}
