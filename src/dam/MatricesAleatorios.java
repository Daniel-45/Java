package dam;

import daw.com.Teclado;

public class MatricesAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrizAleatorios[];

		matrizAleatorios = new int[Teclado.leerInt("Introduce el número de elementos (1-100):")];

		for (int i = 0; i < matrizAleatorios.length; i++) {
			matrizAleatorios[i] = (int) Math.round(Math.random() * 100);
		}

		// Leer lo que hay almacenado dentro de la matriz.
		for (int elementos : matrizAleatorios) {
			System.out.print("[" + elementos + "]");
		}
	}

}
