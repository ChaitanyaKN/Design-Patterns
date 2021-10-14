package com.designPatterns;

import com.designPatterns.Observer.Observables.Condition;
import com.designPatterns.Observer.Observables.WeatherStation;
import com.designPatterns.Observer.Observers.PCDisplay;
import com.designPatterns.Observer.Observers.PhoneDisplay;
import com.designPatterns.StrategyPattern.Ducks.Duck;
import com.designPatterns.StrategyPattern.Ducks.SuperDuck;
import com.designPatterns.StrategyPattern.Ducks.WildDuck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        System.out.println("Choose the pattern:");
        System.out.println("1 : strategy");
        System.out.print("Enter the number:");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String pattern = reader.readLine();
        switch (pattern){
            case "1":
                runStrategy();
            case "2":
                runObserver();
        }

    }
    static void runStrategy(){
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();

        Duck superDuck = new SuperDuck();
        superDuck.fly();
        superDuck.quack();
    }

    static void runObserver(){
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        PCDisplay pcDisplay = new PCDisplay(weatherStation);

        weatherStation.processNewReport(26, 99, Condition.RAINY);
        weatherStation.processNewReport(38, 10, Condition.SUNNY);
    }
}
