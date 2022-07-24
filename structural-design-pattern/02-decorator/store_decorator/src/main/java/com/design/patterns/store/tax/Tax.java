package com.design.patterns.store.tax;

import java.math.BigDecimal;
import java.util.Objects;

import com.design.patterns.store.budget.Budget;

public abstract class Tax {

    private Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal doCalculation(Budget budget);

    public BigDecimal calculate(Budget budget) {
        BigDecimal taxValue = doCalculation(budget);

        BigDecimal otherTaxValue = BigDecimal.ZERO;

        if (Objects.nonNull(otherTax)) {
            otherTaxValue = otherTax.calculate(budget);
        }

        return taxValue.add(otherTaxValue);
    };
    
}
