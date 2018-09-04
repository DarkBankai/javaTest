package ObserverPattern;

public class ForecastDisplay implements Observer,DisplayElement {

    private float temperature;
    private float pressure;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    private void forecast(float temperature , float pressure , float humidity){
        if (temperature > 15 && pressure >2 && humidity < 20){
            System.out.printf("Today will have a sunny day");
        }
        if (temperature < 15 && pressure > 3 && humidity < 20){
            System.out.printf("Today will have a nublado  day");
        }
        if (temperature < 10 && pressure > 4 && humidity < 10){
            System.out.printf("Today will have a nublado  day");
        }

    }



    @Override
    public void display() {
        //muestra el pronostico
        forecast(temperature, pressure, humidity);
    }



    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity= humidity;
        this.pressure = pressure;
        display();
    }
}
