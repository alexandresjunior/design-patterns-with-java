package com.design.patterns.store;

import java.math.BigDecimal;

import com.design.patterns.store.evaluable.budget.Budget;
import com.design.patterns.store.evaluable.item.Item;
import com.design.patterns.store.exception.BudgetStatusException;
import com.design.patterns.store.proxy.BudgetProxy;

public class BudgetApp {

    public static void main(String[] args) throws BudgetStatusException {
        Budget budget1 = new Budget(new BigDecimal("200"));
        budget1.addItem(new Item(new BigDecimal("40")));
        budget1.reprove();

        // System.out.println(budget1.getValue());

        Budget budget2 = new Budget(new BigDecimal("1000"));
        budget2.addItem(budget1);
        budget2.addItem(new Item(new BigDecimal("70")));

        BudgetProxy proxy = new BudgetProxy(budget2);

        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
    }
    
}
