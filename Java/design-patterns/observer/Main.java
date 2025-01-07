import java.util.ArrayList;
import java.util.List;

public void main(String[] args) {

    Smartphone smartphoneObserver = new Smartphone();

    WheatherStation station = new WheatherStation();
    station.addObserver(smartphoneObserver);
    station.setWeather("cloudy");
    station.updateObservers();

    smartphoneObserver.diplay();

    station.setWeather("rainy");
    station.updateObservers();

    smartphoneObserver.diplay();

}

interface Subject {

    void addObserver(WeatherObserver o);

    void removeObserver(WeatherObserver o);

    public void updateObservers();
}

interface WeatherObserver {
    public void update(String weather);

    void diplay();
}

class WheatherStation implements Subject {

    List<WeatherObserver> weatherObservers = new ArrayList<>();

    String weather = "";

    @Override
    public void addObserver(WeatherObserver o) {
        weatherObservers.add(o);
    }

    @Override
    public void removeObserver(WeatherObserver o) {
        weatherObservers.remove(o);
    }

    @Override
    public void updateObservers() {
        weatherObservers.forEach(o -> o.update(this.weather));
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}

class Smartphone implements WeatherObserver {

    String weather = "";

    @Override
    public void update(String weather) {
        this.weather = weather;
    }

    @Override
    public void diplay() {
        System.out.println("Weather : " + this.weather);
    }
}
