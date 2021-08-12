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
public class Products {
    public String name;
    public double price;
    public int quantity;
    public int newquantity;
  
    public double totalstock(){

return price * quantity;
}
    
public String ToString(){
    
    return "Nome do Produto : " + name +
            ".....Preço : " + price +
            "......quantidade : " + quantity +
            ".......e valor do estoque : " + totalstock() +
            "\n";
            
            
}

    
public void Increment(int quantity){
    
this.quantity += quantity;

}

public void decrement(int quantity){
    
    this.quantity -= quantity;
}
}



