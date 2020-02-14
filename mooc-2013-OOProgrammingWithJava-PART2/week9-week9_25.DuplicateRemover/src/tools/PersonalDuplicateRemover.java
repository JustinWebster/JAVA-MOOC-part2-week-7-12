/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author spike
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> strings;
    private int duplicates;
    
    public PersonalDuplicateRemover(){
        
        this.strings = new HashSet();
        this.duplicates = 0;
        
    }


    @Override
    public void add(String characterString) {
        
        if(!this.strings.contains(characterString)){
            this.strings.add(characterString);
        }else{
            this.duplicates++;
        }
        
        
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        
        return this.duplicates;
        
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.strings;
    }

    @Override
    public void empty() {
      this.strings.removeAll(strings);
      this.duplicates = 0;
    }
    
    
}
