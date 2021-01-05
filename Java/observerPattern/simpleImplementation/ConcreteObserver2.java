package observerPattern.simpleImplementation;

public class ConcreteObserver2 implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Second observer notification. State is "+subject.getState());
    }
}
