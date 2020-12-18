package dam;

import daw.com.Teclado;

public class ValidarUsuarioPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String USUARIO = "daniel"; 
		
		final String PASSWORD = "usertar";
		
		String usuario,password;
		
		int contador = 0; 

		do {
			usuario = Teclado.leerString("Usuario:"); 
			password = Teclado.leerString("\nPassword:");

			if (usuario.equals(USUARIO) && password.equals(PASSWORD)) {
				System.out.println("\nUsuario válido, acceso permitido!!");
				contador = 3;
			}
			else {
				System.out.println("\nUsuario o Password no válido, acceso denegado!!");
				System.out.println();
				contador++;
			}
		}
		while(contador < 3);
	}

}
