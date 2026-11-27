package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class PropertyViewingRequest {
    private int viewingRequestId;
    private int propertyId;
    private LocalDate preferredDate;
    private String preferredTime;
    private String status;

    public PropertyViewingRequest(int viewingRequestId, int propertyId, LocalDate preferredDate, String preferredTime, String status) {
        this.viewingRequestId = viewingRequestId;
        this.propertyId = propertyId;
        this.preferredDate = preferredDate;
        this.preferredTime = preferredTime;
        this.status = status;
    }

    public PropertyViewingRequest() {
    }

    public int getViewingRequestId() {
        return viewingRequestId;
    }

    public void setViewingRequestId(int viewingRequestId) {
        this.viewingRequestId = viewingRequestId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public LocalDate getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(LocalDate preferredDate) {
        this.preferredDate = preferredDate;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PropertyViewingRequest{" +
                "viewingRequestId=" + viewingRequestId +
                ", propertyId=" + propertyId +
                ", preferredDate=" + preferredDate +
                ", preferredTime='" + preferredTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
