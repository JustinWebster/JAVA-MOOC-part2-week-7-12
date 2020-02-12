/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private Scanner reader;
    private List<String> wordsContaining;

    public WordInspection(File file) {

        this.file = file;

    }

    public int wordCount() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        int words = 0;
        while (reader.hasNext()) {
            words++;
            reader.next();
        }
        return words;
    }

    public List<String> wordsContainingZ() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        this.wordsContaining = new ArrayList();
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("z")) {
                this.wordsContaining.add(word);
            }
        }
        return this.wordsContaining;
    }

    public List<String> wordsEndingInL() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        this.wordsContaining = new ArrayList();
        while (reader.hasNext()) {
            String wordCheck = reader.next();
            if (wordCheck.endsWith("l")) {
                this.wordsContaining.add(wordCheck);
            }
        }
        return this.wordsContaining;
    }

    public List<String> palindromes() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        this.wordsContaining = new ArrayList();
        while (reader.hasNext()) {
            String wordCheck = reader.next();
            String reversedWord = "";
            for (int i = wordCheck.length() - 1; i >= 0; i--) {
                reversedWord += wordCheck.charAt(i);

            }

            if (wordCheck.equals(reversedWord)) {
                this.wordsContaining.add(wordCheck);
            }
        }
        return this.wordsContaining;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        this.wordsContaining = new ArrayList();
        while (reader.hasNext()) {
            String vowelCheck = reader.next();
            if (vowelCheck.contains("a")) {
                if (vowelCheck.contains("e")) {
                    if (vowelCheck.contains("i")) {
                        if (vowelCheck.contains("o")) {
                            if (vowelCheck.contains("u")) {
                                if (vowelCheck.contains("y")) {
                                    if (vowelCheck.contains("ä")) {
                                        if (vowelCheck.contains("ö")) {
                                            this.wordsContaining.add(vowelCheck);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return this.wordsContaining;
    }

}
