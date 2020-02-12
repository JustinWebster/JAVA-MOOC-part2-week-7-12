package file;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/testfile.txt");
        Analysis x = new Analysis(file);
        try {
            System.out.println("Lines: " + x.lines());
            System.out.println("Characters: " + x.characters());
        } catch (Exception e) {
            System.out.println("File empty");
        }
    }
}
