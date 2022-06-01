package entities;

public class Product_Encapsulamento 
{
	private String name;
	private double price;
	private int quantity;
	
	//Possível gerar os contrutores e get/setters automaticamente pelo eclipse. botao direito no atributo - source - gerar construtores ou get/set
	
	public Product_Encapsulamento(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	}
	public Product_Encapsulamento(String name, double price) {
	this.name = name;
	this.price = price;
	}
	//Começa aqui a parte do encapsulamento para conseguir os dados
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public double getPrice() {
	return price;
	}
	public void setPrice(double price) {
	this.price = price;
	}
	public int getQuantity() {
	return quantity;
	} // termina aqui
	
	
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
