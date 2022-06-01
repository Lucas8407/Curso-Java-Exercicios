package entities;

public class Funcionario 
{
	public String name;
	public double grossSalary;
	public double tax;
	
	
	
	public double NetSalary ()
	{
		
		return grossSalary - tax;
	}
	
	
	
	public double newSalary(double percentage) 
	{
		return (grossSalary * (percentage/100) + grossSalary) - tax;
		
	}
	
}
