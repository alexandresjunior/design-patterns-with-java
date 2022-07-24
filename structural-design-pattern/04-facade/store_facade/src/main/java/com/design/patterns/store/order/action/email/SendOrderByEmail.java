package com.design.patterns.store.order.action.email;

import com.design.patterns.store.order.Order;
import com.design.patterns.store.order.action.CreateOrderPostAction;

public class SendOrderByEmail implements CreateOrderPostAction {

    public void execute(Order order) {
        System.out.println("Sending e-mail to client..." + order);
    }
    
}
