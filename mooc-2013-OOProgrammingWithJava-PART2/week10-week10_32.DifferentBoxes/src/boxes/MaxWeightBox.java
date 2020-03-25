/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package boxes;

import java.util.ArrayList;
import java.util.List;


public class MaxWeightBox extends Box{
    
    private int maxWeight;
    private List<Thing> things;
    
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList();
        
    }

    @Override
    public void add(Thing thing) {//adds thing to box if there is space
        if(thing.getWeight() <= this.maxWeight){
            this.things.add(thing);
            this.maxWeight -= thing.getWeight();
            
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {//checks if a thing is in the box
        return this.things.contains(thing);
    }

}
