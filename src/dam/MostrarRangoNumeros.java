package dam;

import daw.com.Teclado;

public class MostrarRangoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, contador;

		// Se inicializa en uno para mostrar el rango de números entre 0 y el número introducido
		contador = 1;

		// Se introduce el número para el final del rango que quiero mostrar
		numero = Teclado.leerInt("Introduce un número:");

		while (contador < numero) {
			// Muestra por pantalla el rango de números entre 0 y el número introducido
			System.out.println(contador);
			contador++;
		}
	}

}
