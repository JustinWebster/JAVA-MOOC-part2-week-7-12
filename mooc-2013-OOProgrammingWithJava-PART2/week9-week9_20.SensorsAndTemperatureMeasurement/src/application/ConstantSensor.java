/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package application;


public class ConstantSensor implements Sensor{
    private int tempMeasure;
    
    public ConstantSensor(int temp){
        this.tempMeasure = temp;
    }
    

    @Override
    public boolean isOn() {
        return true; 
    }

    @Override
    public void on() {
        
    }

    @Override
    public void off() {
        
    }

    @Override
    public int measure() {
        return this.tempMeasure; 
    }
    
}
