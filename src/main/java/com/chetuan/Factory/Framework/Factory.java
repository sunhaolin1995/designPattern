package com.chetuan.Factory.Framework;


public interface Factory {
    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);


    default Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

}
