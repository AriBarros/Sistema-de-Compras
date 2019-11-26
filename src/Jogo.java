import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

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
	
	}
	
	void verificarJogo() {
		
		
	}
	
	void removerJogo() {
		
		
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
