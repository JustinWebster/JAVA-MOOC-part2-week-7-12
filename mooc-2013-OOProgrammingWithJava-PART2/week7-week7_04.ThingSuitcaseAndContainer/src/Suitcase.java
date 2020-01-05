
import java.util.ArrayList;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class Suitcase {

    private final int MAX_WEIGHT;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.MAX_WEIGHT = maxWeight;
        this.things = new ArrayList();
        int currentWeight = 0;

    }

    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        } else {
            Thing heaviestThing = this.things.get(0);

            for (Thing x : this.things) {
                if (heaviestThing.getWeight() <= x.getWeight()) {
                    heaviestThing = x;

                }

            }

            return heaviestThing;
        }
    }

    public void printThings() {

        for (Thing p : this.things) {
            System.out.println(p);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Thing p : this.things) {
            currentWeight += p.getWeight();

        }
        return currentWeight;
    }

    public void addThing(Thing thing) {

        if (this.totalWeight() + thing.getWeight() <= this.MAX_WEIGHT) {
            this.things.add(thing);

        }
    }

    @Override
    public String toString() {
        if (this.things.size() > 1) {
            return this.things.size() + " things (" + this.totalWeight() + "kg)";
        }
        if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight() + "kg)";
        } else {
            return "empty (0 kg)";
        }
    }
}
