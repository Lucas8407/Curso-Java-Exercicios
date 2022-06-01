import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US); // ocorre erro quando troca o ponto pela virgula e vice versa dependendo da localização.
		Scanner sc = new Scanner(System.in); // declarar uma variavel do objeto Scanner;
		
		double x;
		char y;
		String a;
		int b;
		
		a = sc.next(); // para strings. Le apenas uma palavra
		b = sc.nextInt(); // para inteiros
		x = sc.nextDouble(); // para pontos flutuantes
		y = sc.next().charAt(0); // para caracteres
		
		System.out.printf("Você digitou: %.2f\n", x);
		System.out.printf("Você digitou: %c\n", y);
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}
