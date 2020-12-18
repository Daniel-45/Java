package utilidades;

import java.util.ArrayList;

public abstract class AppMenu {

	private ArrayList<String> opciones;

	// Constructor por defecto.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AppMenu() {
		opciones = new ArrayList();
	}

	// Constructor con parámetros.
	public AppMenu(ArrayList<String> opciones) {
		this.opciones = opciones;
	}

	// Getters & Setters
	public ArrayList<String> getOpciones() {
		return opciones;
	}

	public void setOpciones(ArrayList<String> opciones) {
		this.opciones = opciones;
	}

	// Método para mostrar las opciones del menu de opciones.
	public void mostrarOpciones() {
		for (int i = 0; i < opciones.size(); i++) {
			System.out.println(opciones.get(i));
		}
	}

	// Método para leer una opcion del menu de opciones.
	public int leerOpcion() {
		int opcion;

		do {
			opcion = Libreria.leerPositivo("\nSelecciona una opcion:");
			if (opcion < 1 || opcion > opciones.size()) {
				System.out.println("\nSelecciona una opcion del menu");
			}
		} while (opcion < 1 || opcion > opciones.size());

		return opcion;
	}

	// Método para ejecutar la aplicacion.
	public void run() {
		int opcion;

		do {
			System.out.println();
			mostrarOpciones();
			opcion = leerOpcion();
			evaluarOpcion(opcion);
		} while (opcion != opciones.size());
	}

	public abstract void evaluarOpcion(int opcion);

}
