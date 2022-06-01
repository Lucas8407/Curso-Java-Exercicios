package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio_3_OO {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter with name's student: ");
		student.name=sc.nextLine();
		System.out.println("Enter with student's grades: ");
		student.n1 =sc.nextDouble();
		student.n2 =sc.nextDouble();
		student.n3 =sc.nextDouble();
		
		student.result();
		
		
		
		sc.close();
	}

}
