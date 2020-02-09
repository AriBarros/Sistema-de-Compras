package usuario;

public class ClienteAlterarEmailConcret extends UsuarioStrategy {

	@Override
	public void usuarioSeletor(Usuario usuario) {
		
		System.out.println("Digite o e-mail do cliente");
		
		String email = input.nextLine();
		
		usuario.setEmail(email);
		
		System.out.println("\nE-mail do cliente alterado com sucesso!\n");
		
	}

}
