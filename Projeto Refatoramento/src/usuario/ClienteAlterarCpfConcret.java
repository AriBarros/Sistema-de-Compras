package usuario;

import sistema.TratamentoExcecao;

public class ClienteAlterarCpfConcret extends UsuarioStrategy {

	@Override
	public void usuarioSeletor(Usuario usuario) {
		
		System.out.println("Digite o CPF do cliente");
		
		String cpf = input.nextLine();
		
		while(TratamentoExcecao.isCPF(cpf) == false) {
			
			System.out.println("Digite o CPF na formatacao correta");
			
			cpf = input.nextLine();
			
		}
		
		usuario.setCpf(cpf);
	
		System.out.println("\nCPF do cliente alterado com sucesso!\n");
		
	}

}
