package com.design.patterns.store.status;

import java.math.BigDecimal;

import com.design.patterns.store.evaluable.budget.Budget;

public class ApprovedStatus extends BudgetStatus {

    @Override
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }
    
    @Override
    public void finish(Budget budget) {
        budget.setStatus(new FinishedStatus());
    }

}
