package observerPattern.weatherStation;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setMeasurements(float temp, float pre, float hm);
}
