package dam;

import java.util.*;

import daw.com.Teclado;

public class ExamenNombres {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Crear un array de 6 posiciones. 
		 * 2. Llenar el array con valores (nombres) introducidos por teclado. 
		 * 3. Mostrar la posición y el valor de los nombres introducidos.
		 * 4. Ordenar alfabeticamente los nombres. 
		 * 5. Mostrar por pantalla el nombre con mayor y menor número de caracteres. 
		 * 6. Salir.
		 */

		Scanner entrada = new Scanner(System.in);

		int opcion;
		int numeroElementos = 6;
		boolean salir = false;
		String nombres[] = new String[numeroElementos];
		
		llenarNombres(nombres);

		while (salir != true) {
			mostrarMenuOpciones();
			
			System.out.print("\nSelecciona una opción: ");
			
			do {
				opcion = entrada.nextInt();
				
				if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6 && opcion != 7) {
					System.out.print("\nERROR!! selecciona una opción (1-7): ");
				}

				switch (opcion) {
				case 1:
					mostrarPosicionNombres(nombres);
					break;
				case 2:
					mostrarNombres(nombres);
					break;
				case 3:
					ordenarNombres(nombres);
					break;
				case 4:
					mostrarMayor(nombres);
					mostrarMenor(nombres);
					break;
				case 5:
					mostrarPosicionNombres(nombres);
					mostrarNombres(nombres);
					ordenarNombres(nombres);
					mostrarMayor(nombres);
					mostrarMenor(nombres);
					break;
				case 6:
					salir = true;
					System.out.println("\nFin del programa.");
					break;
				}
			} while (opcion < 1 || opcion > 6);
		}
	}

	// Funcion para el menu de opciones.
	public static void mostrarMenuOpciones() {

		System.out.println();
		System.out.println("=============================================================");
		System.out.println("                        MENU DE OPCIONES");
		System.out.println("=============================================================");
		System.out.println("1. Mostrar la posición y el valor de los nombres.");
		System.out.println("2. Mostrar los nombres del array.");
		System.out.println("3. Ordenar alfabeticamente los nombres.");
		System.out.println("4. Mostrar los nombres con mayor y menor numero de caracteres.");
		System.out.println("5. Mostrar todas las opciones del menu.");
		System.out.println("6. Salir.");
	}

	// Funcion llenar el array con nombres introducidos por teclado.

	@SuppressWarnings({ "unused" })
	public static void llenarNombres(String nombresFuncion[]) {

		String nombre = "";
		
		System.out.println("\nIntroduce 6 nombres para llenar el array");
		
		for (int i = 0; i < nombresFuncion.length; i++) {
			System.out.print("\nNombre " + (i + 1) + ": ");
			nombresFuncion[i] = nombre = Teclado.leerString();
		}
		System.out.println();
	}

	// Función para mostrar la posición (índice) y el nombre que corresponde a esa posición del array.
	public static void mostrarPosicionNombres(String nombresFuncion[]) {

		System.out.println("\nEl resultado de mostrar la posición y los nombres del array es:\n");
		
		for (int i = 0; i < nombresFuncion.length; i++) {
			System.out.println("La posicion [" + i + "] contiene el nombre: " + nombresFuncion[i]);
		}
	}

	// Función para mostrar el array.
	public static void mostrarNombres(String nombresFuncion[]) {

		System.out.println();
		
		System.out.println("El resultado de llenar el array es: ");
		
		System.out.println();

		for (int i = 0; i < nombresFuncion.length; i++) {
			System.out.print("[" + nombresFuncion[i] + "]");
		}
		System.out.println();
	}

	// Funcion para ordenar alfabeticamente los nombres.
	public static void ordenarNombres(String nombresFuncion[]) {

		for (int i = 0; i < nombresFuncion.length; i++) {
			for (int j = 0; j < nombresFuncion.length - 1 - i; j++) {
				if (nombresFuncion[j].compareToIgnoreCase(nombresFuncion[j + 1]) > 0) {
					String aux = nombresFuncion[j];
					nombresFuncion[j] = nombresFuncion[j + 1];
					nombresFuncion[j + 1] = aux;
				}
			}
		}

		System.out.println("\nEl resultado de ordenar los nombres del array alfabeticamente es:");
		
		System.out.println();
		
		for (int i = 0; i < nombresFuncion.length; i++) {
			System.out.print("[" + nombresFuncion[i] + "]");
		}
		System.out.println();
	}

	// Funcion para mostrar el nombre con mayor numero de caracteres.
	public static void mostrarMayor(String nombresFuncion[]) {

		String mayor = nombresFuncion[0];

		System.out.println();
	        
	        for (int i = 0; i < nombresFuncion.length; i++) {
	        	if (nombresFuncion[i].length() > mayor.length()) {
	        		mayor = nombresFuncion[i];
	        	}
	        }
		
		System.out.println("El nombre con más caracteres es: " + mayor);
	}
	
	public static void mostrarMenor(String nombresFuncion[]) {
		String menor = nombresFuncion[0];
		
		System.out.println();
		
		for (int i = 0; i < nombresFuncion.length; i++) {
			if (nombresFuncion[i].length() < menor.length()) {
				menor = nombresFuncion[i];
			}
		}
		
		System.out.println("El nombre con menos caracteres es: " + menor);
	}
	
}
