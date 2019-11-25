import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Usuario {
	
	Scanner input = new Scanner(System.in);
	
	private double saldo; // ver melhor se interessa para colocar no programa
	
	//podemos usar o recurso de Generics para restringir as listas a um determinado tipo de objetos
	//ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	
	//ArrayList listaClientes = new ArrayList();
	List<Usuario> listaUsuarios = new ArrayList<>();
	Usuario usuario = new Usuario();
	
	public void criarCliente() {
		
	
		//Usuario usuario = new Usuario();
		
		System.out.println("\nInsira os dados do cliente\n");
		
		System.out.println("Digite o nome");
		usuario.nome = input.nextLine();
		
		System.out.println("Digite a senha");
		usuario.senha = input.nextLine();
		
		System.out.println("Digite o cpf");
		usuario.cpf = input.nextLine();
		
		System.out.println("Digite o email");
		usuario.email = input.nextLine();
		
		System.out.println("Digite a idade");
		usuario.idade = input.nextInt();
		
		//System.out.println("Digite o saldo do cliente");
		
		input.nextLine();
		
		listaUsuarios.add(usuario);
		
		usuario.id = id++;
		
		for(int i = 0; i<listaUsuarios.size(); i++) {
			System.out.println(listaUsuarios.get(i).toString());
		}
		
		
		
	}
	
	
	public void removerCliente() {
		
		System.out.println("Digite o indice do cliente que deseja remover");
		
		int indice = input.nextInt();
		input.nextLine();
		
		if(listaUsuarios.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado");
		}
		else {
			
			int flag = 0;
			
			for(int i = 0; i < listaUsuarios.size(); i++) {
				
				if(listaUsuarios.get(i).getId() == indice) {
					
					listaUsuarios.remove(i);
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				
				System.out.println("Nenhum cliente com esse índice");
				
			}
			else {
				
				System.out.println("Cliente removido com sucesso");
			
			}
				
			
		}
		
		
		for(int i = 0; i<listaUsuarios.size(); i++) {
			System.out.println(listaUsuarios.get(i).toString());
		}
		
		
	}
	
	public void editarCliente() {
		
		int condicao, numero, opcao;
		
		System.out.println("Digite o índice do cliente que deseja fazer modificações");
		
		numero = input.nextInt();
		input.nextLine();
		
		condicao = usuario.buscarUsuario(listaUsuarios, numero);
		
		if(condicao == -1) return;
		
		System.out.println("Digite o número do que deseja alterar");
		
		System.out.println("1 - Nome");
		System.out.println("2 - Senha");
		System.out.println("3 - CPF");
		System.out.println("4 - E-mail");
		System.out.println("5 - Idade");
		
		opcao = input.nextInt();
		input.nextLine();
		
		if(opcao>0 && opcao <=5) {
			
			listaUsuarios.get(numero).modificarCliente(opcao);
			
		}
		else {
			System.out.println("Opção inválida!");
		}
		
		
	}
	

}
