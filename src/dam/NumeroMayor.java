package dam;

import daw.com.Teclado;

public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada.
		int numeros[] = new int[6];

		// Salida.
		int numeroMayor;

		// El usuario rellena el array.
		System.out.println("Introduce los valores del array");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Teclado.leerInt("\nIntroduce un número:");
		}

		numeroMayor = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
		}

		System.out.println("\nEl número mayor es: " + numeroMayor);
	}

}
