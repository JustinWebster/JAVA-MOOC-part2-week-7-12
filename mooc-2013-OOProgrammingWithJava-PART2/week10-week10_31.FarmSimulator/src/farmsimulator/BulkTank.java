/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package farmsimulator;


public class BulkTank {

    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0.0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0.0;
    }
    
    public double getCapacity(){
        return this.capacity;   
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        if(this.capacity - this.volume < 0){
            return 0.0;
        }else{
        return this.capacity - this.volume;
        }
    }
    
    public void addToTank(double amount){        
        this.volume += amount;
        if(this.volume > this.capacity){
            this.volume = this.capacity;
        }
    }
    
    public double getFromTank(double amount){
        if(amount > this.volume){
            this.volume = 0.0;
        }else{
            this.volume -= amount;
        }
        return this.volume;
    }
    
    @Override
    public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
    
}
