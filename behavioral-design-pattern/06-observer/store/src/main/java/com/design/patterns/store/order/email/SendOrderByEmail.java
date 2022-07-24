package com.design.patterns.store.order.email;

import com.design.patterns.store.order.Order;

public class SendOrderByEmail {

    public static void execute(Order order) {
        System.out.println("Sending e-mail to client..." + order);
    }
    
}
