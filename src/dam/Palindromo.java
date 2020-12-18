package dam;

import daw.com.Teclado;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra, copia = "";

		palabra = Teclado.leerString("Introduce una palabra:");

		for (int i = palabra.length() - 1; i >= 0; i--) {
			copia += palabra.charAt(i);
		}

		if (palabra.equalsIgnoreCase(copia)) {
			System.out.println("\nEs un palíndromo");
		} else {
			System.out.println("\nNo es un palíndromo");
		}
	}

}
