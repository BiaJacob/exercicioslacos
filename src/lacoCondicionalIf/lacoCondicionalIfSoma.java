package lacoCondicionalIf;

import java.util.Scanner;

public class lacoCondicionalIfSoma {

	public static void main(String[] args) {

		int numeroA, numeroB, numeroC, soma;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		System.out.println("Digite o número B: ");
		numeroB = leia.nextInt();
		System.out.println("Digite o número C: ");
		numeroC = leia.nextInt();
		
		soma = numeroA+numeroB;
		
		if (soma > numeroC) {
			System.out.println("A soma de  A + B é MAIOR do que C.");
			
		}else if (soma < numeroC) {
			System.out.println("A soma de A + B é MENOR do que C");
			
		}else {
			System.out.println ("A + B é IGUAL a C.");
			
		}
		

	}

}
