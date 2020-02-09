package usuario;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import sistema.TratamentoExcecao;

public abstract class Usuario {
	
	private int id = 0;
	private String nome;
	private String senha;
	private String cpf;
	private String email;
	private int idade;
	
	static Scanner input = new Scanner(System.in);
	
	
	public abstract void adicionar(); 
		
	
	public boolean verificarLogin(String login) {
		
		if(login.equals("admin")) {
			return true;
		}
		
		return false;
	}
	
	public boolean verificarSenha(String senha) {
		
		if(senha.equals("123")) {
			return true;
		}
		
		return false;
	}
	
	
	
	public int buscarUsuario(List<Usuario> listaUsuarios, int numero) {
		
		int i, flag = 0;
		
		if(listaUsuarios.isEmpty()) {
			
			System.out.println("Não há clientes cadastrados");
			
			return -1;
		}
		
		for(i = 0; i<listaUsuarios.size(); i++) {
			
			if(listaUsuarios.get(i).getId() == numero) {
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1) {
			
			return i;
		}
		else {
			
			System.out.println("Não há cliente com esse índice");
			return -1;
		}
		
		
	}
	
	public void modificarCliente(int opcao, Usuario usuario) {
		
		UsuarioContexto usuarioContexto = new UsuarioContexto();
		
		usuarioContexto.startUsuarioStrategy(opcao, usuario);
		
	}
	
	
	
	public static String imprimeCPF(String CPF) {
		
		return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
			   CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
		
		
	}
	
		
	
	//Polimorfismo, sobrescrita
	@Override
	public String toString() {
		
		String string;
		
		string = "Id: " + this.id + "		Nome: " + this.nome; 
		string += "		Senha: " + this.senha + "		CPF: " + imprimeCPF(this.cpf);
		string += "		E-mail: " + this.email + "		Idade: " + this.idade;	
		
		return string;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	

}
