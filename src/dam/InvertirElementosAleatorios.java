package dam;

import daw.com.Teclado;

public class InvertirElementosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dado el array T de tamaño N. Invertir los elementos.

		System.out.print("Introduce el tamaño del array: ");
		int longitud = Teclado.leerInt();

		int array[] = new int[longitud];

		System.out.println("\nEl resultado de llenar el array aleatorio es:\n");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * longitud);
			System.out.print("[" + array[i] + "]");

		}

		arrayInvertido(array);
	}

	public static void arrayInvertido(int arrayFuncion[]) {

		int valor = arrayFuncion.length;

		System.out.println();
		System.out.println("\nEl resultado de invertir los elementos es:\n");
		for (int i = 0; i < arrayFuncion.length; i++) {
			arrayFuncion[i] = valor--;
			System.out.print("[" + arrayFuncion[i] + "]");
		}
	}

}
