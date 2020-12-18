package dam;

import daw.com.Teclado;

public class ArrayNombresOrdenCambiado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		String array[];

		num = Teclado.leerInt("¿Cuántos nombres quieres introducir?");

		array = new String[num];

		for (int i = 0; i < num; i++) {
			array[i] = Teclado.leerString("\nIntroduce el nombre:");
		}

		System.out.println();

		for (int i = num - 1; i >= 0; i--) {
			System.out.println(array[i]);
			System.out.println();
		}
	}

}
