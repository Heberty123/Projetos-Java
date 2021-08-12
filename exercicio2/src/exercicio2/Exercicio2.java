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
import entities.Funcionarios;

public class Exercicio2 {
    
   
    public static void main (String[] argc){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        Funcionarios funcionarios = new Funcionarios();
        
        System.out.printf("%nDigite o nome do funcionário : ");
        funcionarios.name = sc.nextLine();
        
        System.out.printf("%nDigite o salário Bruto do funcionário : ");
        funcionarios.SalarioBruto = sc.nextDouble();
        
        System.out.printf("%nDigite o imposto para salário do funcionário : ");
        funcionarios.impost = sc.nextDouble();
        
        
        System.out.print(funcionarios.toString());
        
        System.out.printf("%nDigite qual porcetagem deseja acrescentar no salário bruto do funcionário : ");
        double porcentagem = sc.nextDouble();
        funcionarios.IncreaseSalary(porcentagem);
        
        
        System.out.println(funcionarios.SalarioBruto);
        
        sc.close();
    }
    
}
