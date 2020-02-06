/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author spike
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList();
        this.readings = new ArrayList();
    }

    public List<Integer> readings() {
        return this.readings;
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        boolean on;
        int helper = 0;
        for (Sensor temp : this.sensors) {

            if (temp.isOn()) {
                helper++;
            }
            if (!temp.isOn()) {
                
                
            }

        }
        if(helper < this.sensors.size()){
            on = false;
        }else{
            on = true;
        }
        
        return on;    
        
    }

    @Override
    public void on() {
        boolean onOff;
        int helper = 0;
        for (Sensor temp : this.sensors) {

            if (temp.isOn()) {
                helper++;
            }
            if (!temp.isOn()) {
                temp.on();
                helper++;
            }

        }
        if (helper == this.sensors.size()) {
            onOff = true;
        }

    }

    @Override
    public void off() {
        for (Sensor x : this.sensors) {
            x.off();
        }
        
    }

    @Override
    public int measure() {
        int av = 0;
        int count = 0;

        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        for (Sensor y : this.sensors) {

            av += y.measure();
            count++;
        }
        av = av / count;
        this.readings.add(av);
        return av;
    }

}
