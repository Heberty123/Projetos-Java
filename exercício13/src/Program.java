import java.util.Scanner;

import Items.Products;
import benefits.Enum.typeBenefits;
import entities.Client;
import entities.Employee;
import entities.People;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] argc) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		List<People> people = new ArrayList<>();

		System.out.println("Company: Umbrella\n\n");
		
		System.out.print("write how many people do you want to type: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			
			System.out.println("#### People "+i+" ####");
			System.out.print("write the type of person to register (E- Employee, C- Client): ");
			char type = sc.next().charAt(0);
			
			if (type == 'E') {
				System.out.print("write name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("write age: ");
				int age = sc.nextInt();
				System.out.print("write wage: ");
				double wage = sc.nextDouble();
				
				
				System.out.print("\nwrite what's CLT of Employee: ");
				String clt = sc.next();
							
						
				System.out.print("\nwrite the products to buy(Warning: values of product doens't have to exceed the salary limit): ");

					System.out.println("Product:");
					System.out.print("write the name:");
					String namee = sc.next();
					System.out.print("write the price:");
					double price = sc.nextDouble();
					System.out.print("write the quantity:");
					int quantity = sc.nextInt();
					
					if(price*quantity > wage) {
						
						people.add(new Employee(name, age, wage, typeBenefits.valueOf(clt), null));
					} else {
						
						people.add(new Employee(name, age, wage, typeBenefits.valueOf(clt), new Products(namee, price, quantity)));

					}
					
					

				

			} else{
				
				System.out.print("write name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("write age: ");
				int age = sc.nextInt();
				System.out.print("write wage: ");
				double wage = sc.nextDouble();
									
				System.out.print("\nwrite the products to buy(Warning: values of product doens't have to exceed the salary limit): ");

					System.out.println("Product:");
					System.out.print("write the name:");
					String namee = sc.next();
					System.out.print("write the price:");
					double price = sc.nextDouble();
					System.out.print("write the quantity:");
					int quantity = sc.nextInt();
					
					
					if(price*quantity > wage) {
						
						people.add(new Client(name, age, wage, null));
					} else {
						
						people.add(new Client(namee, age, wage, new Products(namee, price, quantity)));

					}
				
			}
			
		}
		
		
		for(People am: people) {
			
			am.toString();
		}
		
		System.out.print("Cade vc !");
		
		sc.close();
	}
}
