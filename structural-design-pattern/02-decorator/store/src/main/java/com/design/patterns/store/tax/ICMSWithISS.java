package com.design.patterns.store.tax;

import java.math.BigDecimal;

import com.design.patterns.store.budget.Budget;

public class ICMSWithISS implements Tax {

    @Override
    public BigDecimal calculate(Budget budget) {
        BigDecimal taxICMS = new ICMS().calculate(budget);
        BigDecimal taxISS = new ISS().calculate(budget);

        return taxICMS.add(taxISS);
    }
    
}
