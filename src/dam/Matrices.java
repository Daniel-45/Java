package dam;

import java.util.Scanner;

public class Matrices {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inicializar una matriz con 8 números enteros y mostrar por pantalla
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];

		// Bucle For con numeros introducidos por el usuario
		System.out.println("MATRIZ DE 8 ELEMENTOS - BUCLE FOR");
		System.out.println("---------------------------------");

		System.out.println("Introduce 8 numeros:");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
			System.out.println("Indice " + "[" + i + "]" + " esta el elemento " + "[" + numeros[i] + "]");
		}

		// Bucle For
		System.out.println();
		System.out.println("MATRIZ DE 8 ELEMENTOS - BUCLE FOR");
		System.out.println("---------------------------------");

		for (int i = 0; i < 8; i++) {
			System.out.println("Indice " + "[" + i + "]" + " esta el elemento " + "[" + numeros[i] + "]");
		}

		// Bucle For Each
		System.out.println();
		System.out.println("MATRIZ DE 8 ELEMENTOS - BUCLE FOR EACH");
		System.out.println("--------------------------------------");

		for (int n : numeros) {
			System.out.print("[" + n + "]");
		}

		// Bucle While
		System.out.println();
		System.out.println("\nMATRIZ DE 8 ELEMENTOS - BUCLE WHILE");
		System.out.println("-----------------------------------");

		int contador1 = 0;
		while (contador1 < 8) {
			System.out.print("[" + numeros[contador1] + "]");
			contador1++;
		}

		// Bucle Do While
		System.out.println();
		System.out.println("\nMATRIZ DE 8 ELEMENTOS - DO WHILE");
		System.out.println("--------------------------------");

		int contador2 = 0;
		do {
			System.out.print("[" + numeros[contador2] + "]");
			contador2++;
		} while (contador2 < 8);

		// Matriz con numeros aleatorios
		System.out.println();
		System.out.println("\nMATRIZ DE ELEMENTOS ALEATORIOS");
		System.out.println("------------------------------");

		System.out.println("Introduce el tamaño del array:");
		int longitud1 = sc.nextInt();

		int array[] = new int[longitud1];

		System.out.println("El resultado de llenar el array aleatorio es:");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print("[" + array[i] + "]");
		}

		// Matriz invertida
		System.out.println();
		System.out.println("\nMATRIZ INVERTIDA DE ELEMENTOS ALEATORIOS");
		System.out.println("----------------------------------------");

		int a, aux, b;

		int matriz[];

		matriz = new int[20];

		System.out.println("Introduce el tamaño del  array:");

		// A la variable (a) se le agrega la cantidad de valores de la matriz.
		a = sc.nextInt();
		// Bucle (for) para llenar la matriz hasta el límite asignado.
		for (int i = 0; i < a; i++) {
			System.out.print("Posición[" + i + "] = ");
			matriz[i] = sc.nextInt();
		}

		// Intercambiar valores
		// Muestra la matriz original sin intercambiar valores.
		System.out.println();
		System.out.println("Array original sin valores intercambiados");
		// Mostrar con el bucle (for)
		for (int z = 0; z < a; z++) {
			System.out.print("[" + matriz[z] + "]");
		}
		
		// A la variable (b) se le da el valor de la variable (a). (a) es el tamaño que asignamos a la matriz al principio.
		b = a;

		/*
		 * Intercambiar valores.
		 * A la variable (aux) se le asigna el valor de la primera posición (0) de la matriz[i]
		 * A la primera posición se le asigna el valor de la última posición de la matriz[b-1] para intercambiar los valores. 
		 * Por último la última posición de la matriz[b-1] va a ser igual a la variable (aux) que guarda la primera posicion de la matriz[i].
		 */
		for (int i = 0; i <= b / 2; i++) {
			aux = matriz[i];
			matriz[i] = matriz[b - 1];
			matriz[b - 1] = aux;
			// Para cambiar el valor de la posicion (una posicion menos)
			b--;
		}

		// Mostrar la matriz con los valores intercambiados.
		System.out.println();
		System.out.println("\nArray final con sus valores intercambiados");
		for (int i = 0; i < a; i++) {
			System.out.print("[" + matriz[i] + "]");
		}

	}

}
