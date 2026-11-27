package com.example.realestatecompany.anho.model;

public class CustomerSupportOfficer {
    private int officerId;
    private String designation;

    public CustomerSupportOfficer(int officerId, String designation) {
        this.officerId = officerId;
        this.designation = designation;
    }

    public CustomerSupportOfficer() {
    }

    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "CustomerSupportOfficer{" +
                "officerId=" + officerId +
                ", designation='" + designation + '\'' +
                '}';
    }

    public void registerComplaint() {
    }

    public void respondFeedback() {
    }

    public void assignPriority() {
    }

    public void escalateComplaint() {
    }

    public void viewPendingCases() {
    }

    public void reopenCase() {
    }

    public void closeCase() {
    }

    public void generateRecords() {
    }


}
