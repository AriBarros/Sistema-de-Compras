import java.util.Scanner;

public abstract class Patrocinadores {

	
		private int id = 0;
		private String nome;
		private String email;
		
		static Scanner input = new Scanner(System.in);
		

		public void adicionarPatrocinador() {
			
			System.out.println("Digite o nome do patrocinador");
			
			this.setNome(input.nextLine());
			
			System.out.println("Digite o email do patrocinador");
			
			this.setEmail(input.nextLine());
			
		}
		
		public void removerPatrocinador() {
			
			
		}
		
		public void editarPatrocinador() {
			
			
			
		}
		
	
		
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
