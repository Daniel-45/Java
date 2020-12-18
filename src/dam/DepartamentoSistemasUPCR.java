package dam;

import daw.com.Teclado;
import utilidades.AppMenu;

/*
 * El Departamento de Sistemas de la UCPR cuenta con cinco salas de sistemas, cada una de ellas con 20 ordenadores. 
 * Se requiere sistematizar el proceso de reserva o cancelación de turnos para dichas salas en el horario disponible (12 a 2 pm, unicamente), 
 * los demas horarios están reservados para clases.
 * Construir un programa que solicite al usuario la siguiente información (sala, equipo), tanto para asignar turno como para cancelarlo. 
 * Igualmente, el programa deberia permitir conocer el número de equipos disponibles (sin asignar) por sala, y
 * el número total de turnos asignado (todas las salas). 
 * Tener en cuenta que el programa deberia funcionar permanentemente mostrando el siguiente menú de opciones:
 * 1. Asignar o cancelar turno.
 * 2. Cantidad de equipos disponibles por sala.
 * 3. cantidad de turnos asignados en toda la UPCR.
 * 4. Salir. 
 */

public class DepartamentoSistemasUPCR extends AppMenu {

	public DepartamentoSistemasUPCR() {
		super();
		getOpciones().add("1.Asignar o cancelar turno");
		getOpciones().add("\n2.Cantidad de equipos disponibles por sala");
		getOpciones().add("\n3.Cantidad de turnos asignados en toda la UPCR");
		getOpciones().add("\n4.Salir de la aplicacion");
	}

	static int numeroSalas = 5;

	static int numeroEquipos = 20;

	// Array bidimensional (5 filas, 20 columnas -> salas y equipos)
	static int salas[][] = new int[numeroSalas][numeroEquipos];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Inicializar el array salas[][] (sala [1-5]) y equipos todos a cero. El valor
		 * por defecto es cero si el valor cambia a 1 los equipos estan ocupados y el
		 * turno es asignado a un usuario
		 */

		for (int i = 0, sala = 0; i < numeroSalas; i++, sala++) {
			System.out.print(" Sala - " + sala + " - Equipos: ");
			for (int j = 0; j < numeroEquipos; j++) {
				System.out.print(salas[i][j]);
				salas[i][j] = 0;
			}
		}

		System.out.println();

		DepartamentoSistemasUPCR app;

		app = new DepartamentoSistemasUPCR();

		app.run();

	}

	@Override
	public void evaluarOpcion(int opcion) {
		// TODO Auto-generated method stub

		switch (opcion) {
		case 1:
			asignarCancelarTurno(salas);
			break;
		case 2:
			cantidadEquiposDisponibles(salas);
			break;
		case 3:
			cantidadTurnosAsignados(salas);
			break;
		case 4:
			salir();
		default:
			break;
		}
	}

	@SuppressWarnings("unused")
	private void asignarCancelarTurno(int[][] arrayFuncion) {
		// TODO Auto-generated method stub

		int sala, equipo, opcion = 0, equiposDisponibles = 20;

		opcion = Teclado.leerInt("\n¿Quieres asignar (1) o cancelar (2) un turno?");

		if (opcion == 1 || opcion == 2) {
			sala = Teclado.leerInt("\nNúmero de la sala:");
			equipo = Teclado.leerInt("\nNúmero del equipo:");

			// Validar sala y equipo.
			if (sala < 0 || sala > 4 || equipo < 0 || equipo > 19) {
				System.out.println("\nERROR!! selecciona una sala (0-4) y un equipo (0-19)");
				sala = Teclado.leerInt("\nNúmero de la sala:");
				equipo = Teclado.leerInt("\nNúmero del equipo:");
			}

			// Sala mayor que (-1) porque la primera posición del índice (primera sala) es cero (0)
			if (opcion == 1 && sala > -1) {
				if (arrayFuncion[sala][equipo] == 0) {
					arrayFuncion[sala][equipo] = 1;
					System.out.print("\nEl equipo ha sido asignado\n");
					equiposDisponibles -= 1;
				} else
					System.out.print("\nEl equipo ya esta asignado!\n");
			} else if (opcion == 2) {
				if (arrayFuncion[sala][equipo] == 1) {
					arrayFuncion[sala][equipo] = 0;
					System.out.print("\nEl equipo ha sido cancelado\n");
					equiposDisponibles += 1;
				} else
					System.out.print("\nEl equipo no esta asignado, no es posible cancelar!\n");
			} else
				System.out.print("\nNo hay equipos disponibles en esa sala!!\n");
		} else
			System.out.print("\nERROR! opcion invalida, selecciona (1 o 2).");
	}

	private void cantidadEquiposDisponibles(int[][] arrayFuncion) {
		// TODO Auto-generated method stub

		for (int sala = 0; sala < arrayFuncion.length; sala++) {
			int equiposDisponibles = 0;
			for (int equipo = 0; equipo < arrayFuncion[sala].length; equipo++) {
				equiposDisponibles += arrayFuncion[sala][equipo];
			}

			equiposDisponibles = arrayFuncion[sala].length - equiposDisponibles;
			System.out.println("\nSala " + sala + ": " + equiposDisponibles + " equipos libres");
		}
	}

	private void cantidadTurnosAsignados(int[][] arrayFuncion) {
		// TODO Auto-generated method stub

		int turnosAsignados = 0;

		for (int sala = 0; sala < arrayFuncion.length; sala++) {
			for (int equipo = 0; equipo < arrayFuncion.length; equipo++) {
				turnosAsignados += arrayFuncion[sala][equipo];
			}
		}

		System.out.print("\nLa cantidad de turnos asignados en toda la UPCR es de: " + turnosAsignados + " turnos\n");
	}

	private void salir() {
		// TODO Auto-generated method stub
		System.out.println("\nHas salido de la aplicación");
	}

}
