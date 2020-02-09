package data;

import java.util.ArrayList;
import java.util.List;

import sistema.Cliente;
import sistema.Usuario;

public class UsuarioSingleton {

	private static UsuarioSingleton single_instance = null;
	public List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	Usuario usuario = new Usuario();
	Cliente cliente = new Cliente();
	
	private UsuarioSingleton() { 
	        
	 }
	
	public static UsuarioSingleton getInstance() {

		if (single_instance == null) {
			single_instance = new UsuarioSingleton();
		}
		return single_instance;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
