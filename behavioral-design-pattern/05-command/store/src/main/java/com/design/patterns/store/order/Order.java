package com.design.patterns.store.order;

import java.time.LocalDateTime;

import com.design.patterns.store.budget.Budget;

public class Order {
    
    private String clientName;
    private LocalDateTime date;
    private Budget budget;
    
    public Order(String clientName, LocalDateTime date, Budget budget) {
        this.clientName = clientName;
        this.date = date;
        this.budget = budget;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Budget getBudget() {
        return budget;
    }

}
