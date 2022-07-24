package com.design.patterns.store.status;

import com.design.patterns.store.evaluable.budget.Budget;

public class ReprovedStatus extends BudgetStatus {
    
    @Override
    public void finish(Budget budget) {
        budget.setStatus(new FinishedStatus());
    }

}
