package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio_2_OO {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.name= sc.nextLine();
		System.out.println("Digite o salario bruto do funcion�rio: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		funcionario.tax = sc.nextDouble();
		
		
		System.out.printf("Employee: %s , $ %.2f", funcionario.name, funcionario.NetSalary());
		System.out.println();
		System.out.println("Which percentage to increase the salary? ");
		double percentage = sc.nextDouble();
		System.out.printf("Updata Data: %s , $ %.2f", funcionario.name, funcionario.newSalary(percentage));
		


		sc.close();
	}

}
