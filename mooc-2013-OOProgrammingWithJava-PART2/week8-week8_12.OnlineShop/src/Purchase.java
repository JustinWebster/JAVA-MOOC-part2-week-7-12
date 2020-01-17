/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Purchase{
    
    private String product;
    private int amount;
    private int price;
    
    public Purchase(String product, int amount, int price){
        this.product = product;
        this.amount = amount;
        this.price = price;
    }
   
    public int price(){
        int totalPrice = this.amount * this.price;
        return totalPrice;
        
    }
    
    public void increaseAmount(){
        
        this.amount++;
        
    }
    
    @Override
    public String toString(){
        
        return this.product + ": " + this.amount;
    }
    
    
    
}
