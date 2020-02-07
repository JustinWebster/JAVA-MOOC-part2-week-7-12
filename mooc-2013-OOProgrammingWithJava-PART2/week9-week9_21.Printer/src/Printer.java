
import java.io.File;
import java.util.Scanner;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Printer {
    
    private String fileName;
    private Scanner reader;
    
    public Printer(String fileName){
        
        this.fileName = fileName;
        
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        
        File file = new File(this.fileName);
        this.reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNext()){
            
          
           String lineToPrnt = reader.nextLine();
           if(lineToPrnt.contains(word)){
            System.out.println(lineToPrnt);
           }
          
         
          
        }
        reader.close();
    }
    
}
