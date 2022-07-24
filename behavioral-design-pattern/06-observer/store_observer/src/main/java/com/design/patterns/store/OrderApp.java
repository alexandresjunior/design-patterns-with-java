package com.design.patterns.store;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.order.Order;
import com.design.patterns.store.order.action.database.SaveOrderInDatabase;
import com.design.patterns.store.order.action.email.SendOrderByEmail;
import com.design.patterns.store.order.command.CreateOrderHandler;

public class OrderApp {

    public static void main(String[] args) {
        String clientName = "Alexandre";
        LocalDateTime date = LocalDateTime.now();
        Budget budget = new Budget(new BigDecimal("300"), Integer.parseInt("2"));

        CreateOrderHandler createOrderHandler = new CreateOrderHandler(
            Arrays.asList(
                new SaveOrderInDatabase(), 
                new SendOrderByEmail()          
                // Other actions to be executed: invoice, logs etc.
            )
        );
        
        createOrderHandler.execute(new Order(clientName, date, budget));
    }
    
}
