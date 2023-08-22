package com.chetuan.Adapter.BaseOnClass;

public class Main {

    public static void main(String[] args) {
        Print p =new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
        Class<? extends Print> aClass = p.getClass();
        System.out.println(aClass.getName());

    }

}
