package usuario;

public class ClienteAlterarNomeConcret extends UsuarioStrategy {

	@Override
	public void usuarioSeletor(Usuario usuario) {
		
		System.out.println("Digite o nome do cliente");
		
		String nome = input.nextLine();
		
		usuario.setNome(nome);
		
		System.out.println("\nNome do cliente alterado com sucesso!\n");
		
	}
	
	
	

}
