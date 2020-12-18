package dam;

import daw.com.Teclado;

public class NumerosAmigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, suma = 0, numero1, numero2;

		/*
		 * Dos números son amigos (a y b) si se cumple que la suma de todos los divisores de “a” menores que el es igual a “b”, 
		 * y a la misma vez se cumple que la suma de todos los divisores menores que “b” es igual a “a”.
		 */

		numero1 = Teclado.leerInt("Introduce el primer número:");

		numero2 = Teclado.leerInt("\nIntroduce segundo número:");

		for (i = 1; i < numero1; i++) { // for para sumar todos los divisores propios de numero1
			if (numero1 % i == 0) {
				suma = suma + i;
			}
		}

		if (suma == numero2) {
			suma = 0;
			// Sumar los divisores propios de numero2
			for (i = 1; i < numero2; i++) { 
				if (numero2 % i == 0) {
					suma = suma + i;
				}
			}

			if (suma == numero1) {
				System.out.println("\nLos números " + numero1 + " y " + numero2 + " son amigos");
			} else {
				System.out.println("\nLos números " + numero1 + " y " + numero2 + " no son amigos");
			}
		} else {
			System.out.println("\nLos números " + numero1 + " y " + numero2 + " no son amigos");
		}
	}

}
