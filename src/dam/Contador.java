package dam;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int c5 = 0; c5 < 10; c5++)
			for (int c4 = 0; c4 < 10; c4++)
				for (int c3 = 0; c3 < 10; c3++)
					for (int c2 = 0; c2 < 10; c2++)
						for (int c1 = 0; c1 < 10; c1++)
							escribirContadores(c5, c4, c3, c2, c1);
	}

	private static void escribirContadores(int c5, int c4, int c3, int c2, int c1) {
		// TODO Auto-generated method stub

		String resultado = c5 + "-" + c4 + "-" + c3 + "-" + c2 + "-" + c1;

		resultado = resultado.replaceAll("3", "E");

		System.out.println("\n" + resultado);
	}

}
