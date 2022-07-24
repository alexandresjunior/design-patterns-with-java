package com.design.patterns.store.status;

import com.design.patterns.store.budget.Budget;

public class ReprovedStatus extends BudgetStatus {
    
    @Override
    public void finish(Budget budget) {
        budget.setStatus(new FinishedStatus());
    }

}
