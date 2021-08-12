/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author heber
 */
public class Study {
    
    public double trimestre1;
    public double trimestre2;
    public double trimestre3;
    public double minimo= 60% 100;
    
    public String situacao(){
        
     double Final = trimestre1 + trimestre2 + trimestre3;
     
     if (Final >= minimo){
         
         return "Aluno obteve resultado : " + String.format("%.2f", Final) + ", portanto foi PASS ! !";
     }
     
     else {
         
         double falta = minimo - Final;
         return "Aluno obteve resultado : " + String.format("%.2f", Final) + ", portanto foi FAILED ! !, Falta-lhe " + falta + " Pontos para atingir a nota mínima";
     }
     
    }
            
    
    
}
