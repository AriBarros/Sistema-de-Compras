package usuario;

import sistema.TratamentoExcecao;

public class ClienteAlterarIdadeConcret extends UsuarioStrategy{

	@Override
	public void usuarioSeletor(Usuario usuario) {

		System.out.println("Digite a idade do cliente");
		
		int idade = TratamentoExcecao.lerInteiro();
		
		usuario.setIdade(idade);
		
		System.out.println("\nIdade do cliente alterada com sucesso");
		
		
	}

}
