import java.util.Scanner;

public class Proglema1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double plano = 50;
		int minutos;
		System.out.println("Digite a quantidade de minutos: ");
		minutos =sc.nextInt();
		
		if (minutos <= 100)
			System.out.println("O valor a pagar será " + plano + " reais.");
		else {
			plano += (minutos - 100) * 2;
			System.out.printf("O valor a pagar será %.2f reais", plano);}
		
		sc.close();

	}

}
