import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo implements Funcionalidades{

	private int id = 0;
	private String nome;
	private String descricao;
	private String genero;
	private double preco;

	Scanner input = new Scanner(System.in);
	
	@Override
	public void adicionar() {
		
		System.out.println("Digite o nome do jogo");
		this.setNome(input.nextLine());
		
		System.out.println("Escreva a descri��o do jogo");
		this.setDescricao(input.nextLine());
		
		System.out.println("Escreva o g�nero do jogo");
		this.setGenero(input.nextLine());
		
		System.out.println("Digite o pre�o do jogo");
		this.setPreco(TratamentoExcecao.lerDouble());
		
		System.out.println("\nJogo adicionado com sucesso!");
		
	
	}
	
	
	public void buscar(List<Jogo> listaJogos) {
		
		int opcao, numero, indice;
		
		System.out.println("Digite a op��o que deseja");
		
		System.out.println("1 - Ver todos os jogos");
		System.out.println("2 - Consultar jogo por �ndice");
		
		
		opcao = TratamentoExcecao.lerInteiro();
		
		if(opcao == 1) {
			
			for(int i = 0; i<listaJogos.size(); i++) {
				
					System.out.println(listaJogos.get(i).toString());
			}
			
		}
		else if(opcao == 2) {
			
			System.out.println("Digite o �ndice do jogo");
			
			numero = TratamentoExcecao.lerInteiro();
			
			indice = encontrarJogo(listaJogos, numero);
			if(indice == -1) return;
			
			
			System.out.println(listaJogos.get(indice).toString());
			
		}
		else {
			System.out.println("Op��o inv�lida");
		}
		
		
	}
	
	@Override
	public void remover(List<Jogo> listaJogos) {
		
		System.out.println("Digite o indice do jogo que deseja remover");
		
		int indice = TratamentoExcecao.lerInteiro();
		
		if(listaJogos.isEmpty()) {
			System.out.println("Nenhum jogo cadastrado");
		}
		else {
			
			int flag = 0;
			
			for(int i = 0; i < listaJogos.size(); i++) {
				
				if(listaJogos.get(i).getId() == indice) {
					
					listaJogos.remove(i);
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				
				System.out.println("Nenhum jogo com esse �ndice");
				
			}
			else {
				
				System.out.println("Jogo removido com sucesso");
			
			}
				
			
		}
		
		
	}
	
	public int encontrarJogo(List<Jogo> listaJogos, int numero) {
		
		
		int i, flag = 0;
		
		if(listaJogos.isEmpty()) {
			
			System.out.println("N�o h� jogos cadastrados");
			
			return -1;
		}
		
		for(i = 0; i<listaJogos.size(); i++) {
			
			if(listaJogos.get(i).getId() == numero) {
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1) {
			
			return i;
		}
		else {
			
			System.out.println("N�o h� jogo com esse �ndice");
			return -1;
		}
	}
	
	public void verRanking(List<Jogo> listaRanking) {
		
		int j = 1;
		
		System.out.println();
		
		for(int i = 0; i<listaRanking.size(); i++) {
			System.out.println("" + j + " - " + listaRanking.get(i).toRank());
			j++;
		}
		
	}
	
	public String toRank() {
		
		String string;
		
		string = "Nome: " + this.nome + "		G�nero: " + this.genero + "		Pre�o: " + this.preco;
		
		
		return string;
		
	}
		
	@Override
	public String toString() {
		
		String string;
		
		string = "Id: " + this.id + "		Nome do jogo: " + this.nome + "		Descri��o: " + this.descricao;
		string += "		G�nero: " + this.genero + "		Pre�o: " + this.preco;	
		
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
