package data;

import java.util.ArrayList;
import java.util.List;

import sistema.Cliente;
import sistema.Jogo;
import sistema.Promocoes;
import sistema.Usuario;

public class PromocaoSingleton {
	
	private static PromocaoSingleton single_instance = null;

	Promocoes promocao = new Promocoes();
	public List<Jogo> listaPromocoes = new ArrayList<Jogo>();
	
	
	private PromocaoSingleton() { 
	        
	 }
	
	public static PromocaoSingleton getInstance() {

		if (single_instance == null) {
			single_instance = new PromocaoSingleton();
		}
		return single_instance;
	}

	public Promocoes getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocoes promocao) {
		this.promocao = promocao;
	}
	
}
