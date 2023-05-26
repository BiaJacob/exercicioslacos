package LacoCondicional;

import java.util.Scanner;

public class lacoCodicionalSwitchItens {

	public static void main(String[] args) {
		
		int quantidade, codigo;
		double [] precos = {0.0, 10.00, 15.00, 18.00, 12.00, 8.00, 13.00};
		double valorTotal;
		String [] produtos = { "", "Cachorro Quente", "X-Salada", "x-Bacon",
								"Bauru", "Refrigerante", "Suco de laranja" };
		String nomeProduto;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o código do produto (de 1 a 6): ");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade comprada: ");
		quantidade = leia.nextInt();
		
		valorTotal = precos[codigo] * quantidade;
		nomeProduto = produtos[codigo];
		
		System.out.println("Produto comprado: " + nomeProduto);
		System.out.println("Valor total da conta: R$" + valorTotal);
		
		
		
		
		}
		
		
		
		

	}

