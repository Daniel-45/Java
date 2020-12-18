package dam;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class HundirFlota {

	// Constantes

	// Representan valores
	final static char AGUA_NO_TOCADO = '-';
	final static char AGUA = 'A';
	final static char TOCADO = 'X';

	// Tamaño del tablero
	final static int TAMANIO = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Tableros del usuario y del ordenador
		char[][] tableroUsuario = new char[TAMANIO][TAMANIO];
		char[][] tableroOrdenador = new char[TAMANIO][TAMANIO];

		// Tablero para anotar y visualizar las tiradas sobre el tablero del ordenador
		char[][] visual = new char[TAMANIO][TAMANIO];

		// Puntos con los que se comienzan las partidas.
		// Cada vez que se acierta un tiro se van restando puntos del contrario
		int puntosUsuario = 24;
		int puntosOrdenador = 24;

		// Control del programa
		// Si no quedan barcos a flote del jugador o el ordenador, lo cambio a true
		boolean juegoTerminado = false;

		// Indica si el tiro es correcto, para volver a tirar
		boolean tiroCorrecto = false;

		// Posiciones del tiro
		int[] tiro = new int[2];

		// Iniciar tableros
		iniciar(tableroUsuario, tableroOrdenador);

		// Iniciar registro a AGUA_NO_TOCADO
		iniciaTableroVisual(visual);

		// Mientras queden barcos a flote
		while (!juegoTerminado) {

			// Al principio del turno, pintamos el mapa del usuario
			System.out.println("\n------------ MAPA DEL USUARIO ------------");
			System.out.println("");
			imprimirMapa(tableroUsuario);

			System.out.printf("\nPuntos restantes del jugador: %d\n", puntosUsuario);
			System.out.println("\nTurno del jugador");

			// Comenzamos con la tirada del usuario
			tiroCorrecto = false;
			while (!tiroCorrecto) {
				// Solicitamos los datos por teclado.
				tiro = pedirTiro();
				// Verificamos si el tiro es correcto o no
				if (tiro[0] != -1 && tiro[1] != -1) {
					// Puede ser incorrecto porque ya haya tirado sobre esas coordenadas
					tiroCorrecto = evaluarTiro(tableroOrdenador, tiro);
					if (!tiroCorrecto)
						System.out.println("\nTiro incorrecto");
				} else {
					System.out.println("\nTiro incorrecto");
				}
				// De no serlo, el jugador debe volver a tirar

			}

			// Actualizamos mapa del ordenador y los puntos
			int puntosOrdenadorAnterior = puntosOrdenador;
			puntosOrdenador = actualizarTablero(tableroOrdenador, tiro, puntosOrdenador);

			// Actualizamos nuestro mapa de registro y lo imprimimos.
			// Sabemos si la tirada ha sido AGUA O TOCADO si el número de puntos se ha
			// decrementado.
			char tipoTiro = (puntosOrdenadorAnterior - puntosOrdenador) > 0 ? TOCADO : AGUA;
			actualizaTableroVisual(visual, tiro, tipoTiro);
			System.out.println("\n----- REGISTRO DEL MAPA DEL ORDENADOR -----");
			System.out.println("");
			imprimirMapa(visual);

			// El juego termina si el numero de puntos llega a 0
			juegoTerminado = (puntosOrdenador == 0);

			// Si no ha ganado el jugador, le toca a la máquina
			if (!juegoTerminado) {

				System.out.printf("\nPuntos restantes del ordenador: %d\n\n", puntosOrdenador); 
				System.out.println("Turno del ordenador");
				tiroCorrecto = false;
				// Seguimos los mismos parametros de comprobacion que en la tirada del usuario
				while (!tiroCorrecto) {
					tiro = generaDisparoAleatorio();
					tiroCorrecto = evaluarTiro(tableroUsuario, tiro);
				}
			}
			// Actualizamos mapa
			puntosUsuario = actualizarTablero(tableroUsuario, tiro, puntosUsuario);
			// El juego termina si el numero de puntos llega a 0
			juegoTerminado = (puntosUsuario == 0);

		} // FIN DE LA PARTIDA. Alguien ha ganado

		if (puntosOrdenador == 0) {
			System.out.println("\nEl vencedor ha sido el jugador");
		} else
			System.out.println("\nEl vencedor ha sido el ordenador");

		sc.close();
	}

	// METODOS

	// Metodo que devuelve un número aleatorio de 0 a TAMANIO (9)
	private static int aleatorio() {
		Random a = new Random(System.currentTimeMillis());
		return a.nextInt(TAMANIO);
	}

	// Método que sirve para que el ordenador pueda hacer un disparo
	private static int[] generaDisparoAleatorio() {
		return new int[] { aleatorio(), aleatorio() };
	}

	// Método que inicia un tablero de juego colocando los barcos
	private static void iniciaTablero(char[][] tablero) {
		// Iniciar el tablero entero a AGUA_NO_TOCADO
		for (int i = 0; i < TAMANIO; i++) {
			for (int z = 0; z < TAMANIO; z++) {
				tablero[i][z] = AGUA_NO_TOCADO;
			}
		}

		// BARCOS 2 Portaaviones (5 casillas) 3 Acorazados (3 casillas) 5 Buques (1 casilla)

		int[] barcos = { 5, 5, 3, 3, 3, 1, 1, 1, 1, 1 };

		// Posible dirección del barco (Vertical/Horizontal)
		char[] direccion = { 'V', 'H' };

		// Bucle para cada barco (b) en el array de barcos (barcos)
		for (int b : barcos) {

			// Tantas veces como sea necesario para colocar el barco en el tablero
			// De mayor a menor para que sean menos difícil encontrar hueco para el barco

			// Suponemos que el barco no esta colocado
			boolean colocado = false;

			// Bucle while (mientras que el barco no esta colocado)
			while (!colocado) {

				// Posición y dirección aleatoria del barco
				int fila = aleatorio();
				int columna = aleatorio();
				// direccion[aleatorio() % 2] al calcular el resto da 0 o 1 y asi tengo la dirección
				char posicion = direccion[aleatorio() % 2];

				// Cabe el barco en la posición indicada
				if (posicion == 'V') {
					if (fila + b <= (TAMANIO - 1)) {
						// Comprobar que no hay otro barco en esa posición
						boolean otro = false;
						for (int i = fila; (i <= fila + b) && !otro; i++) {
							if (tablero[i][columna] != AGUA_NO_TOCADO) {
								otro = true;
							}
						}

						// Si no hay otro barco se coloca
						if (!otro) {
							for (int i = fila; i < fila + b; i++) {
								tablero[i][columna] = Integer.toString(b).charAt(0);
							}
							colocado = true;
						}
					}
				} else {
					if (columna + b <= (TAMANIO - 1)) {
						// Comprobar que no hay otro barco en esa posición
						boolean otro = false;
						for (int z = columna; (z <= columna + b) && !otro; z++) {
							if (tablero[fila][z] != AGUA_NO_TOCADO) {
								otro = true;
							}
						}
						// Si no hay otro barco se coloca
						if (!otro) {
							for (int z = columna; z < columna + b; z++) {
								tablero[fila][z] = Integer.toString(b).charAt(0);
							}
							colocado = true;
						}
					}
				}
			}
		}
	}

	// Método que inicia los dos tableros (usuario y ordenador)
	public static void iniciar(char[][] tablero1, char[][] tablero2) {
		iniciaTablero(tablero1);
		iniciaTablero(tablero2);
	}

	// Método que inicia el tablero que se muestra al usuario con las tiradas que ha hecho sobre el tablero del ordenador

	private static void iniciaTableroVisual(char[][] tablero) {
		// Iniciar el tablero entero a AGUA_NO_TOCADO
		for (int i = 0; i < TAMANIO; i++) {
			for (int z = 0; z < TAMANIO; z++) {
				tablero[i][z] = AGUA_NO_TOCADO;
			}
		}
	}

	// Método que imprime un mapa, con una fila y columna de encabezados
	public static void imprimirMapa(char[][] mapa) {

		// Calculamos las letras segun el tamaño
		char[] letras = new char[TAMANIO];
		for (int i = 0; i < TAMANIO; i++)
			letras[i] = (char) ('A' + i);

		// Imprimimos la fila de encabezado
		System.out.print("    ");
		for (int i = 0; i < TAMANIO; i++) {
			System.out.print("[" + i + "] ");
		}

		System.out.println("");
		// Imprimimos el resto de filas
		for (int i = 0; i < TAMANIO; i++) {
			System.out.print("[" + letras[i] + "]  ");
			for (int j = 0; j < TAMANIO; j++) {
				System.out.print(mapa[i][j] + "   ");
			}
			System.out.println("");
		}
	}

	// Método mediante el cual el usuario introduce una casilla
	@SuppressWarnings("resource")
	private static int[] pedirTiro() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduzca la casilla (Ejemplo B4): ");
		String linea = sc.nextLine();
		// Pasamos la cadena a mayúsculas
		linea = linea.toUpperCase();
		int[] t;

		// Comprobamos que lo introducido por el usaurio es correcto mediante una expresion regular
		if (linea.matches("^[A-Z][0-9]*$")) {

			// Obtener la letra.
			// Suponemos que usaremos una letra del abecedario
			char letra = linea.charAt(0);
			// El numero de fila es VALOR_NUMERICO(LETRA) - VALOR_NUMERICO(A).
			int fila = Character.getNumericValue(letra) - Character.getNumericValue('A');
			// Para la columna, tan solo tenemos que procesar el número
			int columna = Integer.parseInt(linea.substring(1, linea.length()));
			// Si las coordenadas están dentro del tamaño del tablero, las devolvemos
			if (fila >= 0 && fila < TAMANIO && columna >= 0 && columna <= TAMANIO) {
				t = new int[] { fila, columna };
			} else // En otro caso, devolvemos -1, para que vuelva a solicitar el tiro
				t = new int[] { -1, -1 };
		} else
			t = new int[] { -1, -1 };

		return t;

	}

	// Método que nos permite evaluar si un tiro es CORRECTO (AGUA o TOCADO) o se trata de una casilla por la que ya hemos pasado antes.

	public static boolean evaluarTiro(char[][] mapa, int[] t) {
		int fila = t[0];
		int columna = t[1];
		return mapa[fila][columna] == AGUA_NO_TOCADO || (mapa[fila][columna] >= '1' && mapa[fila][columna] <= '5');

	}

	// Método que actualiza el mapa, con un determinado tiro. Devolvemos el número de puntos restantes.
	private static int actualizarTablero(char[][] mapa, int[] t, int puntos) {
		int fila = t[0];
		int columna = t[1];

		if (mapa[fila][columna] == AGUA_NO_TOCADO) {
			mapa[fila][columna] = AGUA;
			System.out.println("\nAgua!!");
		} else {
			mapa[fila][columna] = TOCADO;
			System.out.println("\nHas alcanzado un barco!!");
			--puntos;
		}

		return puntos;

	}

	// Método que actualiza el mapa de registro
	private static void actualizaTableroVisual(char[][] mapa, int[] t, char valor) {
		int fila = t[0];
		int columna = t[1];

		mapa[fila][columna] = valor;
	}
}
