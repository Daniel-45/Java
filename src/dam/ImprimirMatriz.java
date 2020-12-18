package dam;

public class ImprimirMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una aplicación que imprima la siguiente matriz: 
		 * 11 12 13 14 15 
		 * 21 22 23 24 25 
		 * 31 32 33 34 35 
		 * 41 42 43 44 45 
		 * 51 52 53 54 55
		 */

		int matriz[][] = new int[5][5];

		int valor = 11;

		System.out.println("El resultado de la matriz es:\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = valor++;

				System.out.print("[" + matriz[i][j] + "]");
			}
			valor = valor + 5;

			// Para hacer un salto de linea y mostrar la siguiente fila.
			System.out.println();
		}
	}

}
