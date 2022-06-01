package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
/*Resolvendo o problema sem OO*/
public class OO1 {

	public static void main(String[] args) 
	{
		
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	Triangle x,y;
	x = new Triangle();
	y = new Triangle();
	
	
	System.out.println("Digite o valor do lados do triângulo X: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	double xArea = x.area();
	
	System.out.println("Digite o valor do lados do triângulo Y: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	double yArea = y.area();
	
	String trianguloMaior;
	
	
	if(xArea > yArea)
		trianguloMaior = "X";
	else if (xArea < yArea)
		trianguloMaior = "Y";
	else
		trianguloMaior = " Os triângulos são iguais.";
	
	
	System.out.printf("O valor da aréa do triângulo X é %.2f\nO valor da area do triangulo Y é %.2f\nO triangulo que possui a maior area é o %s",
			xArea, yArea,trianguloMaior);
	
	
	sc.close();

	}

}

