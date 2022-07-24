package com.design.patterns.store.budget.registration;

import java.util.HashMap;
import java.util.Map;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.budget.BudgetException;
import com.design.patterns.store.budget.http.HttpAdapter;

public class BudgetRegistration {

    private HttpAdapter httpAdapter;

    public BudgetRegistration(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void register(Budget budget) throws BudgetException {
        if (!budget.isFinished()) {
            throw new BudgetException("Budget is not finished!");
        }

        String url = "http://external.api/budget";

        Map<String, Object> data = new HashMap<>();
        
        data.put("value", budget.getValue());
        data.put("numberOfItems", budget.getNumberOfItems());
        
        this.httpAdapter.post(url, data);

        System.out.println("Order successfully registered!");
    }

}
