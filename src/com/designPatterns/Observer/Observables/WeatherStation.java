package com.designPatterns.Observer.Observables;

import java.util.Observable;

public class WeatherStation extends Observable {
    public int getTemperature() {
        return Temperature;
    }

    public String getCondition() {
        return condition.toString();
    }

    public int getHumidity() {
        return Humidity;
    }

    private int Temperature;
    private Condition condition;
    private int Humidity;
    public void processNewReport(int temperature, int humidity, Condition condition){
        this.condition = condition;
        this.Temperature = temperature;
        this.Humidity = humidity;
        this.setChanged();
        notifyObservers();
    }
}

