package ObserverPattern;

public class CurrentConditionsDisplay implements Observer ,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
         this.weatherData = weatherData;
         weatherData.registerObserver(this); //hace referencia a la misma clase es decir currentConditionsDisplay
    }

    @Override
    public void display( ) {
        //Debe mostrar los datos de las condiciones actules
        System.out.println("Current conditions: " + temperature + " C° degrees and "+ humidity + " % humidity"
        + pressure + " ATM");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        //Se debe implementar como se actualiza en caso de las condiciones actuales
        this.temperature= temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
