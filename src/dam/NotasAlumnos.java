package dam;

import java.util.*;

public class NotasAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int notas[];
		int numeroNotas, media;
		boolean esta = false;

		// Pedir el numero de notas a introducir.
		numeroNotas = leerPositivo();

		notas = new int[numeroNotas];

		// LLamo a la funcion 'leerNotas' para introducir las notas del alumno.
		leerNotas(notas);

		// LLamo a la funcion que calcula la media de las notas introducidas.
		media = calcularMedia(notas);

		System.out.println("La media de las notas introducidas es: " + media);

		/*
		 * Llamo a la funcion 'comprobarMedia' que muestra si la media esta entre las
		 * notas introducidas.
		 */
		esta = comprobarMedia(notas, media);

		if (esta == true) {
			System.out.println("La media esta entre las notas introducidas");
		} else {
			System.out.println("La media no esta entre las notas introducidas");
		}
	}

	// Funciones

	// Funcion para saber la cantidad de notas a introducir.
	public static int leerPositivo() {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int numero;

		do {
			System.out.println("Introduce la cantidad de notas:");
			numero = entrada.nextInt();
		} while (numero < 0);

		// Devuelve el valor (cantidad de notas a introducir).
		return numero;
	}

	// Funcion para introducir las notas del alumno.
	public static void leerNotas(int notas[]) {

		int nota;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce las notas:");

		for (int i = 0; i < notas.length; i++) {
			do {
				nota = entrada.nextInt();
				// Mientras el numero introducido sea menor que 0 o mayor que 10 sigue pidiendo
				// una nota.
				if (nota < 0 || nota > 10) {
					System.out.println("Introduce la nota (0-10)");
				}
			} while (nota < 0 || nota > 10);

			// En el indice (i) se guarda el valor de la nota introducida.
			notas[i] = nota;
		}
	}

	// Funcion para calcular la media.
	public static int calcularMedia(int notas[]) {

		/*
		 * Inilicializamos media en cero porque al principio no vale nada, suma
		 * (acumulador donde guardamos el valor de las notas) en cero porque hasta que
		 * no se introduce una nota tambi�n no tiene valor.
		 */
		int media = 0, suma = 0;

		for (int i = 0; i < notas.length; i++) {
			// Suma es igual a la suma de todos los valores del array notas[]
			suma += notas[i];
		}

		/*
		 * Calculamos el valor de la media fuera del bucle for. Media es igual a la suma
		 * (la suma de los valores de todas las notas) divido entre la longitud del
		 * array notas[] (cantidad de notas).
		 */
		media = suma / notas.length;

		// Devolvemos el valor de la media calculada.
		return media;
	}

	// Funcion para comprobar si la media esta entre las notas introducidas.
	public static boolean comprobarMedia(int notas[], int media) {

		boolean esta = false;

		for (int i = 0; i < notas.length && !esta; i++) {
			/*
			 * Si el valor de media esta dentro del array notas[] cambiamos el valor de la
			 * variable (esta) de tipo boolean a verdadero y salimos a mostrar el resultado.
			 */
			if (media == notas[i]) {
				esta = true;
			}
		}
		// Devolvemos el valor de la variable (esta)
		return esta;
	}
}
