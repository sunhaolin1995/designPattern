package com.chetuan.Strategy;

public class Hand {

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static final int HANDVALUE_GUU = 0;//表示石头
    public static final int HANDVALUE_CHO = 1;//表示剪刀
    public static final int HANDVALUE_PAA = 2;//表示布的值

    //表示猜拳中的3种手势的实例
    public static final Hand[] hand ={
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name={
            "石头","剪刀","布"
    };
    private int handvalue;//猜拳中的出的手势的值

    public static Hand getHand(int handvalue){
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand hand){
        return fight(hand) == 1;//如果this战胜了hand就返回true
    }

    public boolean isWeakerThan(Hand hand){
        return fight(hand) == -1;//如果this输给了hand就返回true
    }

    private int fight(Hand hand){
        if (this == hand){
            return 0;
        } else if ((this.handvalue +1)%3 == hand.handvalue) {
            return 1;
        }else {
            return -1;
        }
    }

    public String toString(){
        return name[handvalue];
    }

}
