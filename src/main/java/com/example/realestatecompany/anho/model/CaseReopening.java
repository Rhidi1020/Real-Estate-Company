package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class CaseReopening {
    private int reopeningId;
    private String remarks;
    private LocalDate reopeningDate;

    public CaseReopening(int reopeningId, String remarks, LocalDate reopeningDate) {
        this.reopeningId = reopeningId;
        this.remarks = remarks;
        this.reopeningDate = reopeningDate;
    }

    public CaseReopening() {
    }

    public int getReopeningId() {
        return reopeningId;
    }

    public void setReopeningId(int reopeningId) {
        this.reopeningId = reopeningId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDate getReopeningDate() {
        return reopeningDate;
    }

    public void setReopeningDate(LocalDate reopeningDate) {
        this.reopeningDate = reopeningDate;
    }

    @Override
    public String toString() {
        return "CaseReopening{" +
                "reopeningId=" + reopeningId +
                ", remarks='" + remarks + '\'' +
                ", reopeningDate=" + reopeningDate +
                '}';
    }

    public void reopenCase() {
    }

    public void validateCase() {
    }
}
