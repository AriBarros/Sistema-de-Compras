import java.util.List;
import java.util.Scanner;

public class Patrocinador {

		private int id = 0;
		private String nome;
		private String empresa;
		private String email;
		
		static Scanner input = new Scanner(System.in);
		

		public void adicionarPatrocinador() {
			
			System.out.println("Digite o nome do patrocinador");
			
			this.setNome(input.nextLine());
			
			System.out.println("Digite o nome da empresa");
			
			this.setEmpresa(input.nextLine());
			
			System.out.println("Digite o email do patrocinador");
			
			this.setEmail(input.nextLine());
			
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
			
			string = "Id: " + this.id + "		Nome: " + this.nome; 
			string += "		Empresa: " + this.empresa + "		E-mail: " + this.email;
	
			return string;
			
		}
	
		
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
