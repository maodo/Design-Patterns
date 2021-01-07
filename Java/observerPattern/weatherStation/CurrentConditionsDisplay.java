package observerPattern.weatherStation;

public class CurrentConditionsDisplay implements  Observer, DisplayElement{

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay() {
    }

    @Override
    public void update(float temperature, float humidity, float pression) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : temperature = "+temperature+"° "+"------ humidity : "+humidity);
    }
}
