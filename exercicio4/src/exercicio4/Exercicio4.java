/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;
import java.util.Locale;
import java.util.Scanner;
import operacao.CurrencyConverter;
/**
 *
 * @author heber
 */
public class Exercicio4 {
    
    public static void main (String[] argc){
            Scanner sc = new Scanner (System.in);
            Locale.setDefault(Locale.US);
            
            System.out.print("Qual é o preço do Dolar? : ");
            double dolar = sc.nextDouble();
            
            System.out.println("Quanto dolars deseja comprar ? : ");
            double qtdDolar = sc.nextDouble();
            
            double resultado = CurrencyConverter.valor(dolar,qtdDolar);
            
            System.out.println("Montante a ser pago em reais : " + resultado);
        }
    }
    

    
    
