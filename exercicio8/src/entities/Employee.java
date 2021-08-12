/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Heberty
 */
public class Employee {
    private int id;
    private String name;
    private double salario;
    
    
    public Employee(int id, String name, double salario){
        this.id = id;
        this.name = name;
        this.salario = salario;
    }
    
    public int setId(){
        
        return this.id;
    }
    
    public void getId(int valor){
        
        this.id = valor;
    }
    
    public String setName(){
        
        return this.name;
    }
    
    public void getName(String nome){
        
        this.name = nome;
    }
    
    public double setSalario(){
        
        return this.salario;
    }
    
    public void getSalario(int valor){
        
        this.salario = valor;
    }
    
    public void IncreaseSalary(double percentage) {
    	
    	salario += salario * percentage/100.00;
    }
    
    public String toString() {
    	
    	
    	return setId()+ ", " +setName()+ ", " + setSalario();
    }
    
}
