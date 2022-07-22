package com.design.patterns.store.tax;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public interface Tax {

    BigDecimal calculate(Budget budget);
    
}
