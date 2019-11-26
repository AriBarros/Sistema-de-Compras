import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecao {
	
	private static Scanner input;

	public static int lerInteiro() {
		
		input = new Scanner(System.in);
		
		while (true) {
			
			try {
				int resultado = input.nextInt();
				return resultado;
				
			} 
			catch (InputMismatchException e) {
				System.out.println("Erro: Entrada inv�lida. Digite um n�mero inteiro para continuar.");
			} 
			finally {
				input.nextLine();
			}
		}
		
	}
	
	public static double lerDouble() {
		
		input = new Scanner(System.in);
		
		while (true) {
			try {
				double resultado = input.nextDouble();
				return resultado;
				
			} 
			catch (InputMismatchException e) {
				System.out.println("Erro: Entrada inv�lida.");
			} 
			finally {
				input.nextLine();
			}
		}
	}
	
}