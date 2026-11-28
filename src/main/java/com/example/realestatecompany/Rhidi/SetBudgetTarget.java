package com.example.realestatecompany.Rhidi;

import java.time.LocalDate;

public class SetBudgetTarget {
    private String budgetName;
    private Float targetAmount;
    private LocalDate setDate;
    private LocalDate endDate;
    private String description;

    public SetBudgetTarget(String budgetName, Float targetAmount, LocalDate setDate, LocalDate endDate, String description) {
        this.budgetName = budgetName;
        this.targetAmount = targetAmount;
        this.setDate = setDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    public Float getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Float targetAmount) {
        this.targetAmount = targetAmount;
    }

    public LocalDate getSetDate() {
        return setDate;
    }

    public void setSetDate(LocalDate setDate) {
        this.setDate = setDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SetBudgetTarget{" +
                "budgetName='" + budgetName + '\'' +
                ", targetAmount=" + targetAmount +
                ", setDate=" + setDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                '}';
    }

}
