package entities;

public class Product_Construtor 
{
	public String name;
	public double price;
	public int quantity;
	
	
	public Product_Construtor(String name, double price, int quantity) { //construtor. Obriga ao programador informar os dados
		this.name = name;
		this.price = price;
		this.quantity = quantity;}


	
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
