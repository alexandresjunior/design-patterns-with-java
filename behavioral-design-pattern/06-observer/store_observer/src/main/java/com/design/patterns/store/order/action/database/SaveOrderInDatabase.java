package com.design.patterns.store.order.action.database;

import com.design.patterns.store.order.Order;
import com.design.patterns.store.order.action.CreateOrderPostAction;

public class SaveOrderInDatabase implements CreateOrderPostAction{

    public void execute(Order order) {
        System.out.println("Saving order in database..." + order);
    }
    
}
