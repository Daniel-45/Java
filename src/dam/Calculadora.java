package dam;

import daw.com.Teclado;
import utilidades.AppMenu;

public class Calculadora extends AppMenu {

	public Calculadora() {
		super();
		getOpciones().add("1.Suma");
		getOpciones().add("\n2.Resta");
		getOpciones().add("\n3.Multiplicación");
		getOpciones().add("\n4.División");
		getOpciones().add("\n5.Salir de la aplicación");
	}

	float numero1, numero2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora app;

		app = new Calculadora();

		app.run();

	}

	@Override
	public void evaluarOpcion(int opcion) {
		// TODO Auto-generated method stub

		switch (opcion) {
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplicacion();
			break;
		case 4:
			division();
			break;
		case 5:
			salir();
			break;
		default:
			break;
		}
	}

	private void leerNumeros() {
		numero1 = Teclado.leerFloat("\nIntroduce el primer operando:");
		numero2 = Teclado.leerFloat("\nIntroduce el segundo operando:");
	}

	private void leerNumerosDivison() {
		numero1 = Teclado.leerFloat("\nIntroduce dividendo:");
		numero2 = Teclado.leerFloat("\nIntroduce divisor:");
	}

	private void suma() {
		// TODO Auto-generated method stub
		leerNumeros();
		System.out.println("\nEl resultado de la suma es: " + (numero1 + numero2));
	}

	private void resta() {
		// TODO Auto-generated method stub
		leerNumeros();
		System.out.println("\nEl resultado de la resta es: " + (numero1 - numero2));
	}

	private void multiplicacion() {
		// TODO Auto-generated method stub
		leerNumeros();
		System.out.println("\nEl resultado de la multiplicación es: " + (numero1 * numero2));
	}

	private void division() {
		// TODO Auto-generated method stub
		leerNumerosDivison();
		System.out.println("\nEl resultado de la división es: " + (numero1 / numero2));
	}

	private void salir() {
		// TODO Auto-generated method stub
		System.out.println("\nHas salido de la aplicación");
	}

}
