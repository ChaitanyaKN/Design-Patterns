package com.designPatterns.Observer.Observers;

import com.designPatterns.Observer.Behaviors.IDisplay;
import com.designPatterns.Observer.BehaviorsImpl.DisplaySquareBraces;
import com.designPatterns.Observer.Observables.WeatherStation;

public class PCDisplay extends WeatherStationObservers{
    private IDisplay displayString;
    WeatherStation weatherStation;
    public PCDisplay(WeatherStation weatherStation) {
        super(new DisplaySquareBraces(),weatherStation);
    }
}
