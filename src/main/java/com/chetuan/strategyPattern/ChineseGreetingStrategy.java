package com.chetuan.strategyPattern;

/**
 * @author 孙浩林
 * @date: 3/16/23 10:32
 *
 *然后我们创建不同的策略类来实现GreetingStrategy接口，
 * 每个类负责根据不同的国籍生成不同的问候语。例如，我们可以创建一个名为ChineseGreetingStrategy的类：
 */
public class ChineseGreetingStrategy implements GreetingStrategy {
    @Override
    public String greeting() {
        return "你好！";
    }
}
