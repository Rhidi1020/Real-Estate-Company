package com.example.realestatecompany.anho.model;

public class ComplaintRegistration {
    private String complaintDetails;
    private String category;
    private int propertyId;

    public ComplaintRegistration(String complaintDetails, String category, int propertyId) {
        this.complaintDetails = complaintDetails;
        this.category = category;
        this.propertyId = propertyId;
    }

    public ComplaintRegistration() {
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public String toString() {
        return "ComplaintRegistration{" +
                "complaintDetails='" + complaintDetails + '\'' +
                ", category='" + category + '\'' +
                ", propertyId=" + propertyId +
                '}';
    }

    public void registerComplaint() {
    }

    public void validateComplaint() {
    }
}
