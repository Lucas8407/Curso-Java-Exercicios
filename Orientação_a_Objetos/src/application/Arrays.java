package application;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor N");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma =0;
		
		for (int i =0; i < n; i++) 
		{
			System.out.println("Digite o valor da altura da " + (i + 1) + " pessoa"); 
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.printf("O valo da média é %.2f", soma / n);
		
		
		sc.close();
	}

}
