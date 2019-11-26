import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static int opcaoAdministrador, opcao;
	static String login, senha;

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		Usuario usuario = new Usuario();
		
		do {
			
			System.out.println("\nInforme o login e a senha para entrar no sistema\n");
			System.out.print("Login: ");
			
			login = input.nextLine();
			
			System.out.print("Senha: ");
			
			senha = input.nextLine();
			
			if(!usuario.verificarLogin(login) && usuario.verificarSenha(senha)) {
				System.out.println("Login incorreto");
			}
			else if(usuario.verificarLogin(login) && !usuario.verificarSenha(senha)) {
				System.out.println("Senha incorreta");
			}
			else if(!(usuario.verificarLogin(login) && usuario.verificarSenha(senha))) {
				System.out.println("Login e senha incorretos");
			}
			
			
		}
		while(!(usuario.verificarLogin(login) && usuario.verificarSenha(senha))); 
		
		
		
		while(true) {
			
			
			menu();
			
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			
				case 1: 
					
					cliente.criarCliente();
					
					System.out.println("Cliente adicionado com sucesso");
							
					break;
					
					
				case 2:
					
					cliente.removerCliente();
			
					break;
				
					
				case 3: //FIXAR
					
					cliente.editarCliente();
					
					break;
					
				case 4:
					
					cliente.buscarCliente();
					
					break;
					
				case 5:
					
					
					
					break;
					
				case 6:
					
					
					break;
					
				case 0:
					
					System.exit(0);
					
				default:
					
					System.out.println("Opção inválida\n");
					
			
			}
		}
				
	}
	
	
	public static void menu() {
		
		System.out.println("\n\n-----º Sistema para gerenciamento de compra de jogos °-----\n");
		
		
		System.out.println("Escolha a opção que deseja: \n");
		
		
		System.out.println("1 - Adicionar Cliente"); //ok
		System.out.println("2 - Remover cliente"); //ok
		System.out.println("3 - Editar cliente" ); //ok
		System.out.println("4 - Consultar cliente"); //ok
		System.out.println("5 - Adicionar jogo na plataforma");
		System.out.println("6 - Remover jogo da plataforma");
		System.out.println("7 - Editar jogo da plataforma");
		System.out.println("8 - Buscar jogo na plataforma");
		System.out.println("9 - Gerenciar promoções");
		System.out.println("10 - Gerenciar ranking de jogos");
		System.out.println("11 - Gerenciar patrocinadores");
		System.out.println("0 - Sair\n");
		
	}
	

}
