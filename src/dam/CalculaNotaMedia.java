package dam;

import daw.com.Teclado;

public class CalculaNotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, notas, contador, suma, media;

		String resultado;

		suma = 0;

		media = 0;

		contador = 0;

		num = Teclado.leerInt("Introduce la cantidad de notas:");

		while (contador < num) {
			do {
				notas = Teclado.leerInt("\nIntroduce la nota (1-10)");
			} while (notas < 1 || notas > 10);
			suma += notas;
			contador++;
		}

		media = (suma / contador);

		switch (media) {
		case 10:
			resultado = "Matrícula de Honor";
			break;
		case 9:
			resultado = "Sobresaliente";
			break;
		case 8:
		case 7:
			resultado = "Notable";
			break;
		case 6:
			resultado = "Bien";
			break;
		case 5:
			resultado = "Suficiente";
			break;
		default:
			resultado = "Insuficiente";

		}

		System.out.println("\nLa nota media final es: " + media + " - " + resultado);

	}

}
