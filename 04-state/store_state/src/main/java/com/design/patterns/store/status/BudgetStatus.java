package com.design.patterns.store.status;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.exception.BudgetStatusException;

public abstract class BudgetStatus {

    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return BigDecimal.ZERO;
    }
    
    public void approve(Budget budget) throws BudgetStatusException {
        throw new BudgetStatusException("Budget cannot be approved!");
    }

    public void reprove(Budget budget) throws BudgetStatusException {
        throw new BudgetStatusException("Budget cannot be reproved!");
    }

    public void finish(Budget budget) throws BudgetStatusException {
        throw new BudgetStatusException("Budget cannot be finished!");
    }

}
