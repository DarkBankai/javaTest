package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o ) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i= observers.indexOf(o);
        if (i >= 0){
            this.observers.remove(o);
        }

    }

    @Override
    public void notifyObservers() {
        for (int i =0 ; i<observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }

    }


    void measurementsChanged(){
        notifyObservers();
    }
    

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
