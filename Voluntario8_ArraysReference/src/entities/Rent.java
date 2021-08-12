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
public class Rent {
    
    private String name;
    private double salario;
    private String situacao;
    private int numero;
    
    
    public Rent(String name, double salario, String situacao){
        this.name = name;
        this.salario = salario;
        this.situacao = situacao;   
    }
    
    public Rent(int numero){
      this.numero = numero;  
    }
    
   /*
    public String getName(){
        
        return this.name;
    }
    
    public void setName(valor){
        
        this.name = valor;
    }
    
    
    public String getSalario(){
        
        return this.salario;
    }
    
    public void setSalario(valor){
        
        this.salario = valor;
    }
    
    public String getSituacao(){
        
        return this.situacao;
    }
    
    public void setSituacao(valor){
        
        this.situacao = valor;
    }
    */
    public String toString(){
        
        return "name : "+ name + "........Salário: " + salario + ".......situacao: " + situacao + ".";
    }
    
}
