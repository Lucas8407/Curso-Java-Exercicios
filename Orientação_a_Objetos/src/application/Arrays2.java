package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos_Arrays;

public class Arrays2 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor N");
		int n = sc.nextInt();
		Produtos_Arrays[] vect = new Produtos_Arrays[n];
		
		
		for (int i =0; i < vect.length; i++) // vecth.lenght determina o tamanho do vetor
		{
			sc.nextLine();
			String nome = sc.nextLine();
			double preco =sc.nextDouble();
			vect[i] = new Produtos_Arrays(nome, preco);	
		}
		
		double sum =0.0;
		for (int i=0; i < n; i++) 
		{
			sum += vect[i].getPreco();
			
		}
		
		
		double avg = sum / n; 
		
		System.out.printf("Preco medio é %.2f", avg);
		
		
		
		sc.close();
	}

}
