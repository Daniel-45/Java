package dam;

import daw.com.Teclado;

/*
 * Calcula los dias de vacaciones dependiendo de la categoria profesional. 
 * Días de vacaciones (2 días por mes trabajado) Categoría profesional (A) 
 * se le suman 3 dias a los que le corresponden. 
 * Categoría profesional (B) se le suman 2 días a los que le corresponden.
 */

public class CalculaDiasVacaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroMeses = 0;

		int diasVacaciones = 0;

		String categoriaProfesional;

		numeroMeses = Teclado.leerInt("Introduce número de meses trabajados:");

		categoriaProfesional = Teclado.leerString("\nIntroduce la categoria profesional (A-B):");

		do {
			if (!categoriaProfesional.equalsIgnoreCase("A") && !categoriaProfesional.equalsIgnoreCase("B")) {
				System.out.println("\nLa categoría profesional solo puede ser 'A' o 'B'");
				categoriaProfesional = Teclado.leerString("\nIntroduce la categoria profesional (A-B):");
			}
		} while (!categoriaProfesional.equalsIgnoreCase("A") && !categoriaProfesional.equalsIgnoreCase("B"));

		diasVacaciones = numeroMeses * 2;

		if (categoriaProfesional.equalsIgnoreCase("A")) {
			diasVacaciones = diasVacaciones + 3;
		} else if (categoriaProfesional.equalsIgnoreCase("B")) {
			diasVacaciones = diasVacaciones + 2;
		}

		System.out.println("\nLos días de vacaciones son: " + diasVacaciones);

	}

}
