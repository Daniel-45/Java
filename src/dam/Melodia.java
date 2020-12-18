package dam;

public class Melodia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nota;

		nota = notaAleatoria();

		int compas;

		compas = compasAleatorio();

		for (int i = 0, contador = 0; i < compas; i++, contador++) {
			if (contador == 4) {
				System.out.print("| ");
				contador = 0;
			}
			nota = notaAleatoria();
			System.out.print(nota + " ");
		}

		System.out.print(" ||");
	}

	private static String notaAleatoria() {
		// TODO Auto-generated method stub

		String nota = "";
		int numero;

		numero = (int) (Math.random() * 7 + 1);

		switch (numero) {
		case 1:
			nota = "do";
			break;
		case 2:
			nota = "re";
			break;
		case 3:
			nota = "mi";
			break;
		case 4:
			nota = "fa";
			break;
		case 5:
			nota = "sol";
			break;
		case 6:
			nota = "la";
			break;
		case 7:
			nota = "si";
			break;
		}

		return nota;
	}

	private static int compasAleatorio() {
		// TODO Auto-generated method stub

		int numeroCompas;

		numeroCompas = (int) (Math.random() * 7 + 1);

		numeroCompas = numeroCompas * 4;

		return numeroCompas;
	}

}
