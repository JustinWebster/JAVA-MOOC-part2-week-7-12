/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;
    private Scanner reader;

    public Analysis(File file) {

        this.file = file;

    }

    public int lines() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        int x = 0;
        while (reader.hasNextLine()) {
            x++;
            reader.nextLine();
        }
        return x;
    }

    public int characters() throws Exception {
        reader = new Scanner(this.file, "UTF-8");
        int y = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            y += line.length();

        }
        return y + this.lines();
    }

}
