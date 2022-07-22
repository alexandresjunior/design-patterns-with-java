package com.design.patterns.store;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.tax.TaxCalculator;
import com.design.patterns.store.tax.TaxType;

public class TaxApp {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));

        System.out.println(TaxCalculator.calculate(budget, TaxType.ICMS));
        System.out.println(TaxCalculator.calculate(budget, TaxType.ISS));
    }

}
