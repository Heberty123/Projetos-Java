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
import entities.Rent;
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite atÃ© quantos Agentes deseja registrar : ");
        int n = sc.nextInt();
        int numeros = 1;
        
        Rent[] vect = new Rent[n];
         new Rent(vect.length);
        
        for (int i=0 ; i<vect.length ; i++){
            System.out.println();
            System.out.printf("Digite o nome do Agente "+numeros+" : ");
            if (numeros == 1){
            sc.nextLine();
            }
            String name = sc.nextLine();
            System.out.printf("Digite o Salario do Agente "+numeros+" : ");
            double salario = sc.nextDouble();
            System.out.printf("Digite a situaÃ§Ã£o do Agente "+numeros+" : ");
            sc.nextLine();
            String situacao = sc.nextLine();
            numeros++;
            vect[i] = new Rent(name, salario, situacao);
                       
        }
        int nuumero = 1;
        for (int i = 0 ; i<vect.length ; i++){
            
            System.out.println();
            System.out.printf("Agente : " +nuumero +"......................" + vect[i].toString());
            System.out.println();
            nuumero++;
        }
       
        sc.close();
    }
    
}
