package com.designPatterns.Observer.BehaviorsImpl;

import com.designPatterns.Observer.Behaviors.IDisplay;

public class DisplayBrackets implements IDisplay {

    public void Display(String text) {
        System.out.println("(" + text + ")");
    }
}
