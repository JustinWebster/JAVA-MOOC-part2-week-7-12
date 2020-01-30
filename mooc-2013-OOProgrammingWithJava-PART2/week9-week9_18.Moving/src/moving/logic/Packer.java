/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {

    private int boxesVol;
    private Box packersBox;
    private ArrayList<Box> boxes = new ArrayList();

    //creates a new "packer"
    public Packer(int boxesVolume) {

        this.boxesVol = boxesVolume;
        this.packersBox = new Box(boxesVolume);
        

    }
    //packs things into boxes
    public List<Box> packThings(List<Thing> things) {
        this.boxes.add(this.packersBox);
        for (Thing p : things) {
            
            if (this.packersBox.addThing(p)) {
                
            }else if(!this.packersBox.addThing(p)){
                this.packersBox = new Box(this.boxesVol);
                this.boxes.add(this.packersBox);
                this.packersBox.addThing(p);
            }
            
        }
        
        return this.boxes;
    }

}
