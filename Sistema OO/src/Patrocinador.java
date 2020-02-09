import java.util.List;
import java.util.Scanner;

public class Patrocinador extends Usuario {

		private int idPatrocinador = 0;
		private String empresa;
		
		static Scanner input = new Scanner(System.in);
		
		Usuario usuario = new Usuario();
		
		public void adicionarPatrocinador() {
			
			System.out.println("Digite o nome do patrocinador");
			
			usuario.setNome(input.nextLine());
			
			System.out.println("Digite o nome da empresa");
			
			this.setEmpresa(input.nextLine());
			
			System.out.println("Digite o email do patrocinador");
			
			usuario.setEmail(input.nextLine());
			
		}
		
		public void removerPatrocinador(List<Patrocinador> listaPatrocinadores) {
			
			
			System.out.println("Digite o indice do patrocinador que deseja remover");
			
			int indice = TratamentoExcecao.lerInteiro();
			
			if(listaPatrocinadores.isEmpty()) {
				System.out.println("Nenhum patrocinador cadastrado");
			}
			else {
				
				int flag = 0;
				
				for(int i = 0; i < listaPatrocinadores.size(); i++) {
					
					if(listaPatrocinadores.get(i).getId() == indice) {
						
						listaPatrocinadores.remove(i);
						flag = 1;
						break;
					}
				}
				
				if(flag == 0) {
					
					System.out.println("Nenhum patrocinador com esse índice");
					
				}
				else {
					
					System.out.println("Patrocinador removido com sucesso");
				
				}
					
				
			}
				
			
		}
		
		
		@Override
		public String toString() {
			
			String string;
			
			string = "Id: " + this.idPatrocinador + "		Nome: " + usuario.getNome(); 
			string += "		Empresa: " + this.empresa + "		E-mail: " + usuario.getEmail();
	
			return string;
			
		}
	
		
		
		
		public int getId() {
			return idPatrocinador;
		}

		public void setId(int id) {
			this.idPatrocinador = id;
		}

		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

}
