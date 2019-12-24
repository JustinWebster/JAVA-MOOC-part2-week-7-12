/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

import java.util.Scanner;

public class Reader {
    
    private Scanner scan;
    
    
    
    public Reader(){
        
       this.scan = new Scanner(System.in);
      
        
    }
    
    public String readString(){
        
        String input = this.scan.nextLine();
        return input;
        
    }  

    public int readInteger(){
    
    int num = Integer.parseInt(this.scan.nextLine());
    return num;
    
    }

}
