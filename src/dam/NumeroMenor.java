package dam;

import daw.com.Teclado;

public class NumeroMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada.
		int numeros[] = new int[6];

		// Salida.
		int numeroMenor;

		// El usuario rellena el array.
		System.out.println("Introduce los valores del array");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Teclado.leerInt("\nIntroduce un número:");
		}

		numeroMenor = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < numeroMenor) {
				numeroMenor = numeros[i];
			}
		}

		System.out.println("\nEl número menor es: " + numeroMenor);
	}
}

