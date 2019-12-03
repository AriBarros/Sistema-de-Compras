import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Usuario {
	
	private int id = 0;
	private String nome;
	private String senha;
	private String cpf;
	private String email;
	private int idade;
	
	static Scanner input = new Scanner(System.in);
	
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
	
	public void modificarCliente(int opcao) {
		
		switch(opcao) {
		
		case 1:
			
			System.out.println("Digite o nome do cliente");
		
			String nome = input.nextLine();
			
			setNome(nome);
			
			System.out.println("\nNome do cliente alterado com sucesso!\n");
			
			break;
		
		
		case 2:
			
			System.out.println("Digite a nova senha do cliente");
		
			String senha = input.nextLine();
			
			setSenha(senha);
			
			System.out.println("\nSenha do cliente alterada com sucesso!\n");
			
			break;
		
		case 3:
			
			System.out.println("Digite o CPF do cliente");
			
			String cpf = input.nextLine();
			
			while(isCPF(cpf) == false) {
				
				System.out.println("Digite o CPF na formatacao correta");
				
				cpf = input.nextLine();
				
			}
			
			setCpf(cpf);
		
			System.out.println("\nCPF do cliente alterado com sucesso!\n");
		
			break;
			
		case 4:
			
			System.out.println("Digite o e-mail do cliente");
			
			String email = input.nextLine();
			
			setEmail(email);
			
			System.out.println("\nE-mail do cliente alterado com sucesso!\n");
		
			break;
			
		case 5:
			
			System.out.println("Digite a idade do cliente");
			
			int idade = TratamentoExcecao.lerInteiro();
			
			setIdade(idade);
			
			System.out.println("\nIdade do cliente alterada com sucesso");
			
			break;
			
		}
		
		
	}
	
	public static boolean isCPF(String CPF) {
		
		// considera erro no CPF por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") ||
			CPF.equals("11111111111") ||
			CPF.equals("22222222222") || CPF.equals("33333333333") ||
			CPF.equals("44444444444") || CPF.equals("55555555555") ||
			CPF.equals("66666666666") || CPF.equals("77777777777") ||
			CPF.equals("88888888888") || CPF.equals("99999999999") ||
			(CPF.length() != 11))
			
			return (false);
		
		char dig10, dig11;
		
		int sm, i, r, num, peso;
		
		try {
			
			//calculo do primeiro digito v.
			
			sm = 0;
			peso = 10;
			
			for(i=0; i<9; i++) {
				
				//converte o i-esimo caractere do cpf em um numero
				//ex: caractere '0' = inteiro 0
				//sendo 48 = 0 na tabela ASCII
				
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
				
			
			}
			
			r = 11 - (sm % 11);
			if((r == 10) || (r == 11)) dig10 = '0';
			else dig10 = (char)(r+48); // converte no respectivo caracter numerico
			
			
			
			//calculo do segundo digito v.
			
			sm = 0;
			peso = 11;
			
			for(i = 0; i<10; i++) {
				
				num = (int)(CPF.charAt(i) - 48);
				sm = sm + (num*peso);
				peso = peso - 1;
				
			}
			
			r = 11 - (sm % 11);
			if((r == 10) || (r == 11)) dig11 = '0';
			else dig11 = (char)(r+48);
			
			
			//verifica se os digitos calculados conferem com os digitos informados
			if((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) return (true);
			else return (false);
			
			
		} catch(InputMismatchException erro) {
			return(false);
		}
			
	}
	
	public static String imprimeCPF(String CPF) {
		
		return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
			   CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
		
		
	}
	
	

	
	// VER FORMATAÇÃO 
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
