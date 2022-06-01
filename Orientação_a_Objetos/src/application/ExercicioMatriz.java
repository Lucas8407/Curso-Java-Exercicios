package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) 
	
	{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas e colunas da matrix respectivamente: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		
		int [][] matrix = new int [m][n];
		
		System.out.println("Digite abaixo os valores da matriz: ");
		
		for (int i =0; i < matrix.length; i ++) 
		{
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Digite um número X que pertença a matrix: ");
		int x =sc.nextInt();
		
		while(existeMatriz(matrix, x) == false) {
			System.out.println("Esse número não pertence a matriz. Digite novamente");
			x = sc.nextInt();
		}
		
		
		for (int i =0; i < matrix.length; i ++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]	== x) {
					System.out.println("Postion: " + i + ", " + j );
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);}
					if (i > 0) {
						System.out.println("Top: " + matrix[i-1][j]);}
					if (j < matrix[i].length - 1) {
						System.out.println("Right " + matrix[i][j+1]);}
					if (i < matrix.length - 1) {
						System.out.println("Bottom " + matrix[i+1][j]);}}
			}
		}
		
		
		
		
		
		
		sc.close();

	}

	public static boolean existeMatriz (int [][] matrix, int x) {
		for (int i =0; i < matrix.length; i ++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]	== x)
					return true;
			}
		}
		return false;
	}
	
}
