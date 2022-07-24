package com.design.patterns.store;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.budget.BudgetException;
import com.design.patterns.store.budget.http.impl.URLConnectionHttpAdapter;
import com.design.patterns.store.budget.registration.BudgetRegistration;

public class BudgetRegistrationApp {

    public static void main(String[] args) throws BudgetException {
        Budget budget = new Budget(new BigDecimal("1000"), 3);

        budget.approve();
        budget.finish();

        BudgetRegistration budgetRegistration = new BudgetRegistration(new URLConnectionHttpAdapter());
        
        // Other implementation options could be passed in as a parameter: HttpClient, REST libraries etc.
        
        budgetRegistration.register(budget);
    }
    
}
