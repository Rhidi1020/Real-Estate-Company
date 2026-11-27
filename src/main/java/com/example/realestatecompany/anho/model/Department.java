package com.example.realestatecompany.anho.model;

public class Department {
    private int departmentId;
    private String departmentName;
    private String contactEmail;

    public Department(int departmentId, String departmentName, String contactEmail) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.contactEmail = contactEmail;
    }

    public Department() {
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }

    public void receiveEscalation() {
    }

    public void handleComplaint() {
    }
}
