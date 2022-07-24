package com.design.patterns.store.order.action;

import com.design.patterns.store.order.Order;

public interface CreateOrderPostAction {
    
    public void execute(Order order);

}
