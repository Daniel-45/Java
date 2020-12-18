package dam;

import daw.com.Teclado;

public class MaquinaExpendedora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int precio, monedas, pagado, vuelta, cuantas;

		String producto;

		// Acumulador.
		pagado = 0;

		vuelta = 0;

		do {
			producto = Teclado.leerString("Selecciona un producto [A - B - C]:");
		} while (!producto.equals("A") && !producto.equals("B") && !producto.equals("C"));

		// Asignar precio al producto.
		switch (producto) {
		case "A":
			precio = 27;
			break;
		case "B":
			precio = 34;
			break;
		case "C":
			precio = 39;
		default:
			precio = 0;
		}

		System.out.println("\nEl precio del producto es: " + precio);

		// Leer la cantidad que ha pagado y devolución de cambio
		while (pagado < precio) {
			do {
				monedas = Teclado.leerInt("\nIntroduce monedas [10, 5, 1]");
			} while (monedas != 1 && monedas != 5 && monedas != 10);
			pagado = pagado + monedas;
		}

		System.out.println("\nLa cantidad que ha pagado es: " + pagado);

		vuelta = pagado - precio;

		System.out.println("\nLa cantidad a devolver es: " + vuelta);

		if (vuelta > 10) {
			cuantas = vuelta / 10;
			System.out.println("\n" + cuantas + " monedas de 10");
			vuelta = vuelta % 10;
		}

		if (vuelta > 5) {
			cuantas = vuelta / 5;
			System.out.println("\n" + cuantas + " monedas de 5");
			vuelta = vuelta % 5;
		}

		if (vuelta > 1) {
			System.out.println("\n" + vuelta + " monedas de 1");
		}
	}

}
