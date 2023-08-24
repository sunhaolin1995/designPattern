package com.chetuan.Factory.Card;


import com.chetuan.Factory.Framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的 id 卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的 ID 卡");
    }

    public String getOwner(){
        return owner;
    }
}
