package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class Complaint {
    private int complaintId;
    private String complaintDetails;
    private String category;
    private String priority;
    private String status;
    private LocalDate complaintDate;


    public Complaint(int complaintId, String complaintDetails, String category, String priority, String status, LocalDate complaintDate) {
        this.complaintId = complaintId;
        this.complaintDetails = complaintDetails;
        this.category = category;
        this.priority = priority;
        this.status = status;
        this.complaintDate = complaintDate;
    }

    public Complaint() {
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(LocalDate complaintDate) {
        this.complaintDate = complaintDate;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId=" + complaintId +
                ", complaintDetails='" + complaintDetails + '\'' +
                ", category='" + category + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", complaintDate=" + complaintDate +
                '}';
    }

    public void getComplaintDetail() {
    }

    public void updateComplaintStatus() {
    }

    public void updatePriority() {
    }
}
