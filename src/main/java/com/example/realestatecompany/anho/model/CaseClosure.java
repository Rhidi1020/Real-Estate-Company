package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class CaseClosure {
    private int closureId;
    private String remarks;
    private LocalDate closureDate;

    public CaseClosure(int closureId, String remarks, LocalDate closureDate) {
        this.closureId = closureId;
        this.remarks = remarks;
        this.closureDate = closureDate;
    }

    public CaseClosure() {
    }

    public int getClosureId() {
        return closureId;
    }

    public void setClosureId(int closureId) {
        this.closureId = closureId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDate getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(LocalDate closureDate) {
        this.closureDate = closureDate;
    }

    @Override
    public String toString() {
        return "CaseClosure{" +
                "closureId=" + closureId +
                ", remarks='" + remarks + '\'' +
                ", closureDate=" + closureDate +
                '}';
    }

    public void closeCase() {
    }

    public void validateResolution() {
    }
}
