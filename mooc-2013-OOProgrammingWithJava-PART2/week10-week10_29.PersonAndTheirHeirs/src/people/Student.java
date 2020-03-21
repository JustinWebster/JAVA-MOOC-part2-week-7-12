/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package people;

public class Student extends Person{
    
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    public void study(){//increases a students credits
        this.credits++;
    }
    
    public int credits(){//returns a students total credits
        return this.credits;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "  credits " + this.credits;
    }
}
