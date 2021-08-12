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
import Utility.Calculadora;
public class program {

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
         
         double circuferencia = Calculadora.circuferencia(radius);
         
         double volume = Calculadora.volume(radius);
         
         System.out.printf("Circuferencia %.2f%n: ", circuferencia);

         
         System.out.printf("Volume : %.2f%n",volume);
         
         System.out.printf("PI Value %.2f%n: ", Calculadora.PI);
            
         sc.close();
    }
    
  
}
