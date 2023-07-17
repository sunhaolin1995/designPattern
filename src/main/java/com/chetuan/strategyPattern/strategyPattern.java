package com.chetuan.strategyPattern;


/**
 * @author 孙浩林
 * @date: 3/16/23 10:38
 */
public class strategyPattern {
    public static void main(String[] args) {


        GreetingContext context = new GreetingContext(new ChineseGreetingStrategy());
        context.greet();
    }
}
