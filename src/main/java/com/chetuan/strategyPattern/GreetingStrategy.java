package com.chetuan.strategyPattern;

/**
 * @author 孙浩林
 * @date: 3/16/23 10:31
 *当代码中包含大量的if-else语句时，可以使用设计模式来优化代码。下面是一个使用策略模式优化if-else的示例代码：
 *
 * 假设我们有一个程序，它根据用户的国籍打印不同的问候语。使用if-else语句可能会导致代码重复和难以维护。
 *
 * 首先，我们创建一个接口GreetingStrategy，该接口定义了一个greet方法：
 *
 */
public interface GreetingStrategy {

    String greeting();

}
