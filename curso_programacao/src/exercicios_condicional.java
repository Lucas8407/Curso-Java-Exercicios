import java.util.Scanner;

public class exercicios_condicional {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Digite um n�mero inteiro: ");
		x = sc.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		y = sc.nextInt();
		
		
		if (x < y) 
		{
			
			if(y % x == 0)
				System.out.println("M�ltiplos");
			else
				System.out.println("N�o M�ltiplos");
		}
			
		else 
			if(x % y == 0)
				System.out.println("M�ltiplos");
			else
				System.out.println("N�o M�ltiplos");
				
		sc.close();
	}

	
		
}
