/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package moving.domain;

public class Item implements Thing, Comparable<Item>{

    private String name;
    private int volume;
    
    public Item(String name, int volume){
        
        this.name = name;
        this.volume = volume;
        
    }
    
    //returns only the name of an item
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.getName() + " (" + this.volume + " dm^3)";
    }
    
    @Override
    //returns the volume/weight of the item
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item o) {
        if(this.volume < o.getVolume()){
            return -1;
        }
        if(this.volume == o.getVolume()){
            return 0;
        }else{
            return 1;
        }
    }
    
}
