import java.util.Scanner;

public class exercicios_condicional {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		System.out.println("Digite outro número inteiro: ");
		y = sc.nextInt();
		
		
		if (x < y) 
		{
			
			if(y % x == 0)
				System.out.println("Múltiplos");
			else
				System.out.println("Não Múltiplos");
		}
			
		else 
			if(x % y == 0)
				System.out.println("Múltiplos");
			else
				System.out.println("Não Múltiplos");
				
		sc.close();
	}

	
		
}
