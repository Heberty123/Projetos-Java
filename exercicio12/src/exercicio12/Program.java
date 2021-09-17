package exercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<Contribuintes>();
		
		System.out.println("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		for(int i= 1; i<= number; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.println("Indidual or company (i/c)? ");
			char c = sc.next().charAt(0);
			if (c == 'i') {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Anual income: ");
				double annual_income = sc.nextDouble();
				System.out.println("Health expenditures: ");
				double health_expenditure = sc.nextDouble();
				
				list.add(new physical_person(name, annual_income, health_expenditure));
				
			} else {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Anual income: ");
				double annual_income = sc.nextDouble();
				System.out.println("number of employer: ");
				int number_of_employer = sc.nextInt();
				
				list.add(new Legal_person(name, annual_income, number_of_employer));
			}
		}
		
		System.out.println("TAXES PAID: ");
		
		double som = 0;
		
		for (Contribuintes vo : list) {
			System.out.println(vo.toString());
			som += vo.valorImposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", som);
		

		
		sc.close();
	}

}
