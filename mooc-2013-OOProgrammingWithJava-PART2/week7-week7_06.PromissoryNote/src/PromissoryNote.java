
import java.util.HashMap;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class PromissoryNote {
    
    private HashMap<String, Double> debt;
    
    public PromissoryNote(){
        this.debt = new HashMap<String, Double>();
    }
    
    public void setLoan(String person, double owed){
        this.debt.put(person, owed);
    }
    
    public double howMuchIsTheDebt(String personInDebt){
        if(this.debt.containsKey(personInDebt)){
            return this.debt.get(personInDebt);
        }
        else{
            return 0;
        }
    }
}
