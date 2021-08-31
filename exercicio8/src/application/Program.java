/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Scanner;
import entities.Employee;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
/**
 *
 * @author Heberty
 */
public class Program {
    public static void main(String[] argc){
        Scanner sc = new Scanner (System.in);
        
        Locale.setDefault(Locale.US);
        
        List<Employee>list = new ArrayList<>();
        
        System.out.print("How many employees will be registered ? ");
        int n = sc.nextInt();
        System.out.printf("%n%n");
        
        for (int i = 0; i<n ; i++){
        	
        	System.out.println();
        	
            System.out.print("Enter id of employee "+ (i + 1)+ " : ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
            System.out.print("Enter name of employee "+ (i + 1)+ " : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Salario of employee "+ (i + 1)+ " : ");
            double salario = sc.nextDouble();
            
            list.add(new Employee(id, name, salario));
            
        }
        
        System.out.println("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt(); 
        Employee empp = list.stream().filter(x -> x.setId() == id).findFirst().orElse(null);
		if (empp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empp.IncreaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees : ");
		for (int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i).toString());
		}
		
		
        sc.close();
    }
    
    public static boolean hasId(List<Employee> list, int id) {
    	
    	Employee emp = list.stream().filter(x -> x.setId() == id).findFirst().orElse(null);
    	
    	return emp != null;
    }
    
}
