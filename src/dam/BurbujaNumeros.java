package dam;

public class BurbujaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ordena los números del array de menor a mayor.
		int[] array = { 7, 2, 4, 8, 3, 9, 1, 5, 10, 6 };

		int temporal = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temporal = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temporal;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}

}
