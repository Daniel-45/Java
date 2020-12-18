package dam;

import java.util.ArrayList;

import daw.com.Teclado;

public class ContarPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> palabras = new ArrayList<>();

		leerPalabras(palabras);

		System.out.println("\nPalabra de mayor longitud : " + palabraMasLarga(palabras));

		System.out.println("\nPalabra de menor longitud : " + palabraMasCorta(palabras));

	}

	private static void leerPalabras(ArrayList<String> palabras) {
		// TODO Auto-generated method stub

		String palabra;

		boolean masPalabras;

		System.out.println("Introduce palabras");

		System.out.println("\nIntroduce 'Fin' para terminar");

		do {
			masPalabras = true;
			palabra = Teclado.leerString("\nIntroduce una palabra:");
			if (palabra.equalsIgnoreCase("Fin")) {
				masPalabras = false;
			} else {
				palabras.add(palabra);
			}
		} while (masPalabras);
	}

	private static String palabraMasLarga(ArrayList<String> palabras) {
		// TODO Auto-generated method stub

		String mayor = palabras.get(0);

		for (int i = 1; i < palabras.size(); i++) {
			if (palabras.get(i).length() > mayor.length()) {
				mayor = palabras.get(i);
			}
		}
		return mayor;
	}

	private static String palabraMasCorta(ArrayList<String> palabras) {
		// TODO Auto-generated method stub

		String menor = palabras.get(0);

		for (int i = 1; i < palabras.size(); i++) {
			if (palabras.get(i).length() < menor.length()) {
				menor = palabras.get(i);
			}
		}
		return menor;
	}

}
