/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);
        Box smallBox = new Box(10);
        Box bigBox = new Box(20);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );
        smallBox.add(box);
        smallBox.add(new Book("My New Book", "Book about new things", 4));
        bigBox.add(smallBox);
        System.out.println( bigBox );
     
    }

}
