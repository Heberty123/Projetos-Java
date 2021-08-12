/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heber
 */
import java.util.Locale;
import entities.city;
import java.util.Scanner;
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        city a, b, c;
        
        a = new city();
        b = new city();
        c = new city();
        
        System.out.print("enter name the city A : ");
        a.name = sc.next();
        System.out.print("enter quantity population of the city A : ");
        a.population = sc.nextDouble();
        System.out.print("enter quantity pib of the city A : ");
        a.economia = sc.nextDouble();
        
        System.out.print("enter name the city B : ");
        b.name = sc.next();
        System.out.print("enter quantity population of the city B : ");
        b.population = sc.nextDouble();
        System.out.print("enter quantity pib of the city B : ");
        b.economia = sc.nextDouble();
        
        System.out.print("enter name the city C : ");
        c.name = sc.next();
        System.out.print("enter quantity population of the city C : ");
        c.population = sc.nextDouble();
        System.out.print("enter quantity pib of the city C : ");
        c.economia = sc.nextDouble();
        
        System.out.print(a.toString());
                System.out.print(b.toString());
                        System.out.print(c.toString());
        
        

        
        sc.close();
    }
    
}
