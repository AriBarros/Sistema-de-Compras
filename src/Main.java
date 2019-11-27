import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static int opcaoAdministrador, opcao, opcaoPatrocinador, opcaoRanking, opcaoPromocao;
	static String login, senha;
	static int idJogo = 0, idPatrocinador = 0, idRanking = 0, idPromocao = 0;

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Usuario usuario = new Usuario();
		
		List<Jogo> listaJogos = new ArrayList<Jogo>();
		List<Jogo> listaRanking = new ArrayList<Jogo>();
		List<Jogo> listaPromocoes = new ArrayList<Jogo>();
		
		List<Patrocinador> listaPatrocinadores = new ArrayList<Patrocinador>();
		
		

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
			
			//Instanciando aqui pois deve instanciar para acessar a função, se não sobrescreve nos outros ids
			Jogo jogo = new Jogo();
			
			
			menu();
			
			opcao = TratamentoExcecao.lerInteiro();
			
			switch(opcao) {
			
				case 1: 
					
					cliente.criarCliente();
						
					break;
					
					
				case 2:
					
					cliente.removerCliente();
			
					break;
				
					
				case 3: 
					
					cliente.editarCliente();
					
					break;
					
				case 4:
					
					cliente.buscarCliente();
					
					break;
					
				case 5:
					
					jogo.adicionar();
										
					listaJogos.add(jogo);
					
					
					jogo.setId(idJogo);
					
					idJogo++;
					
					break;
					
				case 6:
					
					jogo.remover(listaJogos);
						
					break;
					
				case 7:
					
					jogo.buscar(listaJogos);
				
					break;
					
				case 8:
					
					Promocoes promocao = new Promocoes();
					
					System.out.println("Digite uma opção");
					
					System.out.println("1 - Adicionar jogo na promoção");
					System.out.println("2 - Remover jogo da promoção");
					System.out.println("3 - Ver promoções");
					
					
					opcaoPromocao = TratamentoExcecao.lerInteiro();
					
					if(opcaoPromocao == 1) {
						
						
						promocao.adicionar();
						
						listaPromocoes.add(promocao);
						
						promocao.setId(idPromocao);
						
						idPromocao++;
						
						System.out.println("\nPromoção adicionada com sucesso");
						
					}
					else if(opcaoPromocao == 2) {
						
						promocao.remover(listaPromocoes);
						
					}
					else if(opcaoPromocao == 3) {
						
						for(int i = 0; i<listaPromocoes.size(); i++) {
							
							System.out.println(listaPromocoes.get(i).toString());
								
						}
						
					}
					else {
						System.out.println("Opção inválida");
					}
					
					break;
					
				case 9:
					
					System.out.println("Escolha a opção");
					
					System.out.println("1 - Adicionar jogo no ranking");
					System.out.println("2 - Remover jogo do ranking");
					System.out.println("3 - Visualizar Ranking");
					
					opcaoRanking = TratamentoExcecao.lerInteiro();
					
					if(opcaoRanking == 1) {
						
						jogo.adicionar();
						
						listaRanking.add(jogo);
						
						jogo.setId(idRanking);
						
						idRanking++;
					
						
					}
					else if(opcaoRanking == 2) {
						
						jogo.remover(listaRanking);
						
						
					}
					else if(opcaoRanking == 3) {
						
						jogo.verRanking(listaRanking);
						
					}
					else {
						System.out.println("Opção inválida");
					}
					
					
					break;
								
				case 10:
					
					Patrocinador patrocinador = new Patrocinador();
					
					System.out.println("Digite uma opção");
					
					System.out.println("1 - Adicionar patrocinador");
					System.out.println("2 - Remover patrocinador");
					System.out.println("3 - Ver todos patrocinadores");
					
					
					opcaoPatrocinador = TratamentoExcecao.lerInteiro();
					
					if(opcaoPatrocinador == 1) {
						
						
						patrocinador.adicionarPatrocinador();
						
						listaPatrocinadores.add(patrocinador);
						
						patrocinador.setId(idPatrocinador);
						
						idPatrocinador++;
						
						System.out.println("\nPatrocinador adicionado com sucesso");
						
					}
					else if(opcaoPatrocinador == 2) {
						
						patrocinador.removerPatrocinador(listaPatrocinadores);
						
						
					}
					else if(opcaoPatrocinador == 3) {
						for(int i = 0; i<listaPatrocinadores.size(); i++) {
							System.out.println(listaPatrocinadores.get(i).toString());
						}
					}
					else {
						System.out.println("Opção inválida");
					}
					
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
		
		
		System.out.println("1 - Adicionar Cliente"); 
		System.out.println("2 - Remover cliente"); 
		System.out.println("3 - Editar cliente" ); 
		System.out.println("4 - Consultar cliente"); 
		System.out.println("5 - Adicionar jogo na plataforma"); 
		System.out.println("6 - Remover jogo da plataforma"); 
		System.out.println("7 - Buscar jogo na plataforma"); 
		System.out.println("8 - Gerenciar promoções");	
		System.out.println("9 - Gerenciar ranking de jogos"); 
		System.out.println("10 - Gerenciar patrocinadores"); 
		System.out.println("0 - Sair\n");
		
	}
	

}
