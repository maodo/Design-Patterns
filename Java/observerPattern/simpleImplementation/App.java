package observerPattern.simpleImplementation;

public class App {
    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        ConcreteSubject subject = new ConcreteSubject();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.setState(10);
        //
        System.out.println("----------------------------");
        subject.removeObserver(observer2);
        subject.setState(12);
    }
}
