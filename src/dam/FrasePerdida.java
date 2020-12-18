package dam;

import daw.com.Teclado;

public class FrasePerdida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;

		int ultimoBlanco = 0;

		frase = Teclado.leerString("Introduce una frase:");

		ultimoBlanco = frase.length();

		while (ultimoBlanco != -1) {
			frase = frase.substring(0, ultimoBlanco);
			System.out.println();
			System.out.println(frase);
			ultimoBlanco = buscarUltimoBlanco(frase);
		}

	}

	private static int buscarUltimoBlanco(String frase) {
		// TODO Auto-generated method stub

		int ultimo = -1;

		ultimo = frase.lastIndexOf(" ");

		return ultimo;
	}

}
