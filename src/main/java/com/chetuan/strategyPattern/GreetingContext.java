package com.chetuan.strategyPattern;

/**
 * @author 孙浩林
 * @date: 3/16/23 10:37
 */
public class GreetingContext {
    private GreetingStrategy greetingStrategy;

    public GreetingContext(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public void setGreetingStrategy(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public void greet() {
        System.out.println(greetingStrategy.greeting());
    }
}
