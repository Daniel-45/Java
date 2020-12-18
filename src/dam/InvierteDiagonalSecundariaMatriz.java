package dam;

import java.util.*;

@SuppressWarnings("unused")
public class InvierteDiagonalSecundariaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dada una matriz cuadrada invertir su diagonal secundaria.
		int filas = 3;
		int columnas = 3;
		int contador = 1;
		int aux;

		int matrizCuadrada[][] = new int[filas][columnas];

		// Para guardar los valores de la diagonal principal y poder invertir los valores.
		int matrizInvertida[] = new int[filas];

		// Matriz ordenada.
		System.out.println("El resultado de la matriz es:\n");
		for (filas = 0; filas < matrizCuadrada.length; filas++) {
			for (columnas = 0; columnas < matrizCuadrada[filas].length; columnas++) {
				matrizCuadrada[filas][columnas] = contador++;
				System.out.print("[" + matrizCuadrada[filas][columnas] + "]");
			}
			System.out.println();
		}

		// Valor de cada posicion de la matriz.
		System.out.println("\nEl resultado del valor que contiene cada posicion es:\n");
		for (filas = 0, contador = 1; filas < matrizCuadrada.length; filas++) {
			for (columnas = 0; columnas < matrizCuadrada[filas].length; columnas++) {
				System.out.print("Fila: " + filas + " Columna: " + columnas);
				matrizCuadrada[filas][columnas] = contador++;
				// Muestra el valor que hay en cada posicion (indice) de la matrizCuadrada.
				System.out.println(" Posicion [" + filas + "][" + columnas + "]: " + matrizCuadrada[filas][columnas]);
			}
			System.out.println();
		}

		// Matriz ordenada.
		System.out.println("El resultado de la matriz es:\n");
		for (filas = 0, contador = 1; filas < matrizCuadrada.length; filas++) {
			for (columnas = 0; columnas < matrizCuadrada[filas].length; columnas++) {
				matrizCuadrada[filas][columnas] = contador++;
				System.out.print("[" + matrizCuadrada[filas][columnas] + "]");
			}
			System.out.println();
		}

		// Invertir la diagonal secundaria de la matrizCuadrdada[][]
		System.out.println("\nDiagonal secundaria invertida\n");

		for (filas = 0; filas < matrizCuadrada.length; filas++) {

			for (columnas = 0; columnas < matrizCuadrada[filas].length; columnas++) {
				aux = matrizCuadrada[2][0];
				matrizCuadrada[2][0] = matrizCuadrada[0][2];
				matrizCuadrada[0][2] = aux;
				System.out.print("[" + matrizCuadrada[filas][columnas] + "]");
			}
			System.out.println();
		}
	}
}
