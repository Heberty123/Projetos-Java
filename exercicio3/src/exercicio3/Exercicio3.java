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
import entities.Study;

public class Exercicio3 {
    
   
    public static void main (String[] argc){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        Study study = new Study();
        
        System.out.printf("Notas do aluno%n");
        System.out.printf("%nPrimeira nota : ");
        study.trimestre1 = sc.nextDouble();
            while (study.trimestre1 > 30){
            System.out.printf("%n A nota do primeiro trimestre vale até 30, digite novamente : ");
            study.trimestre1 = sc.nextDouble();
            }
        
        
        System.out.printf("%nSegunda nota : ");
        study.trimestre2 = sc.nextDouble();
            while (study.trimestre2 > 35){
            System.out.printf("%n A nota do segundo trimestre vale até 35, digite novamente : ");
            study.trimestre2 = sc.nextDouble();
            }
              
        System.out.printf("%nTerceira nota : ");
        study.trimestre3 = sc.nextDouble();
            while (study.trimestre3 > 35){
            System.out.printf("%n A nota do primeiro trimestre vale até 35, digite novamente : ");
            study.trimestre3 = sc.nextDouble();
            }
            
            System.out.println(study.situacao());
       
        sc.close();
    }
    
}
