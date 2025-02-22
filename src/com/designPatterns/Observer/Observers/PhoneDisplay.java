package com.designPatterns.Observer.Observers;

import com.designPatterns.Observer.Behaviors.IDisplay;
import com.designPatterns.Observer.BehaviorsImpl.DisplayBrackets;
import com.designPatterns.Observer.Observables.WeatherStation;

public class PhoneDisplay extends WeatherStationObservers {
    private IDisplay displayString;
    WeatherStation weatherStation;
    public PhoneDisplay(WeatherStation weatherStation) {
        super(new DisplayBrackets(),weatherStation);
    }
}
