package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class DiscountMoreThanFiveItems extends Discount {
    
    public DiscountMoreThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getNumberOfItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.10"));
        }

        return next.calculate(budget);
    }

}
