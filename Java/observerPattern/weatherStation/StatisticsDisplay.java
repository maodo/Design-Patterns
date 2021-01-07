package observerPattern.weatherStation;

public class StatisticsDisplay implements  Observer, DisplayElement{

    private float average;
    private float min;
    private float max;


    @Override
    public void display() {
        System.out.println("Statistics : Min = "+min+" --- Max : = "+max+" ---- Avg = "+average);
    }

    @Override
    public void update(float temperature, float humidity, float pression) {
        average = (temperature + humidity + pression)/3;
        min = Math.min(temperature,Math.min(pression,humidity));
        max = Math.max(temperature,Math.max(pression,humidity));
        display();
    }

}
