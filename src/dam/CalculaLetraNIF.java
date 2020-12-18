package dam;

import daw.com.Teclado;

public class CalculaLetraNIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dni;

		String letra;

		dni = Teclado.leerInt("Introduce solo los números del DNI:");

		letra = calcularLetra(dni);

		System.out.println("\nLa letra es: " + letra);
	}

	private static String calcularLetra(int dni) {
		// TODO Auto-generated method stub

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		String resultado;

		int resto;

		resto = dni % 23;

		resultado = letras.substring(resto, resto + 1);

		return resultado;
	}

}
