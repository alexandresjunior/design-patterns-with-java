package com.design.patterns.store.budget;

import java.math.BigDecimal;

public class Budget {
    
    private BigDecimal value;
    private int numberOfItems;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = BigDecimal.ZERO;

        if (status.equals("IN ANALYSIS")) {
            extraDiscountValue = this.value.multiply(new BigDecimal("0.05"));
        } else if (status.equals("APPROVED")) {
            extraDiscountValue = this.value.multiply(new BigDecimal("0.02"));
        }

        // Other conditions based on budget status

        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve() {
        this.status = "APPROVED";
    }

    /**
     * Other state transition methods and rules.
     * Ex. State transition flow: IN ANALYSIS -> APPROVED/REPROVED -> FINISHED
     */

}
