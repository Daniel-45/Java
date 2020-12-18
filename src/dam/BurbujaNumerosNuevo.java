package dam;

import java.util.*;

public class BurbujaNumerosNuevo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ordena alfabeticamente los números del array.
		int numeroElementos = 6;

		int array[] = new int[numeroElementos];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce el número " + (i + 1) + ": ");
			array[i] = entrada.nextInt();
		}

		System.out.println("\nLos números introducidos son:");

		for (int i = 0; i < array.length; i++) {
			System.out.println("\nNúmero " + (i + 1) + ": " + array[i]);
		}

		System.out.println("\nEl resultado de llenar el array es:");

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temporal = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temporal;
				}
			}
		}

		System.out.println();

		System.out.println("\nEl resultado de ordenar los numeros del array de menor a mayor es:\n");

		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}
}
