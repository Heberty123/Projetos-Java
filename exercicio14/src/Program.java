import java.util.Scanner;

import entities.Client;
import entities.Employee;
import entities.People;
import entities.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] agrc) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<People>list = new ArrayList<>();
		
		System.out.println("Início");
		
		
		System.out.println("\n\nDigite quantas pessoas deseja cadastrar: ");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			
			System.out.println("\nPeople "+(i+1));
			System.out.print("Digite seu nome: ");
			String name = sc.next();
			System.out.print("Digite seu salário: ");
			double salario = sc.nextDouble();
			System.out.println("Digite qual tipo de people deseja cadastrar(C - Client,   E - Employee): ");
			char res = sc.next().charAt(0);
			
			if (res == 'C') {
				
				System.out.println("Digite sua idade: ");
				int age = sc.nextInt();
				
				list.add(new Client(name, salario, 0, age, new ArrayList<Products>()));
				
				
				System.out.println("Deseja quantos produtos: ");
				int qtd = sc.nextInt();
				if (qtd > 0) {
					for (int n = 1; n <= qtd; n++) {
						
						System.out.println("Product ###"+n+"###:");
						System.out.println("Name: ");
						String namee = sc.next();
						System.out.println("Price: ");
						double price = sc.nextDouble();
						System.out.println("Quantity: ");
						int quantity = sc.nextInt();
						
						if(list.get(i).buy(price, quantity, list.get(i).getSalario())) {
							
							list.get(i).adicionar(namee, price, quantity);
						}
						else {
							
							System.out.println("Não foi possível fazer compra, pois o valor total excende o seu salário !");
						}
						
						
						
						
					}
				}else {
					
				}
				
		
			}
			else {
				
				
				System.out.println("Digite sua idade: ");
				int age = sc.nextInt();
				
				list.add(new Employee(name, salario, 0, age, new ArrayList<Products>()));
				
				
				
				
				System.out.println("Deseja quantos produtos: ");
				int qtd = sc.nextInt();
				if (qtd > 0) {
					for (int n = 1; n <= qtd; n++) {
						
						System.out.println("Product ###"+n+"###:");
						System.out.println("Name: ");
						String namee = sc.next();
						System.out.println("Price: ");
						double price = sc.nextDouble();
						System.out.println("Quantity: ");
						int quantity = sc.nextInt();
						
						if(list.get(i).buy(price, quantity, list.get(i).getSalario())) {
							
							list.get(i).adicionar(namee, price, quantity);
						}
						else {
							
							System.out.println("Não foi possível fazer compra, pois o valor total excende o seu salário !");
						}	
						
						
						
					}
				}else {
					
				}
			}
			
		}
		
		
		for (People man: list) {
			
			System.out.println("\n"+ man.toString());
		}
		
		
		
		
		sc.close();
	}
}
