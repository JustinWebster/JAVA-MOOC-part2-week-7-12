/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable{

    private String name;
    private double udderCapacity;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private double availableMilk;

    public Cow() {
        int num = new Random().nextInt(this.NAMES.length);
        int count = 0;
         for(String s : this.NAMES){
             count++;
             if(count == num){
                 this.name = s;
                 
                 break;
             }
         }
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.availableMilk = 0.0;
    }
    
    public Cow(String name){
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.availableMilk = 0.0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udderCapacity;
    }
    
    public double getAmount(){
        return this.availableMilk;
    }

    @Override
    public void liveHour() {
        
        this.availableMilk += 0.7 + (new Random().nextInt(14)/10.0);
        if(this.availableMilk > this.udderCapacity){
            this.availableMilk = this.udderCapacity;
        }
    }

    @Override
    public double milk() {
        double milkMilked = this.availableMilk;
        this.availableMilk = 0.0;
        return milkMilked;
    }
    
    @Override
    public String toString(){
        return this.getName() + " " + Math.ceil(this.availableMilk) + "/" + this.udderCapacity;
    }

}
