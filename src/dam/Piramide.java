package dam;

import daw.com.Teclado;

public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int basePiramide = Teclado.leerInt("Introduce el número para base de la pirámide:");

		int numeroFilas = basePiramide / 2 + 1;

		System.out.println();

		for (int fila = 1; fila <= numeroFilas; fila++) {
			for (int numeroBlancos = 0; numeroBlancos <= basePiramide - fila; numeroBlancos++) {
				System.out.print(" ");
			}
			for (int numeroAsteriscos = 1; numeroAsteriscos <= fila * 2 - 1; numeroAsteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
