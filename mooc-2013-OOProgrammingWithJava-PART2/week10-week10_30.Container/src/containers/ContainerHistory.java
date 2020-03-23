/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package containers;

import java.util.ArrayList;

public class ContainerHistory {

    private ArrayList<Double> containerHistory;

    public ContainerHistory() {
        this.containerHistory = new ArrayList();
    }

    public void add(double situation) {
        this.containerHistory.add(situation);
    }

    public void reset() {
        this.containerHistory.clear();
    }

    public double maxValue() {//returns the largest value in the container history
        double max = 0;
        for (double d : this.containerHistory) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {// returns the smallest value in the container history
        double min = this.containerHistory.get(0);
        for (double d : this.containerHistory) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double average() {//returns the average value of the container history
        double average = 0;

        for (double d : this.containerHistory) {
            average += d;
        }

        return average / this.containerHistory.size();
    }

    public double greatestFluctuation() {//determines the greatest fluctuation of values in the history

        double currentFluc;
        double greatestFluc = 0.0;
        for (int i = 1; i < this.containerHistory.size(); i++) {
            currentFluc = this.containerHistory.get(i - 1) - this.containerHistory.get(i);
            if (currentFluc < 0) {
                currentFluc *= -1;
            }
            if (currentFluc > greatestFluc) {
                greatestFluc = currentFluc;
            }
        }
        return Math.abs(greatestFluc);
    }

    public double variance() {//returns the variance of the history
        double av = this.average();
        double var = 0.0;
        for (double d : this.containerHistory) {
            var += Math.pow(d - av, 2);
        }
        var = var / (this.containerHistory.size() - 1);
        return var;
    }

    @Override
    public String toString() {

        return this.containerHistory.toString();
    }

}
