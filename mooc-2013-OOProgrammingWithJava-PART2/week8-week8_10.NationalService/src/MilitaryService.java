/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class MilitaryService implements NationalService {
    
    private int daysLeft;
    
    public MilitaryService(int daysRemaining){
        
        this.daysLeft = daysRemaining;
        
    }
    
    @Override
    public int getDaysLeft(){
        
        return this.daysLeft;
        
    }    
    
    @Override
    public void work(){
        if(this.daysLeft > 0){
            this.daysLeft--;
        }
    }
    
}
