import java.util.Locale;

public class Main {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		int idade =10;
		double x = 10.998878;
		String nome = "Maria";
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		System.out.printf("A idade dela é %d\n",idade);
		System.out.printf("%.2f\n",x);
		System.out.println("Olá mundo!");
		System.out.println("RESULTADO = " + x + " METROS");
	}

}
