package com.chetuan.Singleton.ticket;

import com.chetuan.Singleton.Singleton;

public class TicketMain {


    public static void main(String[] args) {
        TicketMaker ticketMaker = TicketMaker.getInstance();
        System.out.println(ticketMaker.getNextTicketNumber());
        System.out.println(ticketMaker.getNextTicketNumber());
        System.out.println(ticketMaker.getNextTicketNumber());
    }


}
