package application; // este exercicio tem como objetivo utilizar conceitos de construtores, encapsulamentos, sobrecarga, this, etc.

import java.util.Locale;
import java.util.Scanner;
import entities.Bank_Account;

public class Exercicio_Conta_Bancaria {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank_Account account;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder =sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response =='y') {
			System.out.println("Enter initial deposit value:  ");
			double initialDeposit = sc.nextDouble();
			account = new Bank_Account(number, holder, initialDeposit); // criado um construtor caso haja o valor de deposito
		}
		else {
			account = new Bank_Account(number, holder); // criado um segundo construtor caso não haja o valor
		}
		
		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println("Update data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		depositValue = sc.nextDouble();
		account.withdraw(depositValue);
		
		System.out.println();
		System.out.println("Update data:");
		System.out.println(account);
		
		
		
		
		sc.close();
	}

}
