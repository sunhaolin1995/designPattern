package com.chetuan.Prototype;


import com.chetuan.Prototype.framwork.Manager;
import com.chetuan.Prototype.framwork.Product;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        UnderlinPen upen = new UnderlinPen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message",upen);
        manager.register("warning box",mBox);
        manager.register("slash box",sBox);
        //生成
        Product p1 = manager.create("strong message");
        System.out.println(p1);
        p1.use("Hello,World");
        Product p2 =manager.create("warning box");
        System.out.println(p2);
        p2.use("hello,World");
        Product p3 =manager.create("slash box");
        System.out.println(p3);
        p3.use("hello,World");
    }

}
