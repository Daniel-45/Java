package dam;

import java.util.Scanner;

public class LoteriasApuestas {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int combinacionBonoloto[] = new int[6];

		int combinacionPrimitiva[] = new int[6];

		// Arrays para guardar las combinaciones generadas (numeros y estrellas) de la loteria euromillones
		int combinacionEuromillones[] = new int[5];

		int combinacionEstrellas[] = new int[2];

		int numeroAleatorio;

		int reintegro = 0;

		// Variable para seleccionar la opcion del menu de opciones
		int opcion;

		/*
		 * Variable para comprobar si alguno de los números generados esta duplicado y si es asi, 
		 * poner a false para volver a generar el número hasta que no este repetido en la combinación generada
		 */

		boolean valido = true;

		boolean salir = false;

		while (salir != true) {
			mostrarMenu();
			System.out.println();
			System.out.print("Selecciona una opción: ");

			do {
				opcion = entrada.nextInt();

				switch (opcion) {
				case 1:
					generarDecimoOnce();
					break;
				case 2:
					generarDecimoLoteria();
					break;
				case 3:
					generarCombinacionBonoloto(combinacionBonoloto);
					break;
				case 4:
					generarCombinacionPrimitiva(combinacionPrimitiva);
					break;
				case 5:
					generarCombinacionEuromillones(combinacionEuromillones, combinacionEstrellas);
					break;
				case 6:
					salir = true;
					System.out.println();
					System.out.println("Fin del programa!!");
					break;
				default:
					System.out.println("ERROR!! selecciona una opción (1-4):");
					break;
				}
			} while (opcion < 1 || opcion > 6);
		}

	}

	// Funcion para mostrar menu de opciones
	@SuppressWarnings({ "unused", "resource" })
	public static void mostrarMenu() {

		Scanner entrada = new Scanner(System.in);

		int opcion;

		System.out.println();
		System.out.println("+-----------------------+");
		System.out.println("|  LOTERIAS Y APUESTAS  |");
		System.out.println("+-----------------------+");
		System.out.println("+-----------------------+");
		System.out.println("|1.LOTERIA ONCE         |");
		System.out.println("|2.LOTERIA NACIONAL     |");
		System.out.println("|3.LOTERIA BONOLOTO     |");
		System.out.println("|4.LOTERIA PRIMITIVA    |");
		System.out.println("|5.LOTERIA EUROMILLONES |");
		System.out.println("|6.SALIR DE APLICACION  |");
		System.out.println("+-----------------------+");
	}

	// Función para generar una combinacion (loteria primitiva) aleatoria de numeros
	public static void generarCombinacionPrimitiva(int combinacionFuncion[]) {

		int numeroAleatorio;

		int reintegro = 0;

		boolean valido = true;

		/*
		 * Llena cada una de las posiciones (6) del Array con un numero aleatorio
		 * Al terminar el bucle se llena el Array con una combinación de 6 números aleatorios entre (1-49) sin que ninguno este repetido
		 */

		for (int i = 0; i < combinacionFuncion.length; i++) {

			do {

				valido = true;

				// Genera un número aleatorio entre (1-49).
				numeroAleatorio = (int) (Math.random() * (49 + 1));

				/*
				 * Comprobar si el número generado en la posición correspondiente del array esta repetido con alguno generado anteriormente 
				 */
				if (comprobarNumero(combinacionFuncion, numeroAleatorio)) {
					valido = false;
				}

			} while (!valido);

			combinacionFuncion[i] = numeroAleatorio;
		}

		System.out.print("\nCombinación Lotería Primitiva: ");
		for (int i = 0; i < combinacionFuncion.length; i++) {
			// Muestro la combinación generada.

			System.out.print("[" + combinacionFuncion[i] + "]");
		}

		// Generar un número aleatorio entre (1-10) para el número correspondiente al
		// reintegro

		reintegro = (int) (Math.random() * (9 + 1));

		System.out.println();
		System.out.println("\nReintegro:" + "[" + reintegro + "]");
	}

	// Funcion para generar una combinación (bonoloto) aleatoria de numeros.
	public static void generarCombinacionBonoloto(int combinacionFuncion[]) {

		int numeroAleatorio;

		int complementario;

		int reintegro = 0;

		boolean valido = true;

		for (int i = 0; i < combinacionFuncion.length; i++) {

			do {

				valido = true;

				numeroAleatorio = (int) (Math.random() * (49 + 1));

				if (comprobarNumero(combinacionFuncion, numeroAleatorio)) {
					valido = false;
				}
			} while (!valido);

			combinacionFuncion[i] = numeroAleatorio;
		}

		System.out.print("\nCombinacción Bonoloto: ");

		for (int i = 0; i < combinacionFuncion.length; i++) {
			System.out.print("[" + combinacionFuncion[i] + "]");
		}

		complementario = (int) (Math.random() * (49 + 1));

		System.out.println();
		System.out.println("\nComplementario:" + "[" + complementario + "]");

		reintegro = (int) (Math.random() * (9 + 1));

		System.out.println("\nReintegro:" + "[" + reintegro + "]");
	}

	// Funcion para generar una combinacion (euromillones) aleatoria de numeros.
	public static void generarCombinacionEuromillones(int combinacionFuncionNumeros[],
			int combinacionFuncionEstrellas[]) {

		int numeroAleatorio;

		boolean valido;

		for (int i = 0; i < combinacionFuncionNumeros.length; i++) {
			do {

				valido = true;

				numeroAleatorio = (int) (Math.random() * 50 + 1);

				if (comprobarNumero(combinacionFuncionNumeros, numeroAleatorio)) {
					valido = false;
				}

			} while (!valido);

			// Lleno el array de los numeros con los numeros aleatorios generados.
			combinacionFuncionNumeros[i] = numeroAleatorio;
		}

		System.out.print("\nCombinación Euromillones: ");

		for (int i = 0; i < combinacionFuncionNumeros.length; i++) {

			System.out.print("[" + combinacionFuncionNumeros[i] + "]");
		}

		numeroAleatorio = 0;

		// Bucle (for) para recorrer el array de los numeros estrella.
		for (int i = 0; i < combinacionFuncionEstrellas.length; i++) {
			do {
				
				valido = true;

				numeroAleatorio = (int) (Math.random() * 12 + 1);

				if (comprobarNumero(combinacionFuncionEstrellas, numeroAleatorio)) {
					valido = false;
				}

			} while (!valido);

			// Lleno el array de los numeros estrella con los numeros aleatorios generados.
			combinacionFuncionEstrellas[i] = numeroAleatorio;
		}
		
		System.out.println();

		System.out.print("\nNúmeros estrellas: ");

		for (int i = 0; i < combinacionFuncionEstrellas.length; i++) {
			System.out.print("[" + combinacionFuncionEstrellas[i] + "]");
		}
		System.out.println();
	}

	// Función para generar el número del decimo de loteria nacional.
	public static void generarDecimoLoteria() {

		int numeroAleatorio;

		numeroAleatorio = (int) (Math.random() * 99999 + 1);

		System.out.println("\nDécimo de Loteria Nacional: " + "[" + numeroAleatorio + "]");
	}

	// Función para generar el número del décimo de loteria nacional.
	public static void generarDecimoOnce() {

		int numeroAleatorio;

		numeroAleatorio = (int) (Math.random() * 99999 + 1);
		
		System.out.println();

		System.out.println("Décimo cupón de la ONCE: " + "[" + numeroAleatorio + "]");

		int serie;

		serie = (int) (Math.random() * 150 + 1);
		
		System.out.println();

		System.out.println("Serie: " + "[" + serie + "]");
	}

	// Función para comprobrar si el numero esta en la combinación generada.
	public static boolean comprobarNumero(int combinacionFuncion[], int numeroComprobar) {

		// Inicializo en (false) dando por supuesto que el número no esta repetido.
		boolean esta = false;

		for (int i = 0; i < combinacionFuncion.length; i++) {
			if (combinacionFuncion[i] == numeroComprobar)

				esta = true;
		}
		return esta;
	}
}
