package program;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import classes.Diretor;
import classes.Employee;
import classes.Gerente;
import classes.Photographer;

public class painel {

	public static void main(String[] agrc) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		
		Gerente gerente1 = new Gerente("Amélia", 2000, fd.parse("06/06/1990"));
		gerente1.senhaConfirmada(1234);
		Diretor diretor1 = new Diretor("Zete" , 5000, fd.parse("05/12/1898"));
		diretor1.senhaConfirmada(5987);
		Photographer photo = new Photographer("Heberty", 1700, fd.parse("21/11/2009"));
		

		
		gerente1.Buy("Apple", 1000, 2);
		diretor1.Buy("Apple", 2000, 2);
		photo.Buy("Camera", 1000, 1);
		System.out.println("Gerente: " + gerente1.listProducts());
		System.out.println(gerente1.getSalario());
		System.out.println("Diretor: " + diretor1.listProducts());
		System.out.println(diretor1.getSalario());
		System.out.println("Photographer: " + photo.listProducts());
		System.out.println(photo.getSalario());
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
