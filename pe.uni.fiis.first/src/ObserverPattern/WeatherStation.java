package ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        System.out.println(weatherData.observers.size());
        weatherData.setMeasurements(20,50,4);
        //weatherData.setMeasurements(30,15,2);
    }

}
