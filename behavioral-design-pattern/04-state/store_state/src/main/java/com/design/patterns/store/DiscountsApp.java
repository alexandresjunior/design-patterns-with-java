package com.design.patterns.store;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.discount.DiscountCalculator;

public class DiscountsApp {

    public static void main(String[] args) {
        Budget budget1 = new Budget(new BigDecimal("200"), 6);
        Budget budget2 = new Budget(new BigDecimal("1000"), 1);

        System.out.println(DiscountCalculator.calculate(budget1));
        System.out.println(DiscountCalculator.calculate(budget2));
    }
    
}
