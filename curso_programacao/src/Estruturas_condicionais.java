import java.util.Scanner;

public class Estruturas_condicionais {

	public static void main(String[] args)
	{
		int x;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();
		
		if (x < 12) 
		{
			System.out.println("Bom dia");
		}
		else 
		{
			if (x > 12 && x < 18)
				System.out.println("Boa tarde");
			else
				System.out.println("Boa noite");	
		}
		
		
		sc.close();
		
	}

}
