package dam;

import daw.com.Teclado;

/*
 * Pedir al usuario dos números. 
 * Comprobar cual de los dos números es el menor y después de saber cual es el menor de los dos números,
 * ir dividiendo los dos números por todos los numeros comprendidos entre (1) y el número menor.
 * Si el resto de la división de alguno de estos números entre los dos números pedidos es cero (0) 
 * entonces es un número divisor comun de los dos números pedidos.
 * Una vez que termina el bucle y termina de evaluar todas las divisiones 
 * de los dos números pedidos entre (1) y el número menor de los dos numeros
 * pedidos el mayor número que sea divisor de los dos números pedidos es el maximo comun divisor.
 */

public class MaximoComunDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada
		int numero1, numero2, menor;

		// Salida
		int mcd = 0;

		numero1 = Teclado.leerInt("Introduce el primer número:");

		numero2 = Teclado.leerInt("\nIntroduce el segundo número:");

		// Identificar el menor de los dos números
		if (numero1 > numero2) {
			menor = numero2;
		} else {
			menor = numero1;
		}

		// Calcular el mcd (como maximo puede ser el número menor)
		for (int i = 1; i <= menor; i++) {
			if (numero1 % i == 0 && numero2 % i == 0) {
				mcd = i;
			}
		}

		// Mostrar resultado
		System.out.println("\nEl máximo comun divisor de " + numero1 + " y " + numero2 + " es " + mcd);
	}

}
