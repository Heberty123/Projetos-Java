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
public class Contas {
    
    private int numero_da_conta;
    private String titular;
    private double deposito;
    
    public Contas( int numero_da_conta, String titular, double deposito){
       this.numero_da_conta =  numero_da_conta;
       this.titular = titular;
       addDeposit(deposito);
    }
    
    public Contas( int numero_da_conta, String titular){
       this.numero_da_conta =  numero_da_conta;
       this.titular = titular;

    }
    
    public int getNumero_da_conta(){
        return this.numero_da_conta;
    }
    
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    
    public String getTitular(){
      return this.titular;  
    }
    
    
    public void setDeposito(double value){
        this.deposito = value;
    }
      
    public void addDeposit(double value){
        
        deposito += value;
    }
    
    public void withdrawDeposit(double value){
        
        deposito -= value + 5;
    }
    
    public String toString(){
        
        return "Account : " + getNumero_da_conta() +
                ", Holder : " + getTitular() +
                ", Balance : " + deposito;
    }
    
}
