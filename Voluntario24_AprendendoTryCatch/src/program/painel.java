package program;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import classes.Employee;
import classes.Gerente;

public class painel {

	public static void main(String[] agrc) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		
		Employee gerente1 = new Gerente("Amélia", 2000, fd.parse("06/06/1990"));
		
		System.out.println(gerente1.getSalario());
		System.out.println(gerente1.getNascimento());
		
		gerente1.Buy("Apple", 1000, 4);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
