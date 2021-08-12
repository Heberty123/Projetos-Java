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
import entities.Products;
import java.util.Locale;
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Products x;
        
        x = new Products();
        
        System.out.print("Digite o nome do Produto : ");
        x.name = sc.next();
        System.out.print("Digite o preço do Produto : ");
        x.price = sc.nextDouble();
        System.out.print("Digite a quantidade do Produto : ");
        x.quantity = sc.nextInt();
        
        System.out.println();
        double result = x.totalstock();
        System.out.printf("Total valor do Produto : %.2f%n", result);

        
        System.out.print(x.ToString());
        
        System.out.print("\nDeseja incrementar quantos produtos ? : ");
        int quantity = sc.nextInt();
        x.Increment(quantity);
        
        System.out.print(x.ToString());
        
        System.out.print("\nDeseja decrementar quantos produtos ? : ");
        quantity = sc.nextInt();
        x.decrement(quantity);

        System.out.print(x.ToString());
        sc.close();
    }
    
}
