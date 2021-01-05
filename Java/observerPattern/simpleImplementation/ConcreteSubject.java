package observerPattern.simpleImplementation;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private  int state;

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
        observers.forEach(observer -> {
            observer.update(this);
        });
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public int getState() {
        return state;
    }
}
