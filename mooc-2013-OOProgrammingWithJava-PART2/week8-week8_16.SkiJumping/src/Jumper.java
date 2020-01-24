
import java.util.ArrayList;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */


public class Jumper implements Comparable<Jumper>{
    
    private ArrayList<Integer> jumpLengths;
    private ArrayList<Integer> judgeScores;
    private String name;
    private int totalPoints;
    
    public Jumper(String name){
        this.jumpLengths = new ArrayList();
        this.name = name;
        this.totalPoints = 0;
        this.judgeScores = new ArrayList();
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoints(){
        int totalPointsEarned = 0;
        for(int x : this.jumpLengths){
            totalPointsEarned += x;
        }
        if(this.judgeScores.isEmpty()){
            return totalPointsEarned;
        }
        for(int y : this.judgeScores){
           
            totalPointsEarned += y;
        }
        return totalPointsEarned;
    }
    
    public int getLastJump(){
        int lastJumpIndex = jumpLengths.size()-1;
        return this.jumpLengths.get(lastJumpIndex);
    }
    
    public void setPoints(Jumper j, int pointsGiven){
        j.totalPoints += pointsGiven;
        
    }
    
    public void addJump(int distance){
        
        this.jumpLengths.add(distance);
        
    }
    
    public void addJudgeScore(int vote){
        
        this.judgeScores.add(vote);
        
    }
    public void getAllJumps(){
        int i = 0;
        
        for(int x : this.jumpLengths){
            if(i == 0 || i < this.jumpLengths.size()-1){
            System.out.print(x + " m,");
            i++;
            
            }else{
                System.out.print(x + " m");
            }
            }
            System.out.println();
        }
    
    
    @Override
    public int compareTo(Jumper j){
        if(this.getPoints() > j.getPoints()){
            return -1;
        }else if(this.getPoints() < j.getPoints()){
            return 1;
        }else {
            return 0;
        }
    }
   @Override
   public String toString(){
       return this.getName() + " (" + this.getPoints() + " points)";
   }
    
}
