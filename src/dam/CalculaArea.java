package dam;

import daw.com.Teclado;
import utilidades.AppMenu;

public class CalculaArea extends AppMenu {
	
	public CalculaArea() {
		super();
		getOpciones().add("1.Calcular área de un cuadrado");
		getOpciones().add("\n2.Calcular área de un rectángulo");
		getOpciones().add("\n3.Calcular área de un triángulo");
		getOpciones().add("\n4.Calcular área de un circulo");
		getOpciones().add("\n5.Salir de la aplicacion");
	}
	
	float lado, base, altura, radio;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculaArea app;
		
		app = new CalculaArea();
		
		app.run();
		
	}

	@Override
	public void evaluarOpcion(int opcion) {
		// TODO Auto-generated method stub
		
		switch (opcion) {
		case 1:
			calculaAreaCuadrado();
			break;
		case 2:
			calculaAreaRectangulo();
			break;
		case 3:
			calculaAreaTriangulo();
			break;
		case 4:
			calculaAreaCirculo();
			break;
		case 5:
			salir();
			break;
		default:
			break;
		}
	}

	private void calculaAreaCuadrado() {
		// TODO Auto-generated method stub
		System.out.println("\nHas seleccionado calcular el área de un cuadrado");
	
		lado = Teclado.leerFloat("\nIntroduce el valor del lado del cuadrado:");
		
		System.out.println("\nEl área del cuadrado es: " + lado * lado);
	}

	private void calculaAreaRectangulo() {
		// TODO Auto-generated method stub
		System.out.println("\nHas seleccionado calcular el área de un rectángulo");
		
		base = Teclado.leerFloat("\nIntroduce el valor de la base del rectángulo:");
		
		altura = Teclado.leerFloat("\nIntroduce el valor de la altura del rectángulo:");
		
		System.out.println("\nEl área del rectángulo es: " + base * altura);
	}

	private void calculaAreaTriangulo() {
		// TODO Auto-generated method stub
		System.out.println("\nHas seleccionado calcular el área de un triángulo");
		
		base = Teclado.leerFloat("\nIntroduce el valor de la base del triángulo:");
		
		altura = Teclado.leerFloat("\nIntroduce el valor de la altura del triángulo:");
		
		System.out.println("\nEl área del triángulo es: " + (base * altura) / 2);
	}

	private void calculaAreaCirculo() {
		// TODO Auto-generated method stub
		System.out.println("\nHas seleccionado calcular el área de un circulo");
		
		radio = Teclado.leerFloat("\nIntroduce el valor del radio del circulo:");
		
		System.out.print("\nEl área del circulo es: " + Math.PI * (radio * radio) + "\n");	
	}

	private void salir() {
		// TODO Auto-generated method stub
		System.out.println("\nHas salido de la aplicacion");
	}
}
