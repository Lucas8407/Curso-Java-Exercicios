import java.util.Scanner;


public class Exercicio_while_2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float x=1,y=1;
		while (x != 0 && y != 0) 
		{
		System.out.println("Digite o valor da coordenada X: ");
		x = sc.nextFloat();
		System.out.println("Digite o valor da coordenada Y: ");
		y = sc.nextFloat();
		
		if (x > 0 && y > 0)
			System.out.printf("O número se encontra no primeiro quadrante\n\n");
		else if (x < 0 && y > 0)
			System.out.printf("O número se encontra no segundo quadrante\n\n");
		else if (x < 0 && y < 0)
			System.out.printf("O número se encontra no terceiro quadrante\n\n");
		else if (x > 0 && y < 0)
			System.out.printf("O número se encontra no quarto quadrante\n\n");
		else
			System.out.println("");

		}
		
		sc.close();

	}

}
