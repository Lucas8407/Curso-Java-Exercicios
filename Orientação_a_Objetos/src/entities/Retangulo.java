package entities;

public class Retangulo 
{

	public double altura;
	public double largura;
	
	
	public double area() 
	{
		
		return altura*largura;
		
	}
	
	public double perimetro() 
	{
		return altura*2 + largura*2;
		
	}
	
	
	public double diagonal() 
	{
		
		double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
		return diagonal; 
	}
	
	
	
}
