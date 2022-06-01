package entities;

public class Product 
{
	public String name;
	public double price;
	public int quantity;
	

	public double totalValueInStock() 
	{
		
		return price*quantity;
		
	}
	
	public void addProducts(int quantity) 
	{
		this.quantity += quantity; // o this referencia o atributo da classe para nao causar ambiguidade com o parametro da função. 
		
	}
	
	
	public void removeProducts(int quantity) 
	{
		
		this.quantity -= quantity;
		
	}
	
	
	public String toString() 
	{
		
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+" units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
		
	}
	
	
	
	
	
}
