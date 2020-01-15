/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Book implements ToBeStored {

    private String author;
    private String bookName;
    private double bookWeight;
    
    public Book(String author, String bookName, double bookWeight){
        
        this.author = author;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
        
    }
    @Override
    public double weight(){
        return this.bookWeight;
    }
    
    @Override
    public String toString(){
        return this.author + ": " + this.bookName;
    }

}
