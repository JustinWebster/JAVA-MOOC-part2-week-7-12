
import java.util.ArrayList;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class Changer {

    private ArrayList<Change> changes;

    public Changer() {

        this.changes = new ArrayList<Change>();

    }

    public void addChange(Change change) {

        this.changes.add(change);

    }

    public String change(String characterString) {
        String mod = characterString;
        for (Change p : this.changes) {
            
          mod = p.change(mod);
            
        }

        return mod;

    }

}
