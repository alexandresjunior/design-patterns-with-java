package com.design.patterns.store.proxy;

import java.math.BigDecimal;
import java.util.Objects;

import com.design.patterns.store.evaluable.budget.Budget;

public class BudgetProxy extends Budget {

    private BigDecimal value;
    private Budget budget;

    public BudgetProxy(Budget budget) {
        super(budget.getValue());
        this.budget = budget;
    }

    public BigDecimal getValue() {
        if (Objects.isNull(this.value)) {
            // Simulate cache
            this.value = budget.getValue();
        }

        return value;
    }

    
}
