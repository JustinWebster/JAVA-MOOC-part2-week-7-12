
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();
        
        t.save("test/tmp/tmp48634.txt", "eka koerivi");
        for (String line : t.read("test/tmp/tmp48634.txt")) {
            System.out.println(line);
        }
    }
}
//src/testinput2.txt