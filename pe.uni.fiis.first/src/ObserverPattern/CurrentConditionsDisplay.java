package ObserverPattern;

public class CurrentConditionsDisplay implements Observer ,DisplayElement {
    @Override
    public void display() {
        //Debe mostrar los datos de las condiciones actules
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        //Se debe implementar como se actualiza en caso de las condiciones actuales
    }
}
