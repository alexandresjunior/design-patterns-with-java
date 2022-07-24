package com.design.patterns.store.discount;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class DiscountCalculator {
    
    public static BigDecimal calculate(Budget budget) {
        Discount discount = new DiscountMoreThanFiveItems(new DiscountMoreThanThousand(new NoDiscount()));

        return discount.calculate(budget);
    }

}
