/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heber
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] vect = new String[] {"Maria","João","Bob"};
        
        for (int i = 0 ; i<vect.length ; i++){
            
            System.out.println(vect[i]);
        } 
    System.out.println("------------------------------------------------");
    
       for (String arg : vect){
           
           System.out.println(arg);
       }
}

}