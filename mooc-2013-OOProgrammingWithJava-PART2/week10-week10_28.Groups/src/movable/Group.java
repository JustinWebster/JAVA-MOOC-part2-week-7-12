/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> listOfOrganisms;

    public Group() {
        this.listOfOrganisms = new ArrayList();
    }

    public void addToGroup(Movable movable) {//adds an object that implemnts "Movable" to the group
        this.listOfOrganisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {//moves each organism in the group by the specified values
        for (Movable m : this.listOfOrganisms) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String list = "";
        for (int i = 0; i < this.listOfOrganisms.size(); i++) {
            list += this.listOfOrganisms.get(i) + "\n";
        }
        return list;
    }

}
