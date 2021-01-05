package observerPattern.simpleImplementation;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    int getState();
}
