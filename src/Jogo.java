import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Jogo {

	private String nome;
	private String descricao;
	private String genero;
	private double preco;
	
	Scanner input = new Scanner(System.in);
	List<Jogo> listaJogos= new ArrayList<>();

	
	public void adicionarJogo() {
		
		//Jogo jogo = new Jogo();
		
		System.out.println("Digite o nome do jogo");
		nome = input.nextLine();
		
		System.out.println("Escreva a descrição do jogo");
		descricao = input.nextLine();
		
		System.out.println("Escreva o gênero do jogo");
		genero = input.nextLine();
		
		System.out.println("Digite o preço do jogo");
		preco = input.nextDouble();
		
		//listaJogos.add(jogo);		
	
	}
	
	void verificarJogo() {
		
		
	}
	
	void removerJogo() {
		
		
	}

}
