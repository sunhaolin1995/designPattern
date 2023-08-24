package com.chetuan.Factory.Card;


import com.chetuan.Factory.Framework.Factory;
import com.chetuan.Factory.Framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory implements Factory {
    private List owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }

}
