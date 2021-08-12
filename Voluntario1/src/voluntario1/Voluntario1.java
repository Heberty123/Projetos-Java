/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voluntario1;

/**
 *
 * @author heber
 */
import java.util.Scanner;
import entities.AgentesOperacao;
public class Voluntario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AgentesOperacao X, Y, Z;
        X = new AgentesOperacao();
        Y = new AgentesOperacao();
        Z = new AgentesOperacao();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome de Agente 1 : ");
        X.nome = sc.next();
        System.out.print("Digite sua situação : ");
        X.situacao = sc.next();
        System.out.print("Digite sua Idade : ");
        X.idade = sc.nextInt();
        System.out.print("Digite o valor mensal : ");
        X.mensalidade = sc.nextDouble();
        
        System.out.print("Digite o nome de Agente 2 : ");
        Y.nome = sc.next();
        System.out.print("Digite sua situação : ");
        Y.situacao = sc.next();
        System.out.print("Digite sua Idade : ");
        Y.idade = sc.nextInt();
        System.out.print("Digite o valor mensal : ");
        Y.mensalidade = sc.nextDouble();
        
        System.out.print("Digite o nome de Agente 3 : ");
        Z.nome = sc.next();
        System.out.print("Digite sua situação : ");
        Z.situacao = sc.next();
        System.out.print("Digite sua Idade : ");
        Z.idade = sc.nextInt();
        System.out.print("Digite o valor mensal : ");
        Z.mensalidade = sc.nextDouble();
        
        System.out.printf("Agente 1 -> nome : %s, Situação : %s, idade : %d, valor mensal : %.2f%n%n", X.nome, X.situacao, X.idade, X.mensalidade);
        
        System.out.printf("Agente 1 -> nome : %s, Situação : %s, idade : %d, valor mensal : %.2f%n%n", Y.nome, Y.situacao, Y.idade, Y.mensalidade);
        
        System.out.printf("Agente 1 -> nome : %s, Situação : %s, idade : %d, valor mensal : %.2f%n%n", Z.nome, Z.situacao, Z.idade, Z.mensalidade);
        sc.close();
    }
    
}
