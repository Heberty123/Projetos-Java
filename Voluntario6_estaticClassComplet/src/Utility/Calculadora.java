/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author heber
 */
public class Calculadora {
    
      public static final double PI = 3.14159;
    
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
