/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package boxes;

import java.util.ArrayList;
import java.util.List;


public class BlackHoleBox extends Box{
    
    private List<Thing> blackHole;
    
    public BlackHoleBox(){
        this.blackHole = new ArrayList();
    }

    @Override
    public void add(Thing thing) {
        this.blackHole.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

}
