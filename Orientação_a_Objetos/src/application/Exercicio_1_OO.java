package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Exercicio_1_OO {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo;
		retangulo = new Retangulo();
		
		
		System.out.println("Digite o valor da largura e da altura do triângulo respectivamente: ");
		retangulo.largura=sc.nextDouble();
		retangulo.altura=sc.nextDouble();
		
		System.out.println("Area: " + retangulo.area());
		System.out.println("Perimeter: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		sc.close();
		
	}

}
