package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	List <OrderItem> listaItem = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getlistaItem() {
		return listaItem;
	}

	
	public void addlistaItem (OrderItem item) {
		listaItem.add(item);
	}
	
	public void removelistaItem (OrderItem item) {
		listaItem.remove(item);
	}
	
	
	public Double total() {
		double sum = 0.0;
		for(OrderItem i : listaItem) {
			sum += i.subTotal();
		}
		
		return sum;
	}
	
	
	
	public String toString () {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		for(OrderItem i : listaItem) {
		sb.append(i);}
		sb.append("\n");
		sb.append("Total Price: $" + String.format("%.2f", total()));
		
		
		return sb.toString();
	}
	
}
