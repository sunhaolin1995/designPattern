package com.chetuan.Adapter.BaseOnClass;


/***
 * PrintBanner 扮演了适配器的角色，他继承了 Banner 类
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
