package com.example.realestatecompany.anho.model;

public class PropertyComparison {
    private int comparisonId;
    private int comparisonLimit;

    public PropertyComparison(int comparisonId, int comparisonLimit) {
        this.comparisonId = comparisonId;
        this.comparisonLimit = comparisonLimit;
    }

    public PropertyComparison() {
    }

    public int getComparisonId() {
        return comparisonId;
    }

    public void setComparisonId(int comparisonId) {
        this.comparisonId = comparisonId;
    }

    public int getComparisonLimit() {
        return comparisonLimit;
    }

    public void setComparisonLimit(int comparisonLimit) {
        this.comparisonLimit = comparisonLimit;
    }

    @Override
    public String toString() {
        return "PropertyComparison{" +
                "comparisonId=" + comparisonId +
                ", comparisonLimit=" + comparisonLimit +
                '}';
    }

    public void addProperty(){

    }

    public void removeProperty(){

    }

    public void compareProperties(){

    }
}
