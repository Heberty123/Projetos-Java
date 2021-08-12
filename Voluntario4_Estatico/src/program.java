/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heber
 */
import java.util.Scanner;
import java.util.Locale;
public class program {

    public static final double PI = 3.14159;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         System.out.printf("Calculator of radius%n%n");
         System.out.print("enter nunber of the radius : ");
         
         double radius = sc.nextDouble();
         
         double circuferencia = circuferencia(radius);
         
         double volume = volume(radius);
         
         System.out.printf("Circuferencia %.2f%n: ", circuferencia);

         
         System.out.printf("Volume : %.2f%n",volume);
         
         System.out.printf("PI Value %.2f%n: ", PI);
            
         sc.close();
    }
    
    public static double circuferencia(double radius){
        //2·π·r.
        return 2.0 * PI * radius;
    }
    
    public static double volume(double radius){
        //4. p. r³/3.
        double Variavel_Radius = Math.pow(radius, 3);
        return 4.0 * PI * Variavel_Radius / 3.0;
    }
    
}
