package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		
		List<Contribuinte> list = new ArrayList<>();
		
		for(int i =1; i <=n ; i++) {
			
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, income, gastosSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int numeroFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(name, income, numeroFuncionario));
			}
	
		}
		
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(Contribuinte c : list) {
			sum += c.calculoImposto();
			System.out.print(c.getName() + ": $ " + String.format("%.2f\n", c.calculoImposto()));
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		
		
		
		sc.close();

	}

}
