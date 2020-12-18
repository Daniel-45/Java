package dam;

import daw.com.Teclado;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;

		numero = Teclado.leerInt("Introduce las tablas de multiplicar a mostrar:");

		System.out.println();
		
		for (int i = 1; i <= numero; i++) {
			
			System.out.println("Tabla del " + i + "\n");

			for (int z = 1; z <= 10; z++) {
				System.out.println(i + " x " + z + " = " + i * z);
			}
			
			System.out.println();
		}
	}

}
