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


public class program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date moment = new Date();
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date: ");
		Date BirthDate = sdf.parse(sc.next());
		System.out.println("Enter order data: ");
		String status = sc.nextLine();
		
		Order order1 = new Order( moment, OrderStatus.valueOf(status), new Client(name, email, BirthDate) );
		

		
		
		System.out.print("How many items to this order ? ");
		int N = sc.nextInt();
		
		for (int n = 1; n <= N; n++) {
			
			System.out.println("Enter #" + n + " item data");
			System.out.println("Product name: ");
			String nameProduct = sc.next();
			System.out.println("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, new Product(nameProduct, priceProduct));
			order1.addItem(orderItem);
			
		}
		
		
		System.out.println("Order Summary: ");
		System.out.println(order1.ToString());
		
				
				
				
		sc.close();
	}
	


}
