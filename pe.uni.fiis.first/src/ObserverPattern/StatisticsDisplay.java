package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    @Override
    public void display() {
        //muestra el promedio , el mayor y menor de las mediciones
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

}
