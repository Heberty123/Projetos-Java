/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocos;

/**
 *
 * @author heber
 */
public class quartos {
    
    private String name;
    private String email;
    private int room;
    

    public quartos(String name, String email, int room){
        this.name = name;
        this.email = email; 
        this.room = room;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.name = email;
    }
    
    
}
