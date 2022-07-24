package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public abstract class Discount {
    
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public abstract BigDecimal calculate(Budget budget);

}
