package com.chetuan.Prototype;


import com.chetuan.Prototype.framwork.Product;

public class UnderlinPen implements Product {

    private char ulchar;

    public UnderlinPen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
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
