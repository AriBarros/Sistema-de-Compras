import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

	private int id = 0;
	private String nome;
	private String descricao;
	private String genero;
	private double preco;
	
	Scanner input = new Scanner(System.in);
	
	
	public void adicionarJogo() {
		
		System.out.println("Digite o nome do jogo");
		this.setNome(input.nextLine());
		
		System.out.println("Escreva a descrição do jogo");
		this.setDescricao(input.nextLine());
		
		System.out.println("Escreva o gênero do jogo");
		this.setGenero(input.nextLine());
		
		System.out.println("Digite o preço do jogo");
		this.setPreco(input.nextDouble());
		
		input.nextLine();
		
	
	}
	
	void buscarJogo() {
		
		
	}
	
	void removerJogo(List<Jogo> listaJogos) {
		
		System.out.println("Digite o indice do jogo que deseja remover");
		
		int indice = input.nextInt();
		input.nextLine();
		
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
				
				System.out.println("Nenhum jogo com esse índice");
				
			}
			else {
				
				System.out.println("jogo removido com sucesso");
			
			}
				
			
		}
		
		
		for(int i = 0; i<listaJogos.size(); i++) {
			System.out.println(listaJogos.get(i).toString());
		}
		
		
	}
	
	
	
	

	@Override
	public String toString() {
		
		String string;
		
		string = "Id: " + this.id + "		Nome do jogo: " + this.nome + "		Descrição: " + this.descricao;
		string += "		Gênero: " + this.genero + "		Preço: " + this.preco;	
		
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
