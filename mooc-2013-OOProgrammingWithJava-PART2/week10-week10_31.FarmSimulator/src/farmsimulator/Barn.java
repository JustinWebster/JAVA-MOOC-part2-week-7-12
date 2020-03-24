/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package farmsimulator;

import java.util.Collection;


public class Barn {

    private BulkTank tank;
    private MilkingRobot mkOne;
    
    public Barn(BulkTank tank){       
        this.tank = tank;
        this.mkOne = null;       
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.mkOne = milkingRobot;
        this.mkOne.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.mkOne == null){
            throw new IllegalStateException();
        }else{
            this.mkOne.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cow){
        if(this.mkOne == null){
            throw new IllegalStateException();
        }else{
        for(Cow c : cow){
            this.mkOne.milk(c);
        }
        }
    }
    
    @Override
    public String toString(){
        return this.tank.toString();
    }
    
}
