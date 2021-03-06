package data;

import java.util.ArrayList;
import java.util.List;

import sistema.Cliente;
import sistema.Patrocinador;
import usuario.Usuario;

public class UsuarioSingleton {

	private static UsuarioSingleton single_instance = null;
	public List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	static Usuario usuario = new Cliente();
	
	private UsuarioSingleton() { 
	        
	 }
	
	public static UsuarioSingleton getInstance() {

		if (single_instance == null && usuario == null) {
			single_instance = new UsuarioSingleton();
		}
		return single_instance;
	}

	public Usuario getUsuario() {
	
		return usuario;
		
	}

	public void setUsuario() {
		
		Usuario usuario1 = new Cliente();
		this.usuario = usuario1;
		
	}


	
}
