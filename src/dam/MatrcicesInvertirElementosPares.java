package dam;

import java.util.*;

public class MatrcicesInvertirElementosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dado el vector T de tamaño N. Si el tamaño es par invertir los elementos de la mitad de los elementos
		 */

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int a, aux, b;

		int matriz[];

		matriz = new int[20];

		System.out.print("Introduce el tamaño de la matriz: ");

		// A la variable (a) se le agrega la cantidad de valores de la matriz.
		a = entrada.nextInt();
		// Bucle (for) para llenar la matriz hasta el limite asignado.
		for (int i = 0; i < a; i++) {
			System.out.print("\nPosicion[" + (i + 1) + "] = ");
			matriz[i] = entrada.nextInt();
		}

		// Intercambiar valores
		// Muestra la matriz original sin intercambiar valores.
		System.out.println("\nMatriz original sin valores intercambiados\n");
		// Mostrar con el bucle (for)
		for (int z = 0; z < a; z++) {
			System.out.print(matriz[z] + ",  ");
		}
		/*
		 * A la variable (b) se le da el valor de la variable (a). (a) es el tama�o que
		 * asignamos a la matriz al principio.
		 */
		b = a;

		/*
		 * Intercambiar valores. 
		 * A la variable (aux) se le asigna el valor de la primera posición (0) de la matriz[i]
		 * A esta primera posición se le asigna el valor de la ultima posicion de la matriz[b-1] para intercambiar los valores. 
		 * Por último la ultima posición de la matriz[b-1] va a ser igual a la variable (aux) que guarda la primera posición de la matriz[i].
		 */
		for (int i = 0; i <= b / 2; i++) {
			aux = matriz[i];
			matriz[i] = matriz[b - 1];
			matriz[b - 1] = aux;
			// Para cambiar el valor de la posición (una posición menos)
			b--;
		}

		// Mostrar la matriz con los valores intercambiados.
		System.out.println();
		System.out.println("\nMatriz final con sus valores intercambiados\n");
		for (int i = 0; i < a; i++) {
			System.out.print(matriz[i] + ",  ");
		}
	}

}
