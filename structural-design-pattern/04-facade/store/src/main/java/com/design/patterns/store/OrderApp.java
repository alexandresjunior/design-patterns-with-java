package com.design.patterns.store;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.order.Order;
import com.design.patterns.store.order.command.CreateOrderHandler;

public class OrderApp {

    public static void main(String[] args) {
        String clientName = args[0];
        LocalDateTime date = LocalDateTime.now();
        Budget budget = new Budget(new BigDecimal(args[1]), Integer.parseInt(args[2]));

        CreateOrderHandler createOrderHandler = new CreateOrderHandler(/* dependencies */);
        
        createOrderHandler.execute(new Order(clientName, date, budget));
        
    }
    
}
