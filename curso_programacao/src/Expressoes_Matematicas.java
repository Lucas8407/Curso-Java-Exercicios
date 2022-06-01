
public class Expressoes_Matematicas {

	public static void main(String[] args) {
		
		double x =3;
		double y = 4.0;

		
		double A, B, C;
		
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		
		
		System.out.println("Raiz quadrade de " + x +  " é: " + A);
		System.out.println("Raiz quadrade de " + y +  " é: " + B);
		System.out.println("Raiz quadrade de 25 é: " + C);
		
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5, 2.0);
		
		System.out.println(x + " elevado a " + y + " é igual a " + A);
		System.out.println(x + " elevado ao quadrado é igual a " + B);
		System.out.println("Cinco elevado ao quadrado é igual a " + C);
		

	}

}
