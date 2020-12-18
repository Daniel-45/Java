package dam;

import java.util.*;

import daw.com.Teclado;

public class LlenarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pide un numero por teclado, crea un array de enteros de tantas posiciones
		 * como el numero introducido de numeros con valores pedidos por teclado.
		 * Muestra por consola el indice y el valor al que corresponde. 
		 * Haz dos metodos, uno para rellenar valores y otro para mostrar.
		 */

		int array[] = new int[Teclado.leerInt("Introduce el tamaño del Array:")];

		llenarArray(array);

		mostrarArray(array);
	}

	// Funcion para rellenar el array.
	public static void llenarArray(int[] arrayFuncion) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < arrayFuncion.length; i++) {
			// Rellenar el array con números pedidos por teclado.
			System.out.print("\nIntroduce el valor para la posicion " + "[" + i + "]" + " de " + "[" + arrayFuncion.length + "]" + " del Array: ");
			arrayFuncion[i] = entrada.nextInt();
		}
	}

	// Funcion para mostrar el array.
	public static void mostrarArray(int[] arrayFuncion) {
		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {
			System.out.println("El valor de la posicion " + "[" + i + "]" + "[" + arrayFuncion.length + "]" + " es: " + arrayFuncion[i]);
		}
	}
}
