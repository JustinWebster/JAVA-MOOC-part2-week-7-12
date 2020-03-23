package containers;

public class Container {

    private double capacity;
    private double volume;

    public Container(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        volume = 0.0;
    }

    public double getVolume() {
        return volume;
    }

    public double getOriginalCapacity() {
        return capacity;
    }

    public double getCurrentCapacity() {
        return capacity - volume;
    }

    public void addToTheContainer(double amount) {//adds product to container if product is too large adds until container full and throws away rest
        if (amount < 0) {
            return;
        }
        if (amount <= getCurrentCapacity()) {
            this.volume = this.volume + amount;
        } else {
            this.volume = this.capacity;
        }
    }

    public double takeFromTheContainer(double amount) {//removes x amount of product from container
        if (amount < 0) {
            return 0.0;
        }
        if (amount > volume) {
            double everything = volume;
            volume = 0.0;
            return everything;
        }

        volume = volume - amount;
        return amount;
    }

    @Override
    public String toString() {
        return "volume = " + volume + ", free space " + getCurrentCapacity();
    }
}
