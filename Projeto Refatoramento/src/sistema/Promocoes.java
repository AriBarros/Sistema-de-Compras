package sistema;
import java.util.ArrayList;
import java.util.List;

public class Promocoes extends Jogo implements Funcionalidades  {

	@Override
	public void adicionar() {
		
		System.out.println("Digite o pre�o do jogo em promo��o");
		this.setPreco(TratamentoExcecao.lerDouble());
		
	
		System.out.println("Jogo adicionado na promo��o com sucesso");
		
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
	
	
}
