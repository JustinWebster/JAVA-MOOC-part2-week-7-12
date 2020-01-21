
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Hand implements Comparable<Hand>{
    
    private List<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card c : this.cards){
            System.out.println(c.toString());
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int handValue(){
        int handVal = 0;
        for(Card c : this.cards){
            handVal += c.getValue();
                    
        }
        return handVal;
    }
    
    public void sortAgainstSuit(){
        
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        Collections.sort(this.cards, sorter);
        
    }
    
    @Override
    public int compareTo(Hand hand){
        if(this.handValue() > hand.handValue()){
            return 1;
        }else if(this.handValue() < hand.handValue()){
            return -1;
        }else{
            return 0;
        }
    }
    
}
