package com.design.patterns.store.budget;

import java.math.BigDecimal;

import com.design.patterns.store.exception.BudgetStatusException;
import com.design.patterns.store.status.BudgetStatus;
import com.design.patterns.store.status.InAnalysisStatus;

public class Budget {
    
    private BigDecimal value;
    private int numberOfItems;
    private BudgetStatus status;

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public Budget(BigDecimal value, int numberOfItems) {
        this.value = value;
        this.numberOfItems = numberOfItems;
        this.status = new InAnalysisStatus();
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
        BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);

        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve() throws BudgetStatusException {
        this.status.approve(this);
    }

    public void reprove() throws BudgetStatusException {
        this.status.reprove(this);
    }

    public void finish() throws BudgetStatusException {
        this.status.finish(this);
    }

    

}
