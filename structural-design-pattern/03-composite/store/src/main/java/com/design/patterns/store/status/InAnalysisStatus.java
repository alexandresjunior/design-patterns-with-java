package com.design.patterns.store.status;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class InAnalysisStatus extends BudgetStatus {
    
    @Override
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setStatus(new ApprovedStatus());
    }

    @Override
    public void reprove(Budget budget) {
        budget.setStatus(new ReprovedStatus());
    }

}
