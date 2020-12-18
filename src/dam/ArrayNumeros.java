package dam;

import daw.com.Teclado;

public class ArrayNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pide un número por teclado, crea un array de enteros de tantas posiciones como el número introducido. 
		 * Sobre este Array realiza los siguientes puntos del ejercicio: 
		 * 1. Llenar el Array con números consecutivos dese 1 hasta el límite del Array y mostrar el Array. 
		 * 2. Mostrar el índice y el valor correspondiente. 
		 * 3. Volver a llenar el Array desde el máximo al mánimo. 
		 * 4. Mostrar solo los números pares. 
		 * 5. Mostrar solo los números impares. 
		 * 6. Volver a llenar el Array solo con números pares. 
		 * 7. Volver a llenar el Array solo con números impares. 
		 * 8. Mostrar solo los números primos.
		 */

		// Pedir el longitud del Array por teclado.
		int longitud = leerPositivo("Introduce la longitud del array:");

		int numeros[] = new int[longitud];

		// Función para llenar y mostrar el Array.
		llenarArray(numeros);

		// Función para mostrar el indice y el valor correspondiente.
		mostrarPosicionValor(numeros);

		// Función para llenar el Array invertido.
		llenarArrayInvertido(numeros);

		// Función para mostrar solo los números pares del Array.
		mostrarNumerosPares(numeros);

		// Función para mostrar números impares del Array
		mostrarNumerosImpares(numeros);

		// Función para llenar el array solo con números pares.
		llenarNumerosPares(numeros);

		// Función para llenar el array solo con números impares.
		llenarNumerosImpares(numeros);

		// Mostrar los números primos
		mostrarPrimos(numeros);

	}

	// Funciones

	// Función para obtener la longitud del Array.
	public static int leerPositivo(String mensaje) {
		System.out.println(mensaje);

		int numero;

		do {
			numero = Teclado.leerInt();
		} while (numero < 0);

		return numero;
	}

	// Funcion para llenar el Array con números consecutivos desde 1 hasta que sea
	// necesario.
	public static void llenarArray(int arrayFuncion[]) {

		System.out.println("\nEl resultado de llenar el Array con números consecutivos desde 1 hasta el limite del Array es:");

		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {

			arrayFuncion[i] = i + 1;

			System.out.print("[" + arrayFuncion[i] + "]");
		}
	}

	// Función para mostrar la posicion y el valor correspondiente.
	public static void mostrarPosicionValor(int arrayFuncion[]) {

		System.out.println();

		System.out.println("\nEl resultado de mostrar la posición y el valor correspondiente es:");

		for (int i = 0; i < arrayFuncion.length; i++) {
			// Mostrar posición y valor correspondiente.
			System.out.println("\nLa posición " + "[" + i + "]" + " tiene el valor " + "[" + arrayFuncion[i] + "]");

		}
	}

	// Función para llenar el Array desde el máximo al mínimo.
	public static void llenarArrayInvertido(int arrayFuncion[]) {

		int valor = arrayFuncion.length;

		System.out.println("\nEl resultado de llenar el Array desde el máximo al mínimo es:");

		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {

			arrayFuncion[i] = valor--;

			System.out.print("[" + arrayFuncion[i] + "]");
		}
	}

	// Función para mostrar solo los números pares del Array.
	public static void mostrarNumerosPares(int arrayFuncion[]) {

		System.out.println();

		System.out.println("\nEl resultado de mostrar los numeros pares del Array es:");

		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {

			if (arrayFuncion[i] % 2 == 0) {
				// Hay que mostrar el array, no el indice.
				System.out.print("[" + arrayFuncion[i] + "]");
			}
		}
	}

	// Función para mostrar los números impares del Array.
	public static void mostrarNumerosImpares(int arrayFuncion[]) {

		System.out.println();

		System.out.println("\nEl resultado de mostrar los números impares del Array es:");

		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {

			if (arrayFuncion[i] % 2 != 0) {
				// Hay que mostrar el array, no el indice.

				System.out.print("[" + arrayFuncion[i] + "]");
			}
		}

	}

	// Función para llenar el Array solo con numeros pares.
	public static void llenarNumerosPares(int arrayFuncion[]) {

		System.out.println();

		System.out.println("\nEl resultado de llenar el Array con numeros pares es:");

		System.out.println();

		int valor = 2;

		for (int i = 0; i < arrayFuncion.length; i++) {

			arrayFuncion[i] = valor;

			valor += 2;

			System.out.print("[" + arrayFuncion[i] + "]");
		}
	}

	// Función para llenar el Array solo con números impares.
	public static void llenarNumerosImpares(int arrayFuncion[]) {

		int valor = 1;

		System.out.println();

		System.out.println("\nEl resultado de llenar el Array con numeros impares es:");

		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {

			arrayFuncion[i] = valor;

			valor += 2;

			System.out.print("[" + arrayFuncion[i] + "]");
		}
	}

	// Función para calcular si un número es primo.
	public static boolean esPrimo(int num) {

		boolean primo = true;

		// Empezamos el contador en 2 porque el número 1 sabemos que es primo.
		for (int i = 2; i < num && primo; i++)

			// Utilizamos el índice para dividir el número por todos los numeros desde 1 hasta llegar al número. 
			// Ejemplo (5) (5/2, 5/3, 5/4 y 5/5)
			 
			if (num % i == 0) {
				primo = false;
			}
		return primo;
	}

	// Función para mostar los números primos.
	public static void mostrarPrimos(int[] arrayFuncion) {

		@SuppressWarnings("unused")
		boolean primos = false;

		System.out.println();

		System.out.println("\nEl resultado de los números primos del Array es:");

		System.out.println();

		for (int i = 0; i < arrayFuncion.length; i++) {

			if (esPrimo(arrayFuncion[i])) {
				primos = true;
				System.out.println("[" + arrayFuncion[i] + "]" + " es primo.");
			}
		}
	}
}
