import java.util.Scanner;


public class Exercicio_While_3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int opcao=0;
		int alcool=0;
		int gasolina =0;
		int diesel =0;
		while (opcao != 4) {
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println(" 1 - Alcool");
		System.out.println(" 2 - Gasolina");
		System.out.println(" 3 - Diesel");
		System.out.println(" 4 - Fim");
		opcao = sc.nextInt();
		
		
		switch(opcao)
		{
		case 1:
			alcool+=1;
			break;
		case 2:
			gasolina+=1;
			break;
		case 3:
			diesel+=1;
			break;
		case 4:
			System.out.println("Muito Obrigado");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
			break;
		default:
			System.out.println("Valor inválido.\n\n");
		}
		
		}
		sc.close();

	}

}
