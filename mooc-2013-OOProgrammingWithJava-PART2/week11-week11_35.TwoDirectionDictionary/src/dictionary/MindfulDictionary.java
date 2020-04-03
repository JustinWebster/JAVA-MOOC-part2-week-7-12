/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MindfulDictionary {

    private Map<String, String> dictionary;
    private String fileName;
    
    public MindfulDictionary(){
        this.dictionary = new HashMap();
    }
    
    public MindfulDictionary(String file){//stores the fileName for later use and creates the "dictionary"
        this.fileName = file;
        this.dictionary = new HashMap();
    }
    
    public boolean load(){//using the fileName tries to create a file object and scanner to read the file, splits each line at the : and adds to the dictionary
        try{
            File f = new File(this.fileName);
            Scanner fileReader = new Scanner(f);
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
                
            }
            return true;
        }catch (IOException e){
            return false;
        }
    }
    
    public boolean save(){//tries to create a FileWriter and the writes the dictionary content into the given file
        FileWriter writer;
        try{
             writer = new FileWriter(this.fileName);
             for(String key : this.dictionary.keySet()){
                 writer.write(key + ":" + this.dictionary.get(key));
                 writer.write("\n");
             }
             writer.close();
             return true;
        } catch (IOException e){
            return false;
        }
    }
    
    public void add(String word, String translation){//adds words to the dictionary
        if(!this.dictionary.containsKey(word)){
            this.dictionary.put(word, translation);
            
        }
    }
    
    public String translate(String word){//translates the given word if the dictionary contains it
        String trnslation = null;
        for(String key : this.dictionary.keySet()){
            if(key.equalsIgnoreCase(word)){
                trnslation = this.dictionary.get(key);
            }else if(this.dictionary.get(key).equals(word)){
                trnslation = key;
            }
        }
        return trnslation;
    }
    
    public void remove(String word){// removes a tranlation pair from the dictionary
        String remove = translate(word);
        this.dictionary.remove(word);
        this.dictionary.remove(remove);
        
    }
}
