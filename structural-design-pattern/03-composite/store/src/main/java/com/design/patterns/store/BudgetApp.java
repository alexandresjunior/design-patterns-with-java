package com.design.patterns.store;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.budget.item.Item;
import com.design.patterns.store.exception.BudgetStatusException;

public class BudgetApp {

    public static void main(String[] args) throws BudgetStatusException {
        Budget budget1 = new Budget(new BigDecimal("200"));
        budget1.addItem(new Item(new BigDecimal("40")));
        budget1.reprove();

        System.out.println(budget1.getValue());

        Budget budget2 = new Budget(new BigDecimal("1000"));
        // budget2.addItem(budget1);    // It's not possible to leverage the old budget's items.
        budget2.addItem(new Item(new BigDecimal("70")));

        System.out.println(budget2.getValue());
    }
    
}
