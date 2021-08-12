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
public class Funcionarios {
    
    public String name;
    public double SalarioBruto;
    public double impost;
    
    
    public double NetSalary(){
        
        return SalarioBruto - impost;
    }
    

    public String toString(){
        
        
        return "Funcionário : " + name + ", R$ : " + String.format("%.2f", NetSalary())+ ", com o imporsto pago";
    }
 
    public void IncreaseSalary(double porcentagem){
        
        SalarioBruto += SalarioBruto * porcentagem / 100.0;
    }
    
}
