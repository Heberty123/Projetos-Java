import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Service.ContractService;
import Service.PaypalService;
import entities.Contract;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int month = sc.nextInt();
		
		Contract contra = new Contract(number, date, value);
		
		System.out.print("Enter number of installments: ");
		System.out.println("Installments");
		 
		ContractService cs = new ContractService();
		cs.processContract(contra, month, new PaypalService());
		System.out.println(contra);
		
		
		sc.close();
	}

}
