package dam;

import java.util.*;

public class Bingo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		/*
		 * En el bingo se extraen al azar un a una hasta 90 bolas numeradas del 1 al 90.
		 * Puede haber un numero ilimitado de jugadores, cada uno con al menos un carton. 
		 * Cada carton contiene 15 números de los 90 posibles. Conforme se van extrayendo las bolas al azar, 
		 * los jugadores deben tachar los números coincidentes de su cartón. 
		 * Dos tipos de ganadores en cada jugada: 
		 * 1. Gana la persona o personas que antes tachen una fila completa (línea). Se da un premio menor y el juego continua. 
		 * 2. Gana la persona o personas que antes tachen el cartón completo (bingo). Se da un premio mayor y el juego termina.
		 */

		// Variable (nulo) de tipo entero con valor cero (0) para colocar un cero (0) en  cada espacio nulo del cartón.
		int nulo = 0, numeroSorteo = 0;

		// Variable (respuesta) de tipo String para dar una respuesta a la pregunta ¿Quieres seguir jugando? y seguir jugando o acabar el juego.
		String respuesta = " ";

		// Variable (fin) de tipo boolean sirve para determinar cuando salir del juego.
		boolean fin = false;

		// Matriz para guardar los 90 números del panel del bingo.
		int panel[][] = new int[9][10];

		// Variables (filas, columnas) de tipo entero, para la dimensin de la matriz (carton[][]) que simula el cartón de bingo.
		int filas = 3;
		int columnas = 9;

		// Matriz (carton[][]) para guardar la combinación de 15 números aleatorios que simula un cartón de bingo.
		int carton[][] = new int[filas][columnas];

		// Array para guardar las 90 bolas del sorteo.
		int sorteo[] = new int[90];

		// Array números usados en el sorteo.
		int numerosUsados[] = new int[90];

		System.out.println("*********************************************************************");
		System.out.println("*                          APLICACION BINGO                         *");
		System.out.println("*********************************************************************");
		System.out.println();

		while (fin != true) {
			panelBingo(panel);
			int[][] panelOrdenado = cambiar(panel);
			ordenar(carton);
			nulo = espaciosNulos(carton);
			generaCarton(carton);
			int numeroBombo = sorteoBingo(carton, sorteo, numerosUsados);
			mostrarNumerosSorteo(numerosUsados);
			generaCarton(carton);
			System.out.println();

			sorteo = new int[90];
			System.out.println("¿Quieres seguir jugando? (S/N)");

			respuesta = entrada.nextLine();
			if (respuesta.equalsIgnoreCase("N")) {
				// La variable (fin) pasa a ser verdadero y acaba el juego.
				fin = true;
			}
		}
		System.out.println("Fin del programa!!");
	}

	// Funcion para mostrar del panel con todos los números del juego del bingo.
	public static void panelBingo(int panelFuncion[][]) {

		System.out.println("********************************************************************");
		System.out.println("*                  PANEL PARA EL JUEGO DEL BINGO                  *");
		System.out.println("********************************************************************");

		// Llenar la matriz.
		for (int filas = 0, valor = 1; filas < panelFuncion.length; filas++) {
			for (int columnas = 0; columnas < panelFuncion[filas].length; columnas++) {
				panelFuncion[filas][columnas] = valor++;
			}

		}

	}

	/*
	 * Función para intercambiar filas por columnas. 
	 * A partir del array que recibe como parámetro genera otro array cambiado.
	 */
	public static int[][] cambiar(int panelFuncion[][]) {
		int[][] resultado = new int[panelFuncion[0].length][panelFuncion.length];

		int filas, columnas;

		for (columnas = 0; columnas < panelFuncion[0].length; columnas++) {
			for (filas = 0; filas < panelFuncion.length; filas++) {
				resultado[columnas][filas] = panelFuncion[filas][columnas];
				System.out.print("[" + panelFuncion[filas][columnas] + "]" + "\t");
			}
			// Para hacer un salto de linea y muestre la siguiente fila.
			System.out.println();
		}
		System.out.println();
		System.out.println("********************************************************************");

		return resultado;
	}

	// Función para ordenar el carton.
	public static void ordenar(int carton[][]) {
		Random numero = new Random();
		// Variable para simular los espacios nulos (coronas) del carton.
		int nulo = 0;
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {
				if (i == 0) {
					if (j == 0) {
						carton[i][j] = numero.nextInt(7) + (10 * j) + 1;
					} else {
						carton[i][j] = numero.nextInt(8) + (10 * j);
					}
				} else {
					if (i == 1) {
						nulo = 0;
					} else if (i == 2) {
						nulo = 1;
					}
					carton[i][j] = numero.nextInt(9 + nulo) + (10 * j);
					do {
						carton[i][j] = numero.nextInt(9 + nulo) + (10 * j);
					} while (carton[i][j] <= carton[i - 1][j]);
				}
			}
		}
		carton[2][8]++;
	}

	// Función para generar los espacios nulos (coronas) del cartón.
	public static int espaciosNulos(int cartonFuncion[][]) {
		// Posición del espacio nulo.
		int nulo = 0;
		for (int i = 0; i < cartonFuncion.length; i++) {
			for (int j = 0; j < cartonFuncion[i].length; j++) {
				cartonFuncion[0][0] = nulo;
				cartonFuncion[1][0] = nulo;
				cartonFuncion[2][1] = nulo;
				cartonFuncion[0][2] = nulo;
				cartonFuncion[1][3] = nulo;
				cartonFuncion[2][3] = nulo;
				cartonFuncion[2][4] = nulo;
				cartonFuncion[0][5] = nulo;
				cartonFuncion[1][6] = nulo;
				cartonFuncion[2][6] = nulo;
				cartonFuncion[0][7] = nulo;
				cartonFuncion[1][8] = nulo;
			}
		}
		return nulo;
	}

	// Función para generar una matriz que simule un cartón de bingo.
	public static void generaCarton(int cartonFuncion[][]) {

		System.out.println("******************************************************************");
		System.out.println("*                         CARTON DE BINGO                        *");
		System.out.println("******************************************************************");

		for (int filas = 0; filas < cartonFuncion.length; filas++) {
			System.out.println();

			for (int columnas = 0; columnas < cartonFuncion[filas].length; columnas++) {
				System.out.print(cartonFuncion[filas][columnas] + "\t");
			}
			// Para hacer un salto de línea y muestre la siguiente fila.
			System.out.println();
		}
		System.out.println();

		System.out.println("******************************************************************");
	}

	// Función para hacer el sorteo.
	@SuppressWarnings({ "resource", "unused" })
	public static int sorteoBingo(int cartonFuncion[][], int sorteoFuncion[], int numerosUsados[]) {

		Scanner entrada = new Scanner(System.in);

		int numeroAleatorio;

		numeroAleatorio = (int) (Math.random() * (90 + 1));

		String opcion = " ";

		for (int i = 0; i < sorteoFuncion.length; i++) {
			sorteoFuncion[i] = numerosRepetidos(sorteoFuncion);
		}
		// Muestra los números que salen del bombo
		for (int i = 0; i < sorteoFuncion.length; i++) {

			System.out.println("\nNúmero extraido del bombo: " + "[" + sorteoFuncion[i] + "]");

			numerosUsados[i] = sorteoFuncion[i];
			/*
			 * Comprueba el número acertado y luego vuelvo a imprimir el cartón con el
			 * número acertado de mi carton tachado (cambia el valor del numero en el carton a [-1]). 
			 * En caso de que sea bingo canta bingo.
			 */
			numeroAcertado(sorteoFuncion[i], cartonFuncion);

			System.out.print("\n¿Continuar? (S/N): ");

			do {
				opcion = entrada.nextLine();
				if (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
					System.out.println("\nOpción no válida, por favor introduce 'S' o 'N'!");
				}
			} while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));
			
			// Comprueba el número acertado y luego imprimimos el carton. En caso de que sea bingo canta bingo.
			if (opcion.equalsIgnoreCase("S")) {
				System.out.println();

				if (comprobarBingo(cartonFuncion) == true) {
					System.out.println("\nBingo!!");
					System.out.println("\nFin del sorteo!!");
					// Muestra los numeros que han salido en el sorteo.
					System.out.print("Los números que han salido en el sorteo son: ");
					return i;
				}
				/*
				 * Vuelvo a llamar a la función (generarCarton) para ver el cartón con cada bola (numero) extraido del bombo, 
				 * poder verificar si el número extraído esta en el carton y si es asi tachar (cambiar el valor del número del carton a [-1])
				 */
				generaCarton(cartonFuncion);
			} else if (opcion.equalsIgnoreCase("N")) {
				System.out.println("\nFin del sorteo!!");
				// Muestra los números que han salido en el sorteo.
				System.out.print("\nLos números que han salido en el sorteo son: ");
				return i;
			}
			System.out.println();
		}

		return sorteoFuncion.length;
	}

	// Funcion para mostrar los números que han salido en el sorteo.
	public static void mostrarNumerosSorteo(int numerosUsados[]) {

		boolean salir = false;

		for (int i = 0; i < numerosUsados.length && salir == false; i++) {
			if (numerosUsados[i] != 0) {
				System.out.print(numerosUsados[i] + ",");
			} else {
				salir = true;
			}
		}
		System.out.println();
	}

	// Función para comprobar si sale un número repetido en el sorteo.
	public static int numerosRepetidos(int sorteoFuncion[]) {

		int numeroAleatorio;
		boolean repetido = true;

		do {
			// Inicializo en false dando por supuesto que el número no esta repetido.
			repetido = false;
			numeroAleatorio = (int) (Math.random() * 90 + 1);

			for (int i = 0; i < 90; i++) {
				if (numeroAleatorio == sorteoFuncion[i]) {
					repetido = true;
				}
			}
		} while (repetido == true);

		return numeroAleatorio;
	}

	// Función para comprobar si el número del sorteo esta en el cartón.
	public static void numeroAcertado(int numero, int cartonFuncion[][]) {

		for (int i = 0; i < cartonFuncion.length; i++) {
			for (int j = 0; j < cartonFuncion[i].length; j++) {
				if (cartonFuncion[i][j] == numero) {
					// Aviso de que el número extraido del bombo esta en el cartón.
					System.out.println("\nEl número " + "[" + cartonFuncion[i][j] + "]" + " Esta en mí cartón.");
					
					// Cambia el valor del numero de mi cartón que ha salido en el sorteo a(-1)
					cartonFuncion[i][j] = -1;
				}
			}
		}
	}

	// Función para comprobar si se canta bingo.
	public static boolean comprobarBingo(int cartonFuncion[][]) {
		for (int i = 0; i < cartonFuncion.length; i++) {
			for (int j = 0; j < cartonFuncion[i].length; j++) {
				if (cartonFuncion[i][j] > 0) {
					return false;
				}
			}
		}
		return true;
	}
}