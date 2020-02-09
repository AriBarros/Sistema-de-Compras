package sistema;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import data.PromocaoSingleton;
import data.UsuarioSingleton;
import usuario.Usuario;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static int opcaoAdministrador, opcao, opcaoPatrocinador, opcaoRanking, opcaoPromocao, indiceJogo, indiceRanking;
	static String login, senha;
	static int idJogo = 0, idPatrocinador = 0, idRanking = 0, idPromocao = 0;
	

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		
		//Padrão Singleton
		UsuarioSingleton usuario = UsuarioSingleton.getInstance();
		PromocaoSingleton promocao = PromocaoSingleton.getInstance();
		
			
		List<Jogo> listaJogos = new ArrayList<Jogo>();
		List<Jogo> listaRanking = new ArrayList<Jogo>();
		List<Patrocinador> listaPatrocinadores = new ArrayList<Patrocinador>();
		
		

		do {
			
			System.out.println("\nInforme o login e a senha para entrar no sistema\n");
			System.out.print("Login: ");
			
			login = input.nextLine();
			
			System.out.print("Senha: ");
			
			senha = input.nextLine();
			
			if(!usuario.getUsuario().verificarLogin(login) && usuario.getUsuario().verificarSenha(senha)) {
				System.out.println("Login incorreto");
			}
			else if(usuario.getUsuario().verificarLogin(login) && !usuario.getUsuario().verificarSenha(senha)) {
				System.out.println("Senha incorreta");
			}
			else if(!(usuario.getUsuario().verificarLogin(login) && usuario.getUsuario().verificarSenha(senha))) {
				System.out.println("Login e senha incorretos");
			}
			
			
		}
		while(!(usuario.getUsuario().verificarLogin(login) && usuario.getUsuario().verificarSenha(senha))); 
		
		
		
		while(true) {
			
			//Instanciando aqui pois deve instanciar para acessar a função, se não sobrescreve nos outros ids
			Jogo jogo = new Jogo();
			
			menu();
			
			opcao = TratamentoExcecao.lerInteiro();
			
			switch(opcao) {
			
				case 1: 
					
					cliente.adicionar();
						
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
					
					
					promocao.setPromocao();
					
					System.out.println("Digite uma opção");
					
					System.out.println("1 - Adicionar jogo na promoções");
					System.out.println("2 - Remover jogo da promoções");
					System.out.println("3 - Ver promoções");
					
					
					opcaoPromocao = TratamentoExcecao.lerInteiro();
					
					if(opcaoPromocao == 1) {
						
						System.out.println("Digite o índice do jogo que deseja colocar em promoção");
						
						indiceJogo = TratamentoExcecao.lerInteiro();
						
						int aux = jogo.encontrarJogo(listaJogos, indiceJogo);
						
						if(aux == -1) break;
						
						promocao.getPromocao().setNome(listaJogos.get(indiceJogo).getNome());
						promocao.getPromocao().setGenero(listaJogos.get(indiceJogo).getGenero());
					
							
						promocao.getPromocao().adicionar();
						
						promocao.listaPromocoes.add(promocao.getPromocao());
						
						promocao.getPromocao().setId(idPromocao);
						
						idPromocao++;
						
						
					}
					else if(opcaoPromocao == 2) {
						
						promocao.getPromocao().remover(promocao.listaPromocoes);
						
					}
					else if(opcaoPromocao == 3) {
						
						for(int i = 0; i<promocao.listaPromocoes.size(); i++) {
							
							System.out.println(promocao.listaPromocoes.get(i).toRank());
								
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
						
						System.out.println("Digite o índice do jogo que deseja colocar no ranking");
						
						indiceRanking = TratamentoExcecao.lerInteiro();
						
						int aux = jogo.encontrarJogo(listaJogos, indiceRanking);
						
						if(aux == -1) break;
						
						
						jogo.setNome(listaJogos.get(indiceRanking).getNome());
						jogo.setGenero(listaJogos.get(indiceRanking).getGenero());
						jogo.setPreco(listaJogos.get(indiceRanking).getPreco());
						
						listaRanking.add(jogo);
						
						
						jogo.setId(idRanking);
						
						idRanking++;
						
						System.out.println("Jogo adicionado no ranking com sucesso!");
					
						
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
					
					Usuario patrocinador = new Patrocinador();
					Patrocinador patrocinador1 = new Patrocinador();
					
					System.out.println("Digite uma opção");
					
					System.out.println("1 - Adicionar patrocinador");
					System.out.println("2 - Remover patrocinador");
					System.out.println("3 - Ver todos patrocinadores");
					
					
					opcaoPatrocinador = TratamentoExcecao.lerInteiro();
					
					if(opcaoPatrocinador == 1) {
						
						
						patrocinador.adicionar();
						
						listaPatrocinadores.add((Patrocinador) patrocinador);
						
						patrocinador.setId(idPatrocinador);
						
						idPatrocinador++;
						
						System.out.println("\nPatrocinador adicionado com sucesso");
						
					}
					else if(opcaoPatrocinador == 2) {
						
						patrocinador1.removerPatrocinador(listaPatrocinadores);
						
						
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
		
		System.out.println("\n\n-----º Sistema para gerenciamento de compra de jogos º-----\n");
		
		
		System.out.println("Escolha a opcao que deseja: \n");
		
		
		System.out.println("1 - Adicionar cliente"); 
		System.out.println("2 - Remover cliente"); 
		System.out.println("3 - Editar cliente" ); 
		System.out.println("4 - Consultar cliente"); 
		System.out.println("5 - Adicionar jogo na plataforma"); 
		System.out.println("6 - Remover jogo da plataforma"); 
		System.out.println("7 - Buscar jogo na plataforma"); 
		System.out.println("8 - Gerenciar promocoes");	
		System.out.println("9 - Gerenciar ranking de jogos"); 
		System.out.println("10 - Gerenciar patrocinadores"); 
		System.out.println("0 - Sair\n");
		
	}
	

}
