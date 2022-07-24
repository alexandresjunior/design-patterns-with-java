package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal getCalculatedDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldDiscountBeApplied(Budget budget) {
        return true;
    }


}
