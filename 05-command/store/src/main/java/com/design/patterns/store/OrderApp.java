package com.design.patterns.store;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.order.Order;

public class OrderApp {

    public static void main(String[] args) {
        String clientName = "Alexandre de Souza Jr.";
        LocalDateTime date = LocalDateTime.now();
        Budget budget = new Budget(new BigDecimal("100"), 3);

        Order order = new Order(clientName, date, budget);

        System.out.println("Saving order in database..." + order);
        System.out.println("Sending e-mail to client..." + order);

        // Other actions to be executed
    }
    
}
