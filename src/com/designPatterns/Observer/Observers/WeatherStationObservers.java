package com.designPatterns.Observer.Observers;

import com.designPatterns.Observer.Behaviors.IDisplay;
import com.designPatterns.Observer.Observables.WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class WeatherStationObservers implements Observer{
    private IDisplay displayString;


    public WeatherStationObservers(IDisplay displayString, WeatherStation weatherStation) {
        this.displayString = displayString;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.displayString.Display("The temperature is : " + ((WeatherStation)o).getTemperature());
        this.displayString.Display("The Condition is : " + ((WeatherStation)o).getCondition());
        this.displayString.Display("The Humidity is : " + ((WeatherStation)o).getHumidity());
    }
}
