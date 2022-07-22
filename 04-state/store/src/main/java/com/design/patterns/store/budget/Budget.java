package com.design.patterns.store.budget;

import java.math.BigDecimal;

public class Budget {
    
    private BigDecimal value;
    private int numberOfItems;

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public Budget(BigDecimal value, int numberOfItems) {
        this.value = value;
        this.numberOfItems = numberOfItems;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

}
