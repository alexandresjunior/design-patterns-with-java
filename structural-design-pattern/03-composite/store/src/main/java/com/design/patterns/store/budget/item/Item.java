package com.design.patterns.store.budget.item;

import java.math.BigDecimal;

public class Item {

    private BigDecimal value;

    public Item(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
