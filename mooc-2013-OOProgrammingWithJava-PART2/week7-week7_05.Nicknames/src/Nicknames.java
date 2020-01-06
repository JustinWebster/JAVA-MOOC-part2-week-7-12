
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> hashing = new HashMap<String, String>();
        hashing.put("matti", "mage");
        hashing.put("mikael", "mixu");
        hashing.put("arto", "arppa");
        
        String mikaelsNickname = hashing.get("mikael");
        System.out.println(mikaelsNickname);
        // Do the operations requested in the assignment here!
    }
 
}
