package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i=1 ; i<=number ; i++) {
			
			System.out.println("Product #"+i+" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customFee));
			}
			else if(ch == 'c') {
				
				list.add(new Product(name, price));
			}
			else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date ManufactureDate = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, ManufactureDate));
			}
		}
		
		
		System.out.println("Price Tags: ");
		for (Product pro : list) {
			System.out.println(pro.priceTag());
		}
		
		
		
		sc.close();
	}

}
