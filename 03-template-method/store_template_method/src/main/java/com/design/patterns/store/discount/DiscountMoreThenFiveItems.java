package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class DiscountMoreThenFiveItems extends Discount {

    public DiscountMoreThenFiveItems(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal getCalculatedDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.10"));
    }

    @Override
    protected boolean shouldDiscountBeApplied(Budget budget) {
        return budget.getNumberOfItems() > 5;
    }
    
}