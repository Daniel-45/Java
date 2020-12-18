package dam;

import daw.com.Teclado;

public class NumerosPrimos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Un numero primo es un número natural mayor que 1 tiene unicamente dos divisores distintos: el mismo y el 1

		// Entrada
		int numero;

		boolean primos = false;

		// Salida
		int suma = 0;

		int cantidad = 0;

		float media = 0;

		numero = Teclado.leerInt("Introduce un número:");

		// Mostrar números primos
		for (int i = 1; i < numero; i++) {
			if (esPrimo(i)) {
				primos = true;
				System.out.println("\n" + i + " es primo.");
			}
		}

		// Calcular cuantos números primos hay.
		for (int i = 1; i < numero; i++) {
			if (esPrimo(i) == true) {
				cantidad++;
			}
		}
		System.out.println("\nLa cantidad de números primos entre 1 y " + numero + " es: " + cantidad);

		// Calcular la suma de todos los números primos.
		for (int i = 1; i < numero; i++) {
			if (esPrimo(i) == true) {
				suma += i;
			}
		}
		System.out.println("\nLa suma de los números primos entre 1 y " + numero + " es: " + suma);

		// Calcular la media de los números primos.
		for (int i = 1; i < numero; i++) {
			if (esPrimo(i) == true) {
				cantidad++;
				suma += i;
				// Convertir a real la operacion de dos números enteros.
				media = (float) suma / cantidad;
			}
		}
		System.out.println("\nLa media de los números primos entre 1 y " + numero + " es: " + media);
	}

	private static boolean esPrimo(int numero) {
		// TODO Auto-generated method stub

		boolean primo = true;

		// Empezamos el contador en 2 porque el numero 1 sabemos que es primo.
		for (int i = 2; i < numero && primo; i++)

			if (numero % i == 0) {
				primo = false;
			}

		return primo;
	}

}
