package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class ServiceRecordGenerator {
    private int recordId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String recordType;

    public ServiceRecordGenerator(int recordId, LocalDate startDate, LocalDate endDate, String recordType) {
        this.recordId = recordId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recordType = recordType;
    }

    public ServiceRecordGenerator() {
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Override
    public String toString() {
        return "ServiceRecordGenerator{" +
                "recordId=" + recordId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", recordType='" + recordType + '\'' +
                '}';
    }

    public void generateRecord() {
    }

    public void filterRecords() {
    }
}
