
import java.util.ArrayList;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */


public class Box implements ToBeStored{
    
  private ArrayList<ToBeStored> storageBox;
  private double maxWeight; 
  
  public Box(double weight){
      
      this.storageBox = new ArrayList<ToBeStored>();
      this.maxWeight = weight;
      
  }
  
  @Override
  public double weight(){
      double currentWeight = 0;
      for(ToBeStored thing : this.storageBox){
          currentWeight += thing.weight();
      }
      return currentWeight;
  }
  
  public void add(ToBeStored thing){
      if(thing.weight() + weight() < this.maxWeight){
      this.storageBox.add(thing);
      }
  }
  
  @Override
  public String toString(){
      return "Box: " + this.storageBox.size() + " things, total weight " + weight() + " kg";
      
  }
  
}
