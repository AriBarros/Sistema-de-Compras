import java.util.ArrayList;
import java.util.List;

public class Promocoes extends Jogo implements Funcionalidades  {

	@Override
	public void adicionar() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Digite o preço do jogo em promoção");
		this.setPreco(TratamentoExcecao.lerDouble());
		
	
		System.out.println("Jogo adicionado na promoção com sucesso");
		
	}

	@Override
	public void remover(List<Jogo> listaJogos) {
		// TODO Auto-generated method stub
		
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
				
				System.out.println("Nenhum jogo com esse índice");
				
			}
			else {
				
				System.out.println("Jogo removido com sucesso");
			
			}
				
			
		}
		
	}
	/*
	
	@Override
	public String toRank() {
		
		String string;
		
		string = "Id: " + getId() + "		Nome: " + getNome();
		string += "		Gênero: " + getGenero() + "		Preço em promoção: " + getPreco(); 
				
				
		return string;
	}
	*/
	
}
