package com.designPatterns.StrategyPattern.BehaviorsImpl;

import com.designPatterns.StrategyPattern.Behaviors.IQuackBehavior;

public class LoudQuack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quacks Loudly");
    }
}
