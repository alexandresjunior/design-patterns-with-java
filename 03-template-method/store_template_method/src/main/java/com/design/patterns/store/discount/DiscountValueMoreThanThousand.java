package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class DiscountValueMoreThanThousand extends Discount {

    public DiscountValueMoreThanThousand(Discount next) {
        super(next);
    } 

    @Override
    public BigDecimal getCalculatedDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldDiscountBeApplied(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }

}
