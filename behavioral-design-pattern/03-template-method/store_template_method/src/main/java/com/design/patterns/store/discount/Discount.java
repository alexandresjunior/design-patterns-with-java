package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public abstract class Discount {
    
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if (shouldDiscountBeApplied(budget)) {
            return getCalculatedDiscount(budget);
        }

        return next.calculate(budget);
    }

    protected abstract BigDecimal getCalculatedDiscount(Budget budget);
    protected abstract boolean shouldDiscountBeApplied(Budget budget);

}
