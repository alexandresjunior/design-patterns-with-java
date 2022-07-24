package com.design.patterns.store.evaluable.item;

import java.math.BigDecimal;

import com.design.patterns.store.evaluable.Evaluable;

public class Item implements Evaluable {

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
