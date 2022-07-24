package com.design.patterns.store.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.design.patterns.store.budget.item.Item;
import com.design.patterns.store.exception.BudgetStatusException;
import com.design.patterns.store.status.BudgetStatus;
import com.design.patterns.store.status.InAnalysisStatus;

public class Budget {
    
    private BigDecimal value;
    private List<Item> items;
    private BudgetStatus status;

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }

    public Budget(BigDecimal value) {
        this.value = value;
        this.items = new ArrayList<>();
        this.status = new InAnalysisStatus();
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setNumberOfItems(List<Item> items) {
        this.items = items;
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

    public void addItem(Item item) {
        this.value = this.value.add(item.getValue());
        this.items.add(item);
    }

}
