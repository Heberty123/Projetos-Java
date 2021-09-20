import java.util.Scanner;

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
				
				people.add(new Employee(name, age, wage));
				
				
				System.out.print("\nwrite how many products you want to buy: ");
				int number = sc.nextInt();
				for(int z = 1; z <= number ; z++) {
					System.out.println("Product "+z+":");
					System.out.print("write the name:");
					String namee = sc.next();
					System.out.print("write the price:");
					double price = sc.nextDouble();
					System.out.print("write the quantity:");
					int quantity = sc.nextInt();
					
					people.get(i).Buy(namee, price, quantity);
					

				}

			}
			
		}
		
		people.get(1).toString();

		
	}
}
