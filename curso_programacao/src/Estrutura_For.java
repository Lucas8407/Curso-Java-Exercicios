import java.util.Scanner;

public class Estrutura_For {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		 int N = sc.nextInt();
		for (int x=N; x > 0; x--) {
			System.out.println("Digite um número: ");
			int n = sc.nextInt();
			soma += n; 
			
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

