
import java.util.Scanner;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class TextUserInterface {

    private Scanner command;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.command = reader;
        this.dict = dictionary;
    }

    public void start() {
        
        System.out.println("Statements: "
                + "\n add - adds a word pair to the dictionary "
                + "\n translate - asks a word and prints its translation "
                + "\n quit - quits the text user interface "
                + "\n ");
        
        while (true) {
            
            System.out.println("Statement: ");
            String statement = this.command.nextLine();
            if (statement.trim().equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if(statement.trim().equalsIgnoreCase("add")){
                
                System.out.println("In Finnish: ");
                String finWord = this.command.nextLine();
                System.out.println("In English: ");
                String engWord = this.command.nextLine();
                add(finWord, engWord);
                System.out.println("");
                
                
            }
            else if(statement.trim().equalsIgnoreCase("translate")){
                
                System.out.println("Give word: ");
                String wrdToTranslate = this.command.nextLine();
                System.out.println("Translation: ");
                translate(wrdToTranslate);
                System.out.println("");
                
            }else {
                System.out.println("Unknown statement");
                System.out.println("");
                
            }
        }
    }

    public void add(String finWord, String engWord) {
       
        this.dict.add(finWord, engWord);
       
        
    }
    
    public void translate(String wrdToTranslate){
        
        System.out.println(this.dict.translate(wrdToTranslate));
    }

}
