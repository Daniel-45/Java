package dam;

import java.util.*;

@SuppressWarnings("unused")
public class InvierteDiagonalPrincipalMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dada una matriz cuadrada invertir su diagonal

		// Entradas
		int filas = 3;
		int columnas = 3;
		int contador = 1;
		// Variable (aux) para hacer una copia y guardar la dimensión de matrizCuadrada[][].
		int aux;

		// matrizCuadrada
		int matrizCuadrada[][] = new int[filas][columnas];

		// Para guardar los valores de la diagonal principal y poder invertir los valores.
		int matrizInvertida[] = new int[filas];

		// Rellenar la matriz.
		System.out.println("El resultado del valor que contiene cada posicion es:\n");
		for (filas = 0; filas < matrizCuadrada.length; filas++) {
			for (columnas = 0; columnas < matrizCuadrada[filas].length; columnas++) {
				System.out.print("Fila: " + filas + " Colunma: " + columnas);
				matrizCuadrada[filas][columnas] = contador++;
				// Muestra el valor que hay en cada posicion (indice) de la matrizCuadrada.
				System.out.println(" Posicion [" + filas + "][" + columnas + "]: " + matrizCuadrada[filas][columnas]);
			}
			System.out.println();
		}

		// Mostrar matrizCuadrada ordenada.
		System.out.println("Matriz ordenada:\n");

		for (filas = 0; filas < matrizCuadrada.length; filas++) {
			for (columnas = 0; columnas < matrizCuadrada[filas].length; columnas++) {
				System.out.print("[" + matrizCuadrada[filas][columnas] + "]");
			}

			System.out.println();
		}

		// Guardar la diagonal principal en la matrizInvertida[] para luego invertir los valores.
		aux = matrizCuadrada.length;

		System.out.println();
		System.out.println("Diagonal principal invertida:\n");

		for (filas = 0; filas < matrizCuadrada.length; filas++) {
			matrizInvertida[filas] = matrizCuadrada[aux - 1][aux - 1];
			aux--;

			System.out.println("[" + matrizInvertida[filas] + "]");
		}

		// Invertir valores de la diagonal principal.
		for (filas = 0; filas < matrizCuadrada.length; filas++) {
			matrizCuadrada[filas][filas] = matrizInvertida[filas];
		}

		// Mostrar matrizCuadrada con la diagonal principal invertida.
		System.out.println("\nMatriz con diagonal principal invertida:\n");

		for (filas = 0; filas < matrizCuadrada.length; filas++) {
			for (columnas = 0; columnas < matrizCuadrada[filas].length; columnas++) {
				System.out.print("[" + matrizCuadrada[filas][columnas] + "]");
			}
			System.out.println();
		}

	}

}
