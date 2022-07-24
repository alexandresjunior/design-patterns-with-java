package com.design.patterns.store;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;
import com.design.patterns.store.tax.ICMS;
import com.design.patterns.store.tax.ICMSWithISS;
import com.design.patterns.store.tax.ISS;
import com.design.patterns.store.tax.TaxCalculator;

public class TaxApp {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));

        System.out.println(TaxCalculator.calculate(budget, new ICMS()));
        System.out.println(TaxCalculator.calculate(budget, new ISS()));

        System.out.println(TaxCalculator.calculate(budget, new ICMSWithISS()));
    }

}
