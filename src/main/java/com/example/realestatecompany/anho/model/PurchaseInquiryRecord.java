package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class PurchaseInquiryRecord {
    private int inquiryRecordId;
    private int clientId;
    private int propertyId;
    private LocalDate inquiryDate;
    private String status;

    public PurchaseInquiryRecord(int inquiryRecordId, int clientId, int propertyId, LocalDate inquiryDate, String status) {
        this.inquiryRecordId = inquiryRecordId;
        this.clientId = clientId;
        this.propertyId = propertyId;
        this.inquiryDate = inquiryDate;
        this.status = status;
    }

    public PurchaseInquiryRecord() {
    }

    public int getInquiryRecordId() {
        return inquiryRecordId;
    }

    public void setInquiryRecordId(int inquiryRecordId) {
        this.inquiryRecordId = inquiryRecordId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public LocalDate getInquiryDate() {
        return inquiryDate;
    }

    public void setInquiryDate(LocalDate inquiryDate) {
        this.inquiryDate = inquiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PurchaseInquiryRecord{" +
                "inquiryRecordId=" + inquiryRecordId +
                ", clientId=" + clientId +
                ", propertyId=" + propertyId +
                ", inquiryDate=" + inquiryDate +
                ", status='" + status + '\'' +
                '}';
    }

    public void saveInquiry() {
    }

    public void updateInquiryStatus() {
    }
}
