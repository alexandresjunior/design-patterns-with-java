package com.design.patterns.store.tax;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class ISS implements Tax {

    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
    
}
