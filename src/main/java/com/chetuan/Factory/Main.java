package com.chetuan.Factory;

import com.chetuan.Factory.Card.IDCard;
import com.chetuan.Factory.Card.IDCardFactory;
import com.chetuan.Factory.Framework.Factory;
import com.chetuan.Factory.Framework.Product;

import java.util.List;

/**
 * @author 孙浩林
 * @date: 8/23/23 15:40
 */
public class Main {

    public static void main(String[] args) {
        IDCardFactory factory =new IDCardFactory();

        Product xiaoming = factory.create("xiaoming");
        Product xiaohua = factory.create("xiaohua");
        Product xiaogang = factory.create("xiaogang");
        xiaoming.use();
        xiaohua.use();
        xiaogang.use();

    }

}
