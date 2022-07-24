package com.design.patterns.store.order.command;

import java.util.List;

import com.design.patterns.store.order.Order;
import com.design.patterns.store.order.action.CreateOrderPostAction;

public class CreateOrderHandler {

    private List<CreateOrderPostAction> actions;

    public CreateOrderHandler(List<CreateOrderPostAction> actions) {
        this.actions = actions;
    }

    public void execute(Order order) {
        for (CreateOrderPostAction action : actions) {
            action.execute(order);
        }
    }
    
}
