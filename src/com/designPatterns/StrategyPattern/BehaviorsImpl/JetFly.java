package com.designPatterns.StrategyPattern.BehaviorsImpl;

import com.designPatterns.StrategyPattern.Behaviors.IFlyBehavior;

public class JetFly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("Zooming at mach 3");
    }
}
