import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Usuario {
	
	Scanner input = new Scanner(System.in);
	
	private int idCliente = 0;
	
	
	List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	public void criarCliente() {
		
		Usuario usuario = new Usuario();
			
		System.out.println("\nInsira os dados do cliente\n");
		
		System.out.println("Digite o nome");
		usuario.setNome(input.nextLine());
		
		System.out.println("Digite a senha");
		usuario.setSenha(input.nextLine()); 
		
		System.out.println("Digite o cpf");
		usuario.setCpf(input.nextLine());
		
		System.out.println("Digite o email");
		usuario.setEmail(input.nextLine());
		
		System.out.println("Digite a idade");
		usuario.setIdade(TratamentoExcecao.lerInteiro()); 
		

		listaUsuarios.add(usuario);
		
		usuario.setId(idCliente);
		
		idCliente++;
		
		
		System.out.println("\nCliente adicionado com sucesso\n");
		
		
	}
	
	
	
	
	public void removerCliente() {
		
		System.out.println("Digite o indice do cliente que deseja remover");
		
		int indice = TratamentoExcecao.lerInteiro();
		
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
		
			
	}
	
	public void editarCliente() {
		
		int condicao, numero, opcao;
		
		System.out.println("Digite o índice do cliente que deseja fazer modificações");
		
		numero = TratamentoExcecao.lerInteiro();
		
		condicao = buscarUsuario(listaUsuarios, numero);
		
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
	
	
	public void buscarCliente() {
		
		int opcao, numero, indice;
		
		System.out.println("Digite a opção que deseja");
		
		System.out.println("1 - Ver todos os clientes");
		System.out.println("2 - Consultar cliente por índice");
		
		
		opcao = TratamentoExcecao.lerInteiro();
		
		if(opcao == 1) {
			
			for(int i = 0; i<listaUsuarios.size(); i++) {
				System.out.println(listaUsuarios.get(i).toString());
			}
			
		}
		else if(opcao == 2) {
			
			System.out.println("Digite o índice do cliente");
			
			numero = TratamentoExcecao.lerInteiro();
			
			indice = buscarUsuario(listaUsuarios, numero);
			if(indice == -1) return;
			
			
			System.out.println(listaUsuarios.get(indice).toString());
			
		}
		else {
			System.out.println("Opção inválida");
		}
		
		
	}
	

}
