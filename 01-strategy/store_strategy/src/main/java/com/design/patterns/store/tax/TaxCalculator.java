package com.design.patterns.store.tax;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class TaxCalculator {
    
    public static BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }

}
