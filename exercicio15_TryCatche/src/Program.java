import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

import java.util.Locale;

public class Program{
	
public static void main (String[] argc)  {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter account data");
	System.out.print("Number: ");
	int number = sc.nextInt();
	System.out.print("Holder: ");
	sc.nextLine();
	String holder = sc.nextLine();
	System.out.print("Initial Balance: ");
	double IniBalance = sc.nextDouble();
	System.out.print("Withdraw Limit: ");
	double withdrawLimit = sc.nextDouble();
	
	Account account = new Account(number, holder, IniBalance, withdrawLimit);
	
	try {
	System.out.println();
	System.out.print("Enter amount for withdraw: ");
	account.withdraw(sc.nextDouble());
	System.out.println("New Balance: " + account.getBalance());
	}
	catch(DomainExceptions e) {
		System.out.println("Withdraw error: " + e.getMessage());
	}
	
	
	sc.close();
}
}