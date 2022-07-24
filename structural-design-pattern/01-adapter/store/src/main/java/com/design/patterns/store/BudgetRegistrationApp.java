package com.design.patterns.store;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.budget.registration.BudgetRegistration;

public class BudgetRegistrationApp {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("1000"), 3);

        BudgetRegistration.register(budget);
    }
    
}
