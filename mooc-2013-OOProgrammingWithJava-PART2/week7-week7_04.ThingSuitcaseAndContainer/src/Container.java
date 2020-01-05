
import java.util.ArrayList;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class Container {

    private final int MAX_CONTAINER_WEIGHT;
    private ArrayList<Suitcase> suitCases;

    public Container(int maxWeight) {
        this.suitCases = new ArrayList();
        this.MAX_CONTAINER_WEIGHT = maxWeight;

    }

    public int containerWeight() {
        int currentWeight = 0;
        for (Suitcase p : this.suitCases) {
            currentWeight += p.totalWeight();

        }
        return currentWeight;
    }

    public void addSuitcase(Suitcase caseToAdd) {
        if (this.containerWeight() + caseToAdd.totalWeight() <= this.MAX_CONTAINER_WEIGHT) {
            this.suitCases.add(caseToAdd);
        }
    }

    public void printThings() {

        for (Suitcase p : this.suitCases) {
            p.printThings();
        }
    }

    @Override
    public String toString() {
        return this.suitCases.size() + " suitcases (" + this.containerWeight() + " kg)";
    }
}
