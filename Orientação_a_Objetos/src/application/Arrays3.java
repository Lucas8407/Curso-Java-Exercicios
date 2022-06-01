package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Arrays3 {

	public static void main(String[] args) 
	{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluguel[] quarto = new Aluguel[10];
		
		
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i =1; i <= n; i++) 
		{
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int num = sc.nextInt();
			quarto [num] = new Aluguel(name,email,num);
			sc.nextLine();
		}
		
		
		System.out.println("Busy rooms");
		System.out.println();
		
		for (int i =0; i < 10; i++) 
		{
			if (quarto[i] != null) 
			{
				
			System.out.println(i +  ": " + quarto[i].getName() + ", " + quarto[i].getEmail());
			
			}
		}
		
		
		sc.close();
	}

}




