package com.design.patterns.store.tax;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class ICMS extends Tax {

    public ICMS(Tax otherTax) {
        super(otherTax);
    }

    @Override
    protected BigDecimal doCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
    
}
