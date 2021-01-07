package observerPattern.weatherStation;

public interface Observer {
    void update(float temperature, float humidity,float pression);
}
