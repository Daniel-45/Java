package dam;

import daw.com.Teclado;

public class SumarNumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, suma;

		numero = Teclado.leerInt("Introduce un número:");

		suma = sumarPrimos(numero);

		System.out.println("\nLa suma de los números primos comprendidos entre 1 y " + numero + " es " + suma);
	}

	private static int sumarPrimos(int numero) {
		// TODO Auto-generated method stub

		int acumulador = 0;

		// Iniciar en 2 porque 1 sabemos que es primo
		for (int i = 2; i < numero; i++) {
			if (esPrimo(i) == true) {
				acumulador += i;
			}
		}

		return acumulador;
	}

	private static boolean esPrimo(int numero) {
		// TODO Auto-generated method stub

		boolean primo = true;

		for (int i = 2; i < numero / 2 && primo == true; i++) {			
			if (numero % i == 0) {				
				primo = false;
			}
		}

		return primo;
	}

}
