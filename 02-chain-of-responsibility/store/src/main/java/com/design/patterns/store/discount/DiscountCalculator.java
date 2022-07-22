package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class DiscountCalculator {
    
    public static BigDecimal calculate(Budget budget) {
        if (budget.getNumberOfItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.10"));
        }

        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return BigDecimal.ZERO;
    }

}
