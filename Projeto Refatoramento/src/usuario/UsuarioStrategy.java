package usuario;

import java.util.Scanner;

public abstract class UsuarioStrategy {
	
	Scanner input = new Scanner(System.in);
	
	public abstract void usuarioSeletor(Usuario usuario);
	

}
