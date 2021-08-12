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
import utility.CunrrencyConverter;
import java.util.Locale;
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("what´s the Dollar price : ");
        double cotDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought : ");
        double qtdDollar = sc.nextDouble();
        double result = CunrrencyConverter.calculatorDollar(cotDollar,qtdDollar);
        System.out.printf("%nO valor do montante considerando com imposto de IOF : %.2f%n", result);
    }
    
}
