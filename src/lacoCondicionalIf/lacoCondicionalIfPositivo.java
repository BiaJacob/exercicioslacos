package lacoCondicionalIf;

import java.util.Scanner;

public class lacoCondicionalIfPositivo {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("O numero " + numero +" é par ");
		}
		else {
			System.out.print("O número " + numero + " é impar ");
				
		}
		
		if (numero >= 0) {
			System.out.println("e positivo!");
		}
		else { 
			System.out.println("e negativo!");
		}
		}

	}


