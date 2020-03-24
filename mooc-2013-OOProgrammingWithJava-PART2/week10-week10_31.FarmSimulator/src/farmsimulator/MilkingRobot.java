/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package farmsimulator;


public class MilkingRobot {
    
    private BulkTank tank;
    
    public MilkingRobot(){
        
        this.tank = null;
        
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    
    public void milk(Milkable milkable){
        if(this.tank == null){
           throw new IllegalStateException();
        }else{
        this.tank.addToTank(milkable.milk());
        }        
    }

}
