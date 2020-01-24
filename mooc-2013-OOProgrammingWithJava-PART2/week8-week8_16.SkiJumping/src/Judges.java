
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Judges {

    private ArrayList<Integer> scores;
    
public Judges(){
    this.scores = new ArrayList();
}

public void judgesJudge(){
    int times = 0;
    
    while(times < 5){
        int rand = ThreadLocalRandom.current().nextInt(10, 20+1);
        this.scores.add(rand);
        times++;
    }
    
    
    
}

public int getJudgeTotal(){
    int judgePoint = 0;
    int i = 0;
    Collections.sort(this.scores);
    for(int x : this.scores){
        if(i > 0 && i < this.scores.size()-1){
            judgePoint += x;
        }
        i++;
        
        
    }
    return judgePoint;
}

    public void printScores(){
        int i = 0;
        System.out.print("[");
        for(int x : this.scores){
            if(i == 0 || i < 4){
            System.out.print(x + ", ");
            i++;
            }else{
                System.out.print(x);
            }
            
        }
        System.out.println("]");
        
    }
    
    public void clearVotes(){
        this.scores.removeAll(scores);
    }

}
