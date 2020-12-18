package dam;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class MatrizAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aleatorio = generaAleatorio();

		System.out.println("Array " + Arrays.toString(aleatorio));

		// Reducir el stream solo al valor maximo
		OptionalInt maximo = Arrays.stream(aleatorio).reduce(Integer::max);

		String max = maximo.isPresent() ? "El valor máximo es: " + maximo.getAsInt() : "No hay máximo";

		System.out.println("\n" + max);

		// Reducir el stream solo al valor minimo
		OptionalInt minimo = Arrays.stream(aleatorio).reduce(Integer::min);

		String min = minimo.isPresent() ? "El valor mínimo es: " + minimo.getAsInt() : "No hay mánimo";

		System.out.println("\n" + min);

		// Reducir el stream para sacar la suma de todos los elementos
		int suma = Arrays.stream(aleatorio).reduce(0, (x, y) -> x + y);

		System.out.println("\nLa suma de todos los elementos es: " + suma);
	}

	public static int[] generaAleatorio() {
		return new Random().ints(20, 0, 100).toArray();
	}

}
