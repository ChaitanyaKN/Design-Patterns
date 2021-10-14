package com.designPatterns.StrategyPattern.Ducks;

import com.designPatterns.StrategyPattern.BehaviorsImpl.LoudQuack;
import com.designPatterns.StrategyPattern.BehaviorsImpl.SlowFly;

public class WildDuck extends Duck {

    public WildDuck() {
        super(new LoudQuack(), new SlowFly());
    }
}
