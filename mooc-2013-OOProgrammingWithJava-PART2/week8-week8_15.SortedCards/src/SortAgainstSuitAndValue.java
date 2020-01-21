
import java.util.Comparator;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{

    public SortAgainstSuitAndValue(){
        
    }
    
    
@Override    
public int compare(Card one, Card two){
    if(one.getSuit() < two.getSuit()){
        return -1;
        
    }else if(one.getSuit() > two.getSuit()){
        return 1;
    }else{
          return one.compareTo(two);
       }
    }    
    
}


