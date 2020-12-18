package dam;

import java.util.*;

public class ArrayLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un array de caracteres que contenga de la 'A' a la 'Z' (solo las mayusculas). 
		 * Después, ve pidiendo posiciones del array por teclado y, si la posicion es correcta, añadir a una cadena que se mostrara al final. 
		 * Se dejará de insertar cuando se introduzca un -1.
		 * 
		 * Ejemplo, si escribo los siguientes números:
		 * 0 -> añadir la 'A' 
		 * 5 -> añadir la 'F' 
		 * 25 -> añadir la 'Z' 
		 * 50 -> Error, inserte otro numero 
		 * -1 -> fin
		 * 
		 * Cadena resultante: AFZ
		 */

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int num;
		int numeroLetras = 26;
		char letra = 'A';
		String cadenaLetras = "";

		char letras[] = new char[numeroLetras];

		// Comprobamos que de un char se puede obtener su código numerico (ASCII).
		int prueba = 0;
		prueba = (int) 'A';
		System.out.println("El código ASCII de la letra 'A' es: " + prueba);

		// Muestra la cantidad de letras
		System.out.println("\nLa cantidad de letras del abecedario es: " + numeroLetras + " letras.");

		System.out.println();

		// Mostrar las letras del abecedario.
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a + " ");
		}

		System.out.println();

		for (int i = 0; i <= numeroLetras - 1; i++) {
			letras[i] = letra;
			letra++;
		}

		// El usuario introduce el índice del array y se muestra por pantalla el valor de la letra que hay en ese índice.
		do {
			System.out.print("\nIntroduce el índice del array: ");
			num = entrada.nextInt();

			// Validar opción de introducir índice del array.
			if (num > numeroLetras - 1) {
				System.out.println("\nIntroduce un número (0-25)");
				continue;
			}

			if (num >= 0) {
				char letraArray = letras[num];

				cadenaLetras += letraArray;
			}
		} while (num >= 0);

		System.out.println("\nLa cadena correspondiente a los índices introducidos es: " + "'" + cadenaLetras + "'");
		System.out.println("\nFin del programa!!");
	}

}
