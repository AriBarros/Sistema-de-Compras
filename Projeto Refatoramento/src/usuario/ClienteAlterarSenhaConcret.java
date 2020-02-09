package usuario;

public class ClienteAlterarSenhaConcret extends UsuarioStrategy  {

	@Override
	public void usuarioSeletor(Usuario usuario) {
	
		System.out.println("Digite a nova senha do cliente");
		
		String senha = input.nextLine();
		
		usuario.setSenha(senha);
		
		System.out.println("\nSenha do cliente alterada com sucesso!\n");	
		
	}
	
	
}
