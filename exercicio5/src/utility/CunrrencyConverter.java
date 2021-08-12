/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author heber
 */
public class CunrrencyConverter {
    public static final double ImpostoIOF = 6;
    
    public static double calculatorDollar(double cotDollar,double qtdDollar){
        double result = cotDollar * qtdDollar;
        result += result * ImpostoIOF / 100.00;
        
        
        return result;
    }
    
}
