package observerPattern.weatherStation;

public class App {

    public static void main(String[] args) {
        Subject observable = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        observable.registerObserver(conditionsDisplay);
        observable.registerObserver(statisticsDisplay);
        observable.setMeasurements(5,6,10);
        observable.removeObserver(conditionsDisplay);
        observable.setMeasurements(6,7,11);

    }
}
