/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    
    private int maxCapacity;
    private ArrayList<Thing> theBox;
    
    
    public Box(int maximumCapacity){
        this.maxCapacity = maximumCapacity;
        this.theBox = new ArrayList();
    }
    
    //Checks if a thing can fit into a box
    //Adds the thing to the box if true
    public boolean addThing(Thing thing){
        
        if(thing.getVolume() + this.getVolume() <= this.maxCapacity){
            
            this.theBox.add(thing);
            return true;
        }else{
            return false;
        }
        
    }
    
    //returns a thing from its box
    public int getThing(Thing p){
        return theBox.indexOf(p);
    }

    @Override
    //returns the current weight of the box
    public int getVolume() {
        int currentWeight = 0;
        for(Thing p : this.theBox){
            currentWeight += p.getVolume();
        }
        return currentWeight;
    }
    
    @Override 
    public String toString(){
      String inTheBox = "";
      
        for(Thing p : this.theBox){
             
            inTheBox += p.toString() + " ";
        }
        return inTheBox;
    }
    
}
