/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package boxes;

import java.util.ArrayList;
import java.util.List;


public class OneThingBox extends Box{
    
    private List<Thing> theThing;
    
    public OneThingBox(){
        this.theThing = new ArrayList();
    }
    
    @Override
    public void add(Thing thing) {
        if(this.theThing.isEmpty()){
            this.theThing.add(thing);
        }else{
            
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.theThing.contains(thing);
    }

}
