package com.designPatterns.StrategyPattern.BehaviorsImpl;

import com.designPatterns.StrategyPattern.Behaviors.IFlyBehavior;

public class SlowFly implements IFlyBehavior {
    public void fly(){
        System.out.println("Flies Slowly...");
    }
}
