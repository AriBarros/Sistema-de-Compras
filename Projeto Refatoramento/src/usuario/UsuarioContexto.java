package usuario;

import sistema.TratamentoExcecao;

public class UsuarioContexto {
	
	private UsuarioStrategy usuarioStrategy = null;
   
	public void configurarUsuario(Usuario usuario) {
        getUsuarioStrategy().usuarioSeletor(usuario);
    }
 
    public UsuarioStrategy getUsuarioStrategy() {
        return this.usuarioStrategy;
    }

    public void setUsuarioStrategy(UsuarioStrategy usuarioStrategy) {
        if (usuarioStrategy == null) return;
        this.usuarioStrategy = usuarioStrategy;
    }

    public void limparUsuarioContexto(){
        this.usuarioStrategy = null;
    }
 
    public void startUsuarioStrategy(int opcao, Usuario usuario) {
    	
    	switch(opcao) {
		
			case 1:
				
				setUsuarioStrategy(new ClienteAlterarNomeConcret());
		
				break;
			
			
			case 2:
				
				setUsuarioStrategy(new ClienteAlterarSenhaConcret());
				
				break;
			
			case 3:
				
				setUsuarioStrategy(new ClienteAlterarCpfConcret());
				
				break;
				
			case 4:
				
				setUsuarioStrategy(new ClienteAlterarEmailConcret());
			
				break;
				
			case 5:
				
				setUsuarioStrategy(new ClienteAlterarIdadeConcret());
				
				break;
				
			}
    	
    	configurarUsuario(usuario);
    	limparUsuarioContexto();
    	
    	
    }
	
}
