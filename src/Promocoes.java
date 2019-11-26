import java.util.ArrayList;
import java.util.List;

public class Promocoes extends Jogo implements Funcionalidades  {

	private String data;
	
	@Override
	public void adicionar() {
		// TODO Auto-generated method stub
		System.out.println("Digite o nome do jogo");
		
		this.setNome(input.nextLine());
		
		System.out.println("Digite o preço do jogo");
		
		this.setPreco(TratamentoExcecao.lerDouble());
		
		
	}

	@Override
	public void remover(List<Jogo> listaJogos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscar(List<Jogo> listaJogos) {
		// TODO Auto-generated method stub
		
	}
	
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
