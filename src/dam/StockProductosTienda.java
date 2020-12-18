package dam;

import java.util.*;

public class StockProductosTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una aplicacion que gestione los datos de stock de una tienda de comestibles, 
		 * la informacion a recoger sera:
		 * nombre del producto, precio, cantidad en stock. 
		 * La tienda dispone de 10 productos distintos. 
		 * El programa debe ser capaz de:
		 * 1. Dar de alta un producto nuevo.
		 * 2. Buscar el producto por su nombre.
		 * 3. Modificar el stock y el precio del producto dado.
		 * 4. Salir.
		 */

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int longitud = leerPositivo("Introduce la cantidad de productos de la tienda:");
		int opcion;
		String producto = "";
		boolean salir = false;

		String productos[] = new String[longitud];

		// Las columnas del Array inicializadas en (2) (stock y precio)
		int stockPrecio[][] = new int[longitud][2];

		while (salir != true) {
			mostrarMenuOpciones();
			System.out.println("Selecciona una opcion:");
			do {
				opcion = entrada.nextInt();

				if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
					System.out.println("ERROR!! selecciona una opcion (1-4):");
				}

				switch (opcion) {
				case 1:
					altaProducto(productos, stockPrecio);
					break;
				case 2:
					buscarProducto(opcion, producto, productos, stockPrecio);
					break;
				case 3:
					modificarStockPrecio(opcion, productos, stockPrecio);
					break;
				case 4:
					salir = true;
					System.out.println("Fin del programa.");
					break;
				}
			} while (opcion < 1 || opcion > 4);
		}

	}

	// Funcion para saber la cantidad de productos.

	public static int leerPositivo(String mensaje) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int numero;

		do {
			System.out.println(mensaje);
			numero = entrada.nextInt();
		} while (numero < 1);

		return numero;

	}

	// Funcion para el menu de opciones.

	public static void mostrarMenuOpciones() {

		System.out.println();
		System.out.println("=======================================================");
		System.out.println("                MENU DE OPCIONES TIENDA");
		System.out.println("=======================================================");
		System.out.println("1. Dar de alta un producto nuevo.");
		System.out.println("2. Buscar el producto por en el sistema.");
		System.out.println("3. Modificar el stock y el precio del producto.");
		System.out.println("4. Salir.");
	}

	// Funcion para dar de alta un producto.

	public static void altaProducto(String productoFuncion[], int stockPrecioFuncion[][]) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < productoFuncion.length; i++) {
			System.out.println();
			System.out.println("Introduce el nombre del producto:");

			productoFuncion[i] = entrada.nextLine();
		}

		for (int i = 0; i < stockPrecioFuncion.length; i++) {
			System.out.println();
			System.out.println("Producto " + productoFuncion[i] + ":");

			for (int j = 0; j < stockPrecioFuncion[i].length; j++) {
				if (j == 0) {
					System.out.println("Introduce la cantidad en stock:");
				} else {
					System.out.println("Introduce el precio del producto:");
				}

				stockPrecioFuncion[i][j] = entrada.nextInt();
			}
		}
	}

	// Funcion para buscar el producto.

	public static int buscarProducto(int opcion, String producto, String productosFuncion[],
			int stockPrecioFuncion[][]) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		if (opcion == 2) {
			System.out.println();
			System.out.println("Introduce el producto a buscar:");
			producto = entrada.nextLine();
		} else if (opcion == 3) {
			System.out.println();
			System.out.println("Introduce el producto a modificar:");
			producto = entrada.nextLine();
		}

		for (int i = 0; i < productosFuncion.length; i++) {
			if (productosFuncion[i].equalsIgnoreCase(producto)) {
				num = i;
				System.out.println();
				System.out.println("Has seleccionado el producto " + productosFuncion[i] + ":");
				System.out.println("La cantidad del producto " + productosFuncion[i] + " en stock es: "
						+ stockPrecioFuncion[i][0] + " unidades.");
				System.out.println("El precio del producto " + productosFuncion[i] + " es: " + stockPrecioFuncion[i][1]
						+ " Euros la unidad.");
			}
		}
		return num;
	}

	// Funcion para modificar el stock y el precio del producto.

	@SuppressWarnings("resource")
	public static void modificarStockPrecio(int opcion, String productoFuncion[], int stockPrecioFuncion[][]) {
		Scanner entrada = new Scanner(System.in);

		String cambiarProducto = "";
		String producto = "";
		int posicion = buscarProducto(opcion, producto, productoFuncion, stockPrecioFuncion);

		System.out.println();

		do {
			System.out
			.println("¿Quieres sustituir el producto " + productoFuncion[posicion] + " por un nuevo producto?");
			cambiarProducto = entrada.nextLine();

			if (!cambiarProducto.equalsIgnoreCase("SI") && !cambiarProducto.equalsIgnoreCase("NO")) {
				System.out.println();
				System.out.println("ERROR!! responde (SI o NO)");
			}

			if (cambiarProducto.equalsIgnoreCase("SI")) {
				System.out.println();
				System.out.println("Introduce el nuevo producto:");
				productoFuncion[posicion] = entrada.nextLine();
				System.out.println("Introduce el stock:");
				stockPrecioFuncion[posicion][0] = entrada.nextInt();
				System.out.println("Introduce el precio:");
				stockPrecioFuncion[posicion][1] = entrada.nextInt();
			} else if (cambiarProducto.equalsIgnoreCase("NO")) {
				System.out.println("Producto " + productoFuncion[posicion] + ":");
				System.out.println("Introduce el nuevo stock:");
				stockPrecioFuncion[posicion][0] = entrada.nextInt();
				System.out.println("Introduce el nuevo precio:");
				stockPrecioFuncion[posicion][1] = entrada.nextInt();
			}
		} while (!cambiarProducto.equalsIgnoreCase("SI") && !cambiarProducto.equalsIgnoreCase("NO"));
	}
}
