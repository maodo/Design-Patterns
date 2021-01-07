package observerPattern.weatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private final List<Observer> observers;
    private float temperature;
    private float pression;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature,humidity,pression));
    }

    @Override
    public void setMeasurements(float temp, float pre, float hm){
        temperature = temp;
        pression = pre;
        humidity = hm;
        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }

}
