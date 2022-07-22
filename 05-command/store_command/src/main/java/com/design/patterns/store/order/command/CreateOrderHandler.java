package com.design.patterns.store.order.command;

import com.design.patterns.store.order.Order;

public class CreateOrderHandler {

    /**
     * Constructor with all dependencies, including repository, services etc.
     */

    public void execute(Order order) {
        System.out.println("Saving order in database..." + order);
        System.out.println("Sending e-mail to client..." + order);

        // Other actions to be executed
    }
    
}
