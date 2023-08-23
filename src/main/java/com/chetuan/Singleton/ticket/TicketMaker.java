package com.chetuan.Singleton.ticket;

import com.chetuan.Singleton.Singleton;

public class TicketMaker {


    private int ticket = 1000;

    private static TicketMaker ticketMaker = new TicketMaker();

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }


    public static TicketMaker getInstance(){
        return ticketMaker;
    }

}
