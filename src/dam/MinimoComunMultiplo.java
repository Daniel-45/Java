package dam;

import daw.com.Teclado;

/*
 * Pedir dos números al usuario, comprobar si el mayor de los dos números es multiplo del menor. 
 * Si es asi, ese número es el mínimo comun multiplo. 
 * Sino ir sacando los multiplos del número mayor y comprobar si son
 * multiplos del número menor hasta que encuentre el mínimo comun multiplo de los dos números. 
 * Una vez encontrado mostrar el mínimo comun multiplo.
 */

public class MinimoComunMultiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada
		int numero1, numero2, contador = 1, menor = 0, mayor = 0;

		// Salida
		int mcm = 0;

		numero1 = Teclado.leerInt("Introduce el primer número:");

		numero2 = Teclado.leerInt("\nIntroduce el segundo número:");

		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		}

		if (numero2 > numero1) {
			mayor = numero2;
			menor = numero1;

		}

		// Precondicion
		mcm = (mayor * contador) / menor;

		// Calcular el mcm (como mínimo es el número mayor)
		while (mayor * contador % menor != 0) {
			contador++;
		}

		// Post-condicion
		mcm = mayor * contador;

		// Mostrar el resultado
		System.out.println("\nEl mínimo comun múltiplo de " + numero1 + " y " + numero2 + " es " + mcm);
	}

}
