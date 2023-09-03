package com.chetuan.Strategy;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {//赋予姓名和策略
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){//胜
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose(){//胜
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even(){
        gamecount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", wincount=" + wincount +
                ", losecount=" + losecount +
                ", gamecount=" + gamecount +
                '}';
    }
}
