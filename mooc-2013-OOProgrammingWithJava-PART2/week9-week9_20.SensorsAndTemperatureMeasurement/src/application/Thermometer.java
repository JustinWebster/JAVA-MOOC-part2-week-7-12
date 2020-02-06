/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package application;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author spike
 */
public class Thermometer implements Sensor{
    
    private boolean onOff;
    
    public Thermometer(){
        this.onOff = false;
    }

    @Override
    public boolean isOn() {
        
        return onOff;
    }

    @Override
    public void on() {
        this.onOff = true; 
    }

    @Override
    public void off() {
        this.onOff = false;
    }

    @Override
    public int measure() {
        if(this.isOn()){
            int tempMeasure = ThreadLocalRandom.current().nextInt(-30, 31);
            return tempMeasure;
        }
            throw new IllegalStateException("Thermometer is off, switch on and try again!");
    }
    
}
