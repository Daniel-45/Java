package dam;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;

		int intentos = 10;

		int aleatorio = (int) ((Math.random() * 100) + 1);

		Scanner sc = new Scanner(System.in);

		System.out.println("Adivina el número secreto");

		do {
			intentos--;
			System.out.println("\nIntroduce un número:");
			numero = sc.nextInt();

			if (numero == aleatorio) {
				System.out.println("\nHas acertado!!");
				break;
			}

			if (intentos == 0) {
				System.out.println("\nHas perdido!! El número era " + aleatorio);
				break;
			}

			if (aleatorio < numero) {
				System.out.println("\nEl número es mas bajo, te quedan " + intentos + " intentos");
			} else if (aleatorio > numero) {
				System.out.println("\nEl número es mas alto, te quedan " + intentos + " intentos");
			}

		} while (numero != aleatorio);

		sc.close();
	}

}
