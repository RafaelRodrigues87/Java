package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import etities.enums.OrderStatus;

public class order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private client client;
	
	private List<Orderitem> items = new ArrayList<>();

	
	public order() {
		
	}


	public order(Date moment, OrderStatus satus, entities.client client) {
		super();
		this.moment = moment;
		this.status = satus;
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


	public void setStatus(OrderStatus satus) {
		this.status = satus;
	}


	public client getClient() {
		return client;
	}


	public void setClient(client client) {
		this.client = client;
	}

	public void additem(Orderitem item) {
		items.add(item);
	}
	public void RemoveItem(Orderitem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(Orderitem it : items) {
			sum += it.Subtotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (Orderitem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	
	
	}
}
