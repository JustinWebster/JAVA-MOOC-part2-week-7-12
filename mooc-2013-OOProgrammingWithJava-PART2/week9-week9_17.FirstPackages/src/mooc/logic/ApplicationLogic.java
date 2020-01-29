/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;
    
public ApplicationLogic(UserInterface ui){
    
    this.ui = ui;
    
}
    
public void execute(int howManyTimes){
    int i = 0;
    while(i < howManyTimes){
        
        System.out.println("The application logic works");
        this.ui.update();
        i++;
        
    }
    
    
}

}
