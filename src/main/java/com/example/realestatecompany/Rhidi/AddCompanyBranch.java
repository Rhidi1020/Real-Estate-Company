package com.example.realestatecompany.Rhidi;

public class AddCompanyBranch {
    private String branchName;
    private String address;
    private String contactNumber;
    private String email;

    public AddCompanyBranch(String branchName, String address, String contactNumber, String email) {
        this.branchName = branchName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddCompanyDepatment{" +
                "branchName='" + branchName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


