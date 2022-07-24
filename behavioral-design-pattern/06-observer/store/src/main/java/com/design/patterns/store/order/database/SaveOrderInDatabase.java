package com.design.patterns.store.order.database;

import com.design.patterns.store.order.Order;

public class SaveOrderInDatabase {

    public static void execute(Order order) {
        System.out.println("Saving order in database..." + order);
    }
    
}
