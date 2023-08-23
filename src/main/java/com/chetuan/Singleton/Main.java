package com.chetuan.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2){
            System.out.println("是相同的实例捏");
        }else {
            System.out.println("不是相同的实例捏");
        }


    }

}
