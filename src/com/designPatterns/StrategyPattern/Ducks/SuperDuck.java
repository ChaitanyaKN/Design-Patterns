package com.designPatterns.StrategyPattern.Ducks;

import com.designPatterns.StrategyPattern.BehaviorsImpl.JetFly;
import com.designPatterns.StrategyPattern.BehaviorsImpl.LoudQuack;

public class SuperDuck extends Duck {

    public SuperDuck() {
        super(new LoudQuack(), new JetFly());
    }
}
