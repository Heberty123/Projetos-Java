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
import java.util.Scanner; 
import entities.Rentangulo;

public class Programa {
    
    System.out.print("efhvrovnrjo3vnro3");
    
    // 3rigb3rjvb3rjbv3rjo3ojn3  
        
        System.out.print("jecjebcej");
   
    public static void main (String[] argc){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        Rentangulo rentangulo = new Rentangulo();
        System.out.printf("%n Digite  a largura do retangulo : ");
        rentangulo.largura = sc.nextDouble();
        
        System.out.printf("%n Digite  a altura do retangulo : ");
        rentangulo.altura = sc.nextDouble();
        
        System.out.println();
        System.out.println(rentangulo.toString());
        
        sc.close();
    }
    
}
