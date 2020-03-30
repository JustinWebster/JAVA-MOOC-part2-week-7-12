
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private ArrayList<String> strings = new ArrayList();
    private Scanner reader;

    public List<String> read(String file) throws FileNotFoundException {
        File e = new File(file);
        this.reader = new Scanner(e);
        while (this.reader.hasNext()) {
            String s = this.reader.nextLine();
            this.strings.add(s);
        }
        return strings;
    }

    public void save(String file, String text) throws IOException{
        
        File e = new File(file);
        e.createNewFile();
        
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException{
        File e = new File(file);
        e.createNewFile();
        FileWriter writer = new FileWriter(file);
        for (String s : texts) {
            
            writer.write(s + "\n");
        }
        writer.close();
    }
}
