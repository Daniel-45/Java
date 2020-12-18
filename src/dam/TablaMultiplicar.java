package dam;

import daw.com.Teclado;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;

		numero = Teclado.leerInt("Introduce un número entero: ");

		System.out.println("\nTabla del " + numero);
		System.out.println("-----------");

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}

}
