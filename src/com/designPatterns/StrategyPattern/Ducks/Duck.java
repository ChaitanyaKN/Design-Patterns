package com.designPatterns.StrategyPattern.Ducks;

import com.designPatterns.StrategyPattern.Behaviors.IFlyBehavior;
import com.designPatterns.StrategyPattern.Behaviors.IQuackBehavior;

public class Duck {

    private IQuackBehavior quackBehavior;
    private IFlyBehavior flyBehavior;

    Duck(IQuackBehavior quackBehavior, IFlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void quack(){
        quackBehavior.quack();
    }
    public void fly(){
        flyBehavior.fly();
    }
}
