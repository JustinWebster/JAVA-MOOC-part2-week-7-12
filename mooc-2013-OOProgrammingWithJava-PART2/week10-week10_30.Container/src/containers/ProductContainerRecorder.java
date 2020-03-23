/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package containers;

/**
 *
 * @author spike
 */
public class ProductContainerRecorder extends ProductContainer {
    
    
    private ContainerHistory productHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        
        super.addToTheContainer(initialVolume);
        this.productHistory = new ContainerHistory();
        this.productHistory.add(initialVolume);
    }
    @Override
    public void addToTheContainer(double amount){//same as superclass method but records the value on history
        super.addToTheContainer(amount);
        this.productHistory.add(super.getVolume());
    }
    @Override
    public double takeFromTheContainer(double amount){//same as superclass method but records the value on history
        double vol = super.takeFromTheContainer(amount);
        this.productHistory.add(super.getVolume());

        return vol;
    }
    
    public String history() {
        return this.productHistory.toString();
    }
    
    public void printAnalysis(){// prints out an analysis of the container
        System.out.println("Product: " + this.getName() 
                + "\nHistory: " + this.history()
                + "\nGreatest product amount: " + this.productHistory.maxValue()
                + "\nSmallest product amount: " + this.productHistory.minValue()
                + "\nAverage: " + this.productHistory.average()
                + "\nGreatest change: " + this.productHistory.greatestFluctuation()
                + "\nVariance: " + this.productHistory.variance());
    }
    
}
