import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		int num,horas;
		double salario,valor;

		
		
		System.out.println("Digite o número do funcionário: ");
		num = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("Digite o valor recebido por hora: ");
		valor = sc.nextDouble();
		salario = horas * valor;
		System.out.printf("Number = %d\n", num);
		System.out.printf("Salary = %.2f\n", salario);
		sc.close();
	}

}
