package observerPattern.simpleImplementation;

public class ConcreteObserver implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("First observer notification. State is "+subject.getState());
    }
}
