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
public class city {
    
    public String name;
    public double population;
    public double economia;
    
    public double pibForPopulation(){
        
        return economia/population;
    }
    
    public String toString(){
        
        return "Nome of city is "+name+
               ", tem popualação igual á : "+population+
               " e economia : "+economia+" , afinal pib per capita é : "+pibForPopulation()+"\n";
    }
    
}
