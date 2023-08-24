package com.chetuan.Prototype;


import com.chetuan.Prototype.framwork.Product;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i <length+4 ; i++) {
            System.out.println(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " +decochar);
        System.out.println("");

    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
