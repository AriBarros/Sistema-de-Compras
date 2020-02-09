package sistema;
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
				System.out.println("Erro: Entrada inválida. Digite um número inteiro para continuar.");
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
				System.out.println("Erro: Entrada inválida.");
			} 
			finally {
				input.nextLine();
			}
		}
	}
	
	public static boolean isCPF(String CPF) {
		
		// considera erro no CPF por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") ||
			CPF.equals("11111111111") ||
			CPF.equals("22222222222") || CPF.equals("33333333333") ||
			CPF.equals("44444444444") || CPF.equals("55555555555") ||
			CPF.equals("66666666666") || CPF.equals("77777777777") ||
			CPF.equals("88888888888") || CPF.equals("99999999999") ||
			(CPF.length() != 11))
			
			return (false);
		
		char dig10, dig11;
		
		int sm, i, r, num, peso;
		
		try {
			
			//calculo do primeiro digito v.
			
			sm = 0;
			peso = 10;
			
			for(i=0; i<9; i++) {
				
				//converte o i-esimo caractere do cpf em um numero
				//ex: caractere '0' = inteiro 0
				//sendo 48 = 0 na tabela ASCII
				
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
				
			
			}
			
			r = 11 - (sm % 11);
			if((r == 10) || (r == 11)) dig10 = '0';
			else dig10 = (char)(r+48); // converte no respectivo caracter numerico
			
			
			
			//calculo do segundo digito v.
			
			sm = 0;
			peso = 11;
			
			for(i = 0; i<10; i++) {
				
				num = (int)(CPF.charAt(i) - 48);
				sm = sm + (num*peso);
				peso = peso - 1;
				
			}
			
			r = 11 - (sm % 11);
			if((r == 10) || (r == 11)) dig11 = '0';
			else dig11 = (char)(r+48);
			
			
			//verifica se os digitos calculados conferem com os digitos informados
			if((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) return (true);
			else return (false);
			
			
		} catch(InputMismatchException erro) {
			return(false);
		}
			
	}
	
}