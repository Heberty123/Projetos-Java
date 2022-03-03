import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.RentalService;
import model.tax.BrazilTaxService;

public class principal {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm");
	
		System.out.println("Date get: ");
		Date datainitial = sdf.parse(sc.nextLine());
		
		System.out.println("Date final: ");
		Date datafinal = sdf.parse(sc.next());
		
		System.out.println("Tipo de veículo: ");
		String vehicle = sc.next();
		
		System.out.println("Enter price per hour: ");
		double precohour = sc.nextDouble();
		
		System.out.println("Enter price per dia: ");
		double precodia = sc.nextDouble();
		
		CarRental cr = new CarRental(datainitial, datafinal, new Vehicle("Civic"));
		
		RentalService rentalService = new RentalService(precohour, precodia, new BrazilTaxService());
		
		rentalService.ProcessInvoice(cr);
		
		
		sc.close();
	}
}
