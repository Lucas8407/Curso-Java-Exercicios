package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Composicao_Exercicio {

	public static void main(String[] args) throws ParseException 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		
		
		System.out.println("Enter order Data: ");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order?");
		int quantityOrder = sc.nextInt();
		
		sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		for(int i = 0; i < quantityOrder; i++) {
			
			System.out.println("Enter # " + (i+1) + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantityProduct = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantityProduct, productPrice, new Product(nameProduct, productPrice));  //ATENÇÃO: AQUI O PROFESSOR INSTACIOU O PRODUTO LOGO ACIMA E NÃO DIRETAMENTE NO CONSTRUTOR COMO EU FIZ. NÃO SEI SE MEU METODO ESTÁ CORRETO
			order.addlistaItem(orderItem);
			
		}
		System.out.println("\n");
		
		System.out.println("ORDER SUMMARY: \n");
		
		System.out.println(order);
		
		
		
		
		sc.close();

	}

}
