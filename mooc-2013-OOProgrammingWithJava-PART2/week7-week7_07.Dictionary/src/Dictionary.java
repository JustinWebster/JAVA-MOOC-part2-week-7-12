
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Dictionary {
    private HashMap<String, String> translater;
    
    public Dictionary(){
        this.translater = new HashMap<String, String>();
    }
    
    public void add(String word, String translation){
        this.translater.put(word, translation);
    }
    
    public String translate(String word){
        if(this.translater.isEmpty()){
            return null;
        }
        else{
            
        return this.translater.get(word);
        
        }
        
    }
    
    public int amountOfWords(){
        return this.translater.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        for(String key : this.translater.keySet()){
            translationList.add(key + " = " + this.translater.get(key));
            
        }
        return translationList;
    }
    
}
