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
public class Rentangulo {
    
    public double largura;
    public double altura;
    
    public double Area(){
        
        return largura * altura;
    }
    
    public double Perimeter(){
        
        return ((2 * largura) + (2 * altura)); 
    }
    
    public double Diagonal(){
        
        return Math.sqrt(Math.pow(largura,2) + Math.pow(altura,2) );
    }
    
    public String toString(){
        
      return "Area : " + Area() + ", " + "Perímetro : " + Perimeter() + ", "
              + "Diagonal : " + Diagonal();
        
    }
    
}
