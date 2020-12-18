package dam;

import daw.com.Teclado;

public class EncuentraPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = Teclado.leerString("Introduce una frase:").split(" ");

		String palabra = Teclado.leerString("\nAhora una palabra:");

		System.out.println();

		boolean encontrada = false;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

			if (array[i].equalsIgnoreCase(palabra)) {
				encontrada = true;
			}
			
		}
		
		if (encontrada) {
			System.out.println("\nLa palabra " + palabra + " está en la frase");
		} else {
			System.out.println("\nLa palabra " + palabra + " no está en la frase");
		}
	}

}
