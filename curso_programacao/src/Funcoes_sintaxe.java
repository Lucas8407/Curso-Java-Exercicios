import java.util.Scanner;

public class Funcoes_sintaxe {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com 3 números: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int higher = max(a,b,c);
		showResult(higher);
		
		sc.close();
		
	}
	
	
	
	public static int max(int a, int b, int c) 
	{
		int abc;
		
		if (a > b && a > c) 
		{
			abc = a;
		}
		else if ( b > c) 
		{
			abc = b;
		}
		else 
		{
			abc =c;
		}
		return abc;
	}
	
	
	public static void showResult(int x) 
	{
		System.out.println("O maior numero é: " + x);
		
	}

}
