/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package farmsimulator;

import java.util.ArrayList;
import java.util.List;


public class Farm implements Alive{

    private String farmOwner;
    private Barn barn;
    private List<Cow> animals;
    
    public Farm(String ownerName, Barn barn){
        this.farmOwner = ownerName;
        this.barn = barn;
        this.animals = new ArrayList();
    }
    
    public String getOwner(){
        return this.farmOwner;
    }
    
    public void addCow(Cow c){
        this.animals.add(c);
    }
    
    public void installMilkingRobot(MilkingRobot milkBot){
        this.barn.installMilkingRobot(milkBot);
    }
    
    public void manageCows(){
        this.barn.takeCareOf(this.animals);
    }
    
    @Override
    public void liveHour() {
        for(Cow c : this.animals){
            c.liveHour();
        }
        
    }
    public String printCows(){
        String cows = "";
        for(Cow c : this.animals){
            cows += "\n        " + c ;
        }
        return cows;
    }
    
    
    @Override
    public String toString(){
        if(this.animals.isEmpty()){
            return "Farm owner: " + this.farmOwner + "\nBarn bulk tank: " + this.barn.getBulkTank() + "\nNo cows.";
        }else{
            return "Farm owner: " + this.farmOwner + "\nBarn bulk tank: " + this.barn.getBulkTank() + "\nAnimals:" + printCows();
        }
    }
    
    

}
