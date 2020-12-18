package dam;

import daw.com.Teclado;

public class Vota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, contador, numeroVotantes, acumulador;

		float resultado;

		String nombre;

		contador = 0; // Número de votantes

		acumulador = 0; // Personas que pueden votar

		numeroVotantes = Teclado.leerInt("¿Cuántas personas van a votar?");

		while (contador < numeroVotantes) {
			nombre = Teclado.leerString("\nIntroduce tu nombre:");

			edad = Teclado.leerInt("\nIntroduce tu edad:");

			if (edad >= 18) {
				System.out.println("\n" + nombre + " puede Votar");
				acumulador++;
			} else {
				System.out.println("\n" + nombre + " no puede votar");
			}
			contador++; // Se incrementa en uno el contador (número de votantes).
		}

		resultado = (acumulador * 100 / numeroVotantes);

		System.out.println("\nEl tanto por ciento de personas que pueden votar es: " + resultado + "%");
	}

}
