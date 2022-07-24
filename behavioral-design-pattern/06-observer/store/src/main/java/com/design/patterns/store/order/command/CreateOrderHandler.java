package com.design.patterns.store.order.command;

import com.design.patterns.store.order.Order;
import com.design.patterns.store.order.database.SaveOrderInDatabase;
import com.design.patterns.store.order.email.SendOrderByEmail;

public class CreateOrderHandler {

    /**
     * Constructor with all dependencies, including repository, services etc.
     */

    public void execute(Order order) {
        SaveOrderInDatabase.execute(order);
        SendOrderByEmail.execute(order);

        // Other actions to be executed: invoice, logs etc.
    }
    
}
