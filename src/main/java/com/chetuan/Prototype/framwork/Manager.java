package com.chetuan.Prototype.framwork;


import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name,Product product){
        showcase.put(name,product);
    }

    public Product create(String protoName){
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }

}
