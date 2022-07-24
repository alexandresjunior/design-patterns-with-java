package com.design.patterns.store.evaluable.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.design.patterns.store.evaluable.Evaluable;
import com.design.patterns.store.exception.BudgetStatusException;
import com.design.patterns.store.status.BudgetStatus;
import com.design.patterns.store.status.InAnalysisStatus;

public class Budget implements Evaluable {
    
    private BigDecimal value;
    private List<Evaluable> evaluables;
    private BudgetStatus status;

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }

    public Budget(BigDecimal value) {
        this.value = value;
        this.evaluables = new ArrayList<>();
        this.status = new InAnalysisStatus();
    }

    public BigDecimal getValue() {
        try {
            Thread.sleep(2000); // Simulate a delay from a external API.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public List<Evaluable> getEvaluables() {
        return evaluables;
    }

    public void setEvaluables(List<Evaluable> evaluables) {
        this.evaluables = evaluables;
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

    public void addItem(Evaluable evaluable) {
        this.value = this.value.add(evaluable.getValue());
        this.evaluables.add(evaluable);
    }

}
