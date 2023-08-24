package com.chetuan.Prototype;


import com.chetuan.Prototype.framwork.Manager;
import com.chetuan.Prototype.framwork.Product;
import oracle.jvm.hotspot.jfr.Producer;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        UnderlinPen upen = new UnderlinPen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message",upen);
        manager.register("warning box",mBox);
        //生成
        Product p1 = manager.create("strong message");
        p1.use("Hello,World");
        Product p2 =manager.create("warning box");
        p2.use("hello,World");
        Product p3 =manager.create("slash box");
        p3.use("hello,World");
    }

}
