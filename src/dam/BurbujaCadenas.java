package dam;

import java.text.Collator;
import java.util.*;

@SuppressWarnings("unused")
public class BurbujaCadenas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ordena alfabeticamente las cadenas.
		int numeroElementos = 3;

		String arrayString[] = new String[numeroElementos];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < arrayString.length; i++) {
			System.out.print("Introduce la palabra " + (i + 1) + ": ");
			arrayString[i] = entrada.nextLine();
		}

		System.out.println("\nEl resultado de llenar el array es:\n");
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print("[" + arrayString[i] + "]");
		}
		
		System.out.println();

		System.out.println("\nLas palabras introducidas son:");
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println("\nPalabra " + (i + 1) + ": " + arrayString[i]);
		}

		for (int i = 0; i < arrayString.length; i++) {
			for (int j = 0; j < arrayString.length - 1 - i; j++) {
				if (arrayString[j].compareToIgnoreCase(arrayString[j + 1]) > 0) {
					String temporal = arrayString[j];
					arrayString[j] = arrayString[j + 1];
					arrayString[j + 1] = temporal;
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print("[" + arrayString[i] + "]");
		}
	}

}
