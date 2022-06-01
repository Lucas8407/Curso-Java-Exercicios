import java.util.Scanner;

public class Exercicios_while {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		int tentativas =1;
		
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			
			System.out.println("Senha inválida. Digite novamente: ");
			senha = sc.nextInt();
			tentativas += 1;
			if (tentativas >= 5) {
				System.out.println("Tentativas máximas atingidas. Acesso bloqueado por 1 hora");
				senha = 2002;
			}
		}
		
		if (senha ==2002 && tentativas < 5)
			System.out.println("Acesso permitido!");
		
		sc.close();
		

	}

}
