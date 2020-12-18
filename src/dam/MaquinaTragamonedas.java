package dam;

import daw.com.Teclado;

public class MaquinaTragamonedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String respuesta = "";

		do {
			int Apuesta = Teclado.leerInt("¿Qué cantidad quieres apostar?");

			String figura1 = figurasJugada();

			String figura2 = figurasJugada();

			String figura3 = figurasJugada();

			System.out.println(figura1);

			System.out.println(figura2);

			System.out.println(figura3);

			System.out.println();

			int jugada = calcularJugada(figura1, figura2, figura3);

			int premio = premioJugada(Apuesta, jugada);

			if (premio > 0) {
				System.out.println(premio);
			}

			respuesta = Teclado.leerString("\n¿Quieres apostar otra vez? S/N:");

			System.out.println();

		} while (respuesta.equalsIgnoreCase("S"));

		if (respuesta.equalsIgnoreCase("N"))
			System.out.println("Fin del programa!!");
	}

	private static String figurasJugada() {
		// TODO Auto-generated method stub

		int numero;

		String figura = "";

		numero = (int) (Math.random() * 5 + 1);

		switch (numero) {
		case 1:
			figura = "\nDiamante ";
			break;
		case 2:
			figura = "\nLimon ";
			break;
		case 3:
			figura = "\nHerradura ";
			break;
		case 4:
			figura = "\nCorazón ";
			break;
		case 5:
			figura = "\nCampana ";
			break;
		}
		return figura;
	}

	private static int calcularJugada(String figura1, String figura2, String figura3) {
		// TODO Auto-generated method stub

		int resultado;

		if (figura1.equals(figura2) && figura1.equals(figura3) && figura2.equals(figura3)) {
			resultado = 10;
			System.out.println("Has ganado!!");
		}

		// Calcula si dos de las figuras son iguales
		if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
			resultado = 1;
			System.out.println("Has recuperado tu apuesta");
		} else {
			resultado = 0;
			System.out.println("Has perdido");
		}
		return resultado;
	}

	private static int premioJugada(int apuesta, int jugada) {
		// TODO Auto-generated method stub
		int premio;

		premio = apuesta * jugada;

		return premio;
	}

}
