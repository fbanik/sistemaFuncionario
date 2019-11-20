package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Nome do Funcionario");
		func.name = sc.nextLine();
		System.out.println("Salario Bruto");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor da taxa");
		func.taxa = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Funcionario " + func);
		System.out.println();
		System.out.println("Digite a taxa de aumento");
		double porcentagem = sc.nextDouble();
		func.increaseSalary(porcentagem);
		
		System.out.println();
		System.out.println("Salario Atualizado " + func);
		
		sc.close();
	}

}
