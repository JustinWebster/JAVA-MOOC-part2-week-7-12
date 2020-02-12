package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection counter = new WordInspection(file);
        try{
            System.out.println(counter.wordCount());
            System.out.println(counter.wordsContainingZ());
            System.out.println(counter.wordsEndingInL());
            System.out.println(counter.palindromes());
            System.out.println(counter.wordsWhichContainAllVowels());
        } catch(Exception e){
            System.out.println("Empty file");
        }
     

    }
}
