import java.util.Scanner;

public class Entrada_de_Dados_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine(); // nextline le at� o enter ou quebra de linha
		
		System.out.println("DADOS DIGITADOS:");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
