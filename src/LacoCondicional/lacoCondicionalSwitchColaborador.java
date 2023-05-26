package LacoCondicional;

import java.util.Scanner;

public class lacoCondicionalSwitchColaborador {

	public static void main(String[] args) {
		
		String nome,cargo;
		int codigoCargo;
		float salario;
		double salarioAtual = 0;
				
		Scanner leia = new Scanner (System.in);

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite código do Cargo( de 1 a 6): ");
		codigoCargo = leia.nextInt();
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		switch (codigoCargo) {
		
		case 1: 
			cargo = "Gerente";
			salarioAtual = salario +(salario*0.10); 
			
			break;
		case 2: 
			cargo = "Vendedor";
			salarioAtual = salario +(salario*0.07);
			break;
		case 3: 
			cargo = "Supervisor";
			salarioAtual = salario +(salario*0.09);
			break;
		case 4: 
			cargo = "Motorista";
			salarioAtual = salario +(salario*0.06);
			break;
		case 5: 
			cargo = "Estoquista";
			salarioAtual = salario +(salario*0.05);
			break;
		case 6: 
			cargo = "Técnico de TI";
			salarioAtual = salario +(salario*0.08);
			break;
		default: cargo = "Código de cargo inválido";
		break;
		}
		System.out.println("Nome do Colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + salarioAtual);
		
		
		
			
		}
		
	}


