package com.example.realestatecompany.Rhidi;

public class UpdateCompanyDetails {
    private String companyName;
    private String address;
    private String contactNumber;
    private String email;

    public UpdateCompanyDetails(String companyName, String address, String contactNumber, String email) {
        this.companyName = companyName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
        return "UpdateCompanyDetails{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
