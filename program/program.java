package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Orderitem;
import entities.client;
import entities.order;
import entities.product;
import etities.enums.OrderStatus;


public class program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data");
		System.out.print("name: ");
		String nome = scanner.next();
		System.out.print("email: ");
		scanner.nextLine();
		String email = scanner.next();
		System.out.print("Birth date (DD/MM/YYY: ");
		Date BirthDate = sdf.parse(scanner.next());
		
		client client = new client (nome, email, BirthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("status :");
		OrderStatus status = OrderStatus.valueOf(scanner.next());
		
		System.out.print("How many irem to this order? ");
		int n = scanner.nextInt();
		
		order order = new order(new Date(), status, client);
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Enter  #" + (i+1) + " item data:"  );
			
			System.out.print("product name: ");
			scanner.nextLine();
			String name = scanner.next();
			System.out.print("product price: ");
			Double price = scanner.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = scanner.nextInt();	
			
			product product = new product (name, price);
			Orderitem orderitem = new Orderitem (quantity, price, product);
			
			order.additem(orderitem);
		}
		System.out.println("ORDER SUMARY:");
		System.out.print(order);
		
		
		
		
		
		scanner.close();
	}

}
